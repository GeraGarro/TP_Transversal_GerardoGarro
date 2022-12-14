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
    this.idAlumno=idAlumno;
    this.nombre=nombre;
    this.apellido=apellido;
    this.fechaNacimiento=fechaNacimiento;
    this.dni=dni;
    this.activo=activo;
    }

    public Alumno(String nombre, String apellido, LocalDate fechaNacimiento, String dni, boolean activo) {
    this.nombre=nombre;
    this.apellido=apellido;
    this.fechaNacimiento=fechaNacimiento;
    this.dni=dni;
    this.activo=activo;}

    public Alumno() {
    }


    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.idAlumno;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return this.idAlumno == other.idAlumno;
    }
    @Override
    public String toString() {
        return nombre +" "+ apellido;
    }

  
    
}