package Transversal_Entidades;

import java.time.LocalDate;

public class Alumno {

    private int idAlumno;

    private String nombre;

    private String apellido;

    private LocalDate fechaNacimiento;

    private String dni;

    private boolean activo;

    public Alumno(int idAlumno, String nombre, String apellido, LocalDate fechaNacimiento, String dni, boolean activo) {
    }

    public Alumno(String nombre, String apellido, LocalDate fechaNacimiento, String dni, boolean activo) {
    }

    public Alumno() {
    }

    public void getterAtributos() {
    }

    public void setterAtributos() {
    }

    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
