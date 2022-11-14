package Transversal_Data;

import Transversal_Entidades.Alumno;
import Transversal_Entidades.ConexionTransversal;
import Transversal_Main.TP_Transversal_GerardoGarro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.util.ArrayList;

public class Alumno_Data {
   private Connection conx;
   
   public Alumno_Data(){
       this.conx=ConexionTransversal.getConexion();
       }
   
   public void guardarAlumno(Alumno alumno){
        
      String sql="INSERT INTO `alumno`(`nombre`, `apellido`, `fechaNacimiento`, `dni`, `activo`) VALUES (?, ?, ?, ?, ?)";
          
       try {

         PreparedStatement ps = conx.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setString(4, alumno.getDni());
            ps.setDate(3, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5,alumno.isActivo());
           String mensaje;
            int nuevoRegistro=ps.executeUpdate();
        
            if(nuevoRegistro>0){
            
                mensaje="Registro Agregado";
            }
            else{
                mensaje="No se puedo Agregar el registro";
            }
            
            JOptionPane.showMessageDialog(null, mensaje);
        
            ResultSet as =ps.getGeneratedKeys();
           
            if(as.next()){
              int nuevaClave= as.getInt("idAlumno");
            alumno.setIdAlumno(nuevaClave);
            }
            System.out.println(alumno);
        } catch (SQLException ex) {
        //JOptionPane.showMessageDialog(null, ex);
        Logger.getLogger(TP_Transversal_GerardoGarro.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

public Alumno obtenerAlumno(int idAlumno){
    
  String sql= "SELECT * FROM `alumno` WHERE activo=1 AND idAlumno=?;";
  
  Alumno al=new Alumno();
      
       try {
           PreparedStatement ps=conx.prepareStatement(sql);
           ps.setInt(1, idAlumno);
           ResultSet rs=ps.executeQuery();
           
           if(rs.next()){
             al.setIdAlumno(idAlumno);
             al.setNombre(rs.getString("nombre"));
             al.setApellido(rs.getString("apellido"));
             al.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
             al.setDni(rs.getString("dni"));
             al.setActivo(rs.getBoolean("activo"));
           
           }
           ps.close();
           
           JOptionPane.showMessageDialog(null, al);
       } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, ex);
        }
      
  return al;
}
public void eliminarAlumno(int idAlumno){
    int resultado=0;
    String sql="DELETE FROM `alumno` WHERE activo=1 and idAlumno="+idAlumno;
    try {
        PreparedStatement ps=conx.prepareStatement(sql);
        resultado=ps.executeUpdate();
        if(resultado>0){
            JOptionPane.showMessageDialog(null, "Registro Eliminado","Eliminar",JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        ps.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "error al eliminar","actualizar",JOptionPane.ERROR_MESSAGE);
    }
    

}

public void modificarAlumno(Alumno al){
       
               String sql="UPDATE `alumno` SET `nombre`='[value-2]',`apellido`='[value-3]',`fechaNacimiento`='[value-4]',`Dni`='[value-5]',`activo`='[value-6]' WHERE idAlumno=?";

    try {
           PreparedStatement ps=conx.prepareStatement(sql);
           ps.setString(1, al.getNombre());
           ps.setString(2, al.getApellido());
           ps.setDate(3,Date.valueOf(al.getFechaNacimiento()));
           ps.setString(4, al.getDni());
           ps.setBoolean(5, al.isActivo());
       
      int mod= ps.executeUpdate();
        if(mod>0){
          JOptionPane.showConfirmDialog(null, "Modificacion exitosa");
            
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo realizar Modoificacion");
        }
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en el modificador");
       }
    
}

 public ArrayList<Alumno> listadoAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        Alumno al = null;
        String sql = "SELECT * FROM `alumno`";
        PreparedStatement ps = null;
        try {
            ps = conx.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                al = new Alumno();
                al.setIdAlumno(rs.getInt("idalumno"));
                al.setDni(rs.getString("dni"));
                al.setNombre(rs.getString("nombre"));
                al.setApellido(rs.getString("apellido"));
                al.setFechaNacimiento(rs.getDate("fechaDeNacimiento").toLocalDate());
                al.setActivo(rs.getBoolean("estado"));
                alumnos.add(al);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Alumno_Data.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(Alumno_Data.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return alumnos;
    }

}



