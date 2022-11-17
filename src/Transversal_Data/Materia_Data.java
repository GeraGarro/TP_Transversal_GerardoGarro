
package Transversal_Data;

import Transversal_Entidades.ConexionTransversal;
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


public class Materia_Data {
     private Connection conx;

 public Materia_Data(){
       this.conx=ConexionTransversal.getConexion();
       }
public void guardarMateria(Materia ma) {
        String query = "INSERT INTO `materia`(`nombre`, `anio`, `activo`) VALUES (?,?,?)";
        
        try {
           PreparedStatement ps = conx.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ma.getNombre());
            ps.setString(2, ma.getAnio());
            ps.setBoolean(3, ma.isActivo());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se agrego la Materia");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar en la bd");
            }
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ma.setIdMateria(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo recuperar el ID de la materia");
                ps.close();
            }
             ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Materia_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia obtenerMateria(int id) {
        Materia ma = new Materia();
        String sql = "SELECT * FROM `materia` WHERE idMateria = ?";
       
        try {
           PreparedStatement ps = conx.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ma = new Materia();
                ma.setIdMateria(rs.getInt("idMateria"));
                ma.setNombre(rs.getString("nombre"));
                ma.setAnio(rs.getString("anio"));
                ma.setActivo(rs.getBoolean("activo"));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Materia_Data.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        return ma;
    }

    public ArrayList<Materia> listarMaterias() {
        ArrayList<Materia> materias = new ArrayList<>();
        Materia ma = new Materia();
        String sql = "SELECT * FROM `materia`";
        PreparedStatement ps = null;
        try {
            ps = conx.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ma = new Materia();
                ma.setIdMateria(rs.getInt("idMateria"));
                ma.setNombre(rs.getString("nombre"));
                ma.setAnio(rs.getString("anio"));
                ma.setActivo(rs.getBoolean("activo"));
                materias.add(ma);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Materia_Data.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(Alumno_Data.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return materias;
    }

    public void actualizarMateria(Materia ma) {
        String sql = "UPDATE `materia` SET `nombre`= ? ,`anio`= ? ,`activo`=? WHERE idMateria=?";
        
        try {
           PreparedStatement ps = conx.prepareStatement(sql);
            
            ps.setString(1, ma.getNombre());
            ps.setString(2,ma.getAnio());
            ps.setBoolean(3, ma.isActivo());
            ps.setInt(4, ma.getIdMateria());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "La Materia fue actualizado");
          ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La Materia fue NO fue actualizado");
            Logger.getLogger(Materia_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void CambioEstadoMateria(int idMa) {
        String sql = "UPDATE `materia` SET `activo`= 0 WHERE `idMateria` = "+idMa;
       
        try {
            PreparedStatement ps = conx.prepareStatement(sql);                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "La Materia fue suspendida");
              ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La Materia NO fue Suspendida");
            Logger.getLogger(Materia_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarMateria(int idMa) {
        String sql = "DELETE FROM materia WHERE `materia`.`idMateria` ="+idMa;
       
        try {
            PreparedStatement ps = conx.prepareStatement(sql);                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "La Materia con id "+idMa+" fue Eliminada de la Base de Datos");
              ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La Materia NOpudo ser Eliminada");
            Logger.getLogger(Materia_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}




