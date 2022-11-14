package Transversal_Entidades;

public class Inscripcion {

    private int idInscripcion;

    private Alumno iDdAlumno;

    private Materia idMateria;

    private float nota;

    public Inscripcion(int idInscripcion, Alumno alumno, Materia materia, float nota) {
        this.idInscripcion=idInscripcion;
        this.iDdAlumno=alumno;
        this.idMateria=materia;
        this.nota=nota;
    }

    public Inscripcion(Alumno alumno, Materia materia, float nota) {
        this.iDdAlumno=alumno;
        this.idMateria=materia;
        this.nota=nota;}

    public Inscripcion() {
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getIdAlumno() {
        return iDdAlumno;
    }

    public void setAlumno(Alumno alumno) {
        this.iDdAlumno = alumno;
    }

    public Materia getMateria() {
        return idMateria;
    }

    public void setMateria(Materia materia) {
        this.idMateria = materia;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idInscripcion=" + idInscripcion + ", alumno=" + iDdAlumno + ", materia=" + idMateria + ", nota=" + nota + '}';
    }

    
}
