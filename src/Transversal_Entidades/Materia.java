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

    /* @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.idMateria;
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
        final Materia other = (Materia) obj;
        return this.idMateria == other.idMateria;
    }*/

    @Override
    public String toString() {
        return nombre;
    }
    
  
    
}
