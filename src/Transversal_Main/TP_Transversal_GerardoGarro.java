package Transversal_Main;

import Transversal_Entidades.Alumno;
import Transversal_Entidades.ConexionTransversal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TP_Transversal_GerardoGarro {

   
    public static void main(String[] args) {
        
      Alumno a1=new Alumno("Gerado","Garro",LocalDate.of(1993, Month.MAY, 9),"35315399",true);  
        
        
        
        
        
        
        
        
        
        
        
        
        /*try {
       
           Alumno n1=new Alumno();
            n1.setNombre("Zoe");
            n1.setApellido("Acevedo");
            n1.setDni("4112335");
            n1.setFechaNacimiento(LocalDate.of(1998, Month.MARCH, 21));
            n1.setActivo(true);
        
           String sql="INSERT INTO `alumno`(`nombre`, `apellido`, `fechaNacimiento`, `dni`, `activo`) VALUES (?,?,?,?,?);";
            
           Connection con=ConexionTransversal.getConexion();   
           PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           
            ps.setString(1, n1.getNombre());
            ps.setString(2, n1.getApellido());
            ps.setString(4, n1.getDni());
            ps.setDate(3, java.sql.Date.valueOf(n1.getFechaNacimiento()));
            ps.setBoolean(5, n1.isActivo());
            
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
            n1.setIdAlumno(nuevaClave);
            }
            System.out.println(n1);
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "!ERROR! SQL falla al Agregar Alumno");
        }*/
 
       
       

    
    
    }
    
}
