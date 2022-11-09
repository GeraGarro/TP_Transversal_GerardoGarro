package Transversal_Entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexionTransversal {
  private static String url="jdbc:mysql://localhost/universidad";
  private static String usuario="root";
  private static String password="";
  private static ConexionTransversal conexion=null;

private ConexionTransversal(){
    try {
      Class.forName("org.mariadb.jdbc.Driver");
      
    } catch (ClassNotFoundException e) {
        JOptionPane.showMessageDialog(null, "Error de Conexion por falta de Driver");
    
    }
    
}

public static Connection getConexion(){
  
    Connection conx=null;
    
    if (conexion== null){
      conexion=new ConexionTransversal();
      
      JOptionPane.showMessageDialog(null,"Conexion Exitosa a Base Datos Transversal");
  }
    try {
        conx=DriverManager.getConnection(url+ "?useLegacyDatetimeCode=false&serverTimezone=UTC" + "&user=" + usuario + "&password=" + password);
    } catch (SQLException e) {  
    JOptionPane.showMessageDialog(null, "Error De Conexion");
    }
    return conx;
   
}
}
