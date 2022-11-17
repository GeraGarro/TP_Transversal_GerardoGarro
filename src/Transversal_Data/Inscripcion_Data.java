
package Transversal_Data;

import Transversal_Entidades.Alumno;
import Transversal_Entidades.ConexionTransversal;
import Transversal_Entidades.Inscripcion;
import Transversal_Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Inscripcion_Data {
   private Connection conx;

 public Inscripcion_Data(){
       this.conx=ConexionTransversal.getConexion();
       }
 
 
 public void guardarInscripcion(Inscripcion ins) {
        String sql = "INSERT INTO `inscripcion`(`idAlumno`, `idMateria`, `nota`) VALUES ( ?, ?, ?)";
        try {
           PreparedStatement ps = conx.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ins.getAlumno().getIdAlumno());
            ps.setInt(2, ins.getMateria().getIdMateria());
            ps.setFloat(3, ins.getNota());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se registro la Inscripcion");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar en la base de datos");
            }
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ins.setIdInscripcion(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo recuperar el ID de la inscripcion");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar la inscripcion");
            Logger.getLogger(Inscripcion_Data.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    public Inscripcion buscarInscripcion(int id) {  //(idalumno, idmateria)?
        Inscripcion ins = new Inscripcion();
        String sql = "SELECT * FROM `inscripcion` WHERE `idInscripcion` = ?";
       
        try {
            PreparedStatement ps = conx.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno_Data aluData=new Alumno_Data();
                Materia_Data matData=new Materia_Data();
                ins.setIdInscripcion(rs.getInt("idInscripcion"));
                ins.setAlumno(aluData.obtenerAlumno(rs.getInt("idAlumno")));
                ins.setMateria(matData.obtenerMateria(rs.getInt("idMateria")));
                ins.setNota(rs.getFloat("nota"));
                ps.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Inscripcion_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ins;
    }
 
public ArrayList<Inscripcion> listarInscriptos() {
        ArrayList<Inscripcion> listaIns = new ArrayList<>();
        Inscripcion ins = null;
        String sql = "SELECT * FROM `inscripcion`";
        PreparedStatement ps = null;
        try {
            ps = conx.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ins=new Inscripcion();
                Alumno_Data aD=new Alumno_Data();
                Materia_Data mD=new Materia_Data();
                        
                ins.setIdInscripcion(rs.getInt("idInscripcion"));
                ins.setAlumno(aD.obtenerAlumno(rs.getInt("idAlumno")));
                ins.setMateria(mD.obtenerMateria(rs.getInt("idMateria")));
                ins.setNota(rs.getFloat("nota"));
                listaIns.add(ins);
            }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Materia_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaIns;
    }
    public void actualizaInscripcion(Inscripcion ins) { //O actualizar nota?
        String sql = "UPDATE `inscripcion` SET `idAlumno`=?,`idMateria`=?,`nota`=? WHERE `idInscripcion`=?";
PreparedStatement ps = null;
        try {
            ps = conx.prepareStatement(sql);
            ps.setInt(1, ins.getAlumno().getIdAlumno());
            ps.setInt(2, ins.getMateria().getIdMateria());
            ps.setFloat(3, ins.getNota());
            ps.setInt(4, ins.getIdInscripcion());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "La Inscricpion fue actualizada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La Inscripcion NO fue actualizada");
            Logger.getLogger(Materia_Data.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(Alumno_Data.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void borrarInscripcion(int id) { //(idalumno, idmateria)?
        String sql = "DELETE FROM `inscripcion` WHERE idInscripcion = ?";
        
        try {
           PreparedStatement ps = conx.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "La Inscripcion fue borrada");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La Inscripcion NO pudo ser borrada");
            Logger.getLogger(Materia_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Materia> obtenerMateriasInscriptas(Alumno al) { 
        ArrayList<Materia> materias = new ArrayList<>();
        Materia_Data matData = new Materia_Data();
        Materia mat = null;
        String sql = "SELECT * FROM `inscripcion` where idAlumno = ?";
      
        try {
           PreparedStatement ps = conx.prepareStatement(sql);
            ps.setInt(1, al.getIdAlumno());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mat = matData.obtenerMateria(rs.getInt("idMateria"));
                materias.add(mat);
             ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inscripcion_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materias;
    }

    public ArrayList<Materia> obtenerMateriasNoInscriptas(Alumno al) { //revisar metodo
        Materia_Data matData = new Materia_Data();
        ArrayList<Materia> materias = new ArrayList<>();
        Materia mat = null;
        String sql = "SELECT * FROM `inscripcion` where idAlumno != ?";
       
        try {
           PreparedStatement ps = conx.prepareStatement(sql);
            ps.setInt(1, al.getIdAlumno());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mat = matData.obtenerMateria(rs.getInt("idMateria"));
                materias.add(mat);
            
             ps.close();}
            
        } catch (SQLException ex) {
            Logger.getLogger(Inscripcion_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materias;
    }

    public ArrayList<Alumno> obtenerAlumnosInscriptos(Materia mat) { //revisar metodo
        ArrayList<Alumno> alumnos = new ArrayList<>();
        Alumno_Data alData = new Alumno_Data();
        Alumno al = null;
        String sql = "SELECT * FROM `inscripcion` WHERE idMateria= ?";
        
        try {
           PreparedStatement ps = conx.prepareStatement(sql);
            ps.setInt(1, mat.getIdMateria());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                al = alData.obtenerAlumno(rs.getInt("idAlumno"));
                alumnos.add(al);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Inscripcion_Data.class.getName()).log(Level.SEVERE, null, ex);
   
        }
        return alumnos;
    }

 
 
}
