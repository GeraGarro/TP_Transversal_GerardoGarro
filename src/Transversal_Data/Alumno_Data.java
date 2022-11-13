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
            ps.setDate(3, java.sql.Date.valueOf(alumno.getFechaNacimiento()));
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


}


