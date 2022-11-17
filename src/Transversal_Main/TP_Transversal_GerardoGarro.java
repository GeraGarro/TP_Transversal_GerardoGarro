package Transversal_Main;

import Transversal_Data.Alumno_Data;
import Transversal_Data.Inscripcion_Data;
import Transversal_Data.Materia_Data;
import Transversal_Entidades.Alumno;
import Transversal_Entidades.ConexionTransversal;
import Transversal_Entidades.Inscripcion;
import Transversal_Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TP_Transversal_GerardoGarro {

   
    public static void main(String[] args) {
        
  Alumno a1=new Alumno(12,"Rolando", "Garro", LocalDate.of(1949, Month.MARCH, 17), "14144735", true);
  // Alumno a2=new Alumno("Gerardo", "Garro", LocalDate.of(1960, Month.OCTOBER, 04), "35315399", true);
   //Alumno a3=new Alumno("Zoe", "Acevedo", LocalDate.of(1988, Month.OCTOBER, 27), "41258001", true);
  // Alumno_Data aD=new Alumno_Data();
  // aD.modificarAlumno(a1);
   Inscripcion_Data iD=new Inscripcion_Data();
       // for (Materia mat : iD.obtenerMateriasInscriptas(a1)) {
       //     System.out.println(mat);
        //}
       for (Materia mat : iD.obtenerMateriasNoInscriptas(a1)) {
            System.out.println(mat);
        }
        
       /* aD.eliminarAlumno(5);
        aD.eliminarAlumno(7);
     aD.guardarAlumno(a1);
       aD.guardarAlumno(a2);
       aD.guardarAlumno(a3);
       aD.obtenerAlumno(1);  
        
       Materia m1=new Materia(20,"Microbiologia","primero",true);
          Materia m2=new Materia("Naturales","Segundo",true);
        Materia m3=new Materia("Programacion","Cuarto",true);
        Materia m4=new Materia("Ingles","Primero",true);
        
        Materia_Data mD1=new Materia_Data();
         mD1.actualizarMateria(m1);
       mD1.guardarMateria(m1);
       mD1.guardarMateria(m2);
        mD1.guardarMateria(m3);
        mD1.guardarMateria(m4);*/
       
        //mD1.eliminarMateria(30);
       // mD1.eliminarMateria(10);
       // mD1.eliminarMateria(11);
       // mD1.eliminarMateria(12);
        //System.out.println("La materia es:"+mD1.obtenerMateria(8));
        
        
        /*Inscripcion_Data iD=new Inscripcion_Data();
        Inscripcion ins1=new Inscripcion(a1,m1,0);
         Inscripcion ins2=new Inscripcion(a1,m2,0);
         Inscripcion ins3=new Inscripcion(a1,m3,0);
         Inscripcion ins4=new Inscripcion(a2,m1,0);
          Inscripcion ins5=new Inscripcion(a3,m3,0);
        
        iD.guardarInscripcion(ins1);
        iD.guardarInscripcion(ins2);
     iD.guardarInscripcion(ins3);
           iD.guardarInscripcion(ins4);
     iD.guardarInscripcion(ins5);*/
 
   }
   
 
}
