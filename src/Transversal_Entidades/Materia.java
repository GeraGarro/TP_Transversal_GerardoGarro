package Transversal_Entidades;

import java.time.LocalDate;

public class Materia {

    private int idMateria;

    private String nombre;

    private String apellido;

    private LocalDate fechaNacimiento;

    private String dni;

    private boolean activo;

    public Materia(int idMateria, String nombre, String apellid, LocalDate fechaNacimiento, String dni, boolean activo) {
    }

    public Materia(String nombre, String apellid, LocalDate fechaNacimiento, String dni, boolean activo) {
    }

    public Materia() {
    }

    public void getterAtributos() {
    }

    public void setterAtributos() {
    }

    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
