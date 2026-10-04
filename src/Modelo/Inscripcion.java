package Modelo;


public class Inscripcion {
    private int idInscripcion;
    private Estudiante estudiante;
    private Asignatura asignatura;
    private String semestre;    //ej: 2026-2

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
    private String fechaInscripcion;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, Estudiante estudiante, Asignatura asignatura, String semestre, String fechaInscripcion) {
        this.idInscripcion = idInscripcion;
        this.estudiante = estudiante;
        this.asignatura = asignatura;
        this.semestre = semestre;
        this.fechaInscripcion = fechaInscripcion;
    }
    
    
    
}
