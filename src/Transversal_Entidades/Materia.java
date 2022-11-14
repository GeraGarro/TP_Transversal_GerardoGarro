package Transversal_Entidades;

import java.time.LocalDate;

public class Materia {

    private int idMateria;

    private String nombre;

    private String anio;
    
    private boolean activo;

    public Materia(int idMateria, String nombre,String anio, boolean activo) {
        this.idMateria=idMateria;
        this.nombre=nombre;
        this.anio=anio;
        this.activo=activo;
    }

    public Materia( String nombre,String anio, boolean activo) {
        this.nombre=nombre;
        this.anio=anio;
        this.activo=activo;}

    public Materia() {
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Materia{" + "id:" + idMateria + ", Nombre de Materia:" + nombre + ", Año=" + anio + ", Estado" + activo + '}';
    }
    
  
    
}
