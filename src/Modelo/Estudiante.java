package Modelo;


public class Estudiante extends Persona{
    private String idEstudiante;
    private String carrera;
    private int semestreActual;

    public Estudiante() {
    }

    public Estudiante(String idEstudiante, String carrera, int semestreActual) {
        this.idEstudiante = idEstudiante;
        this.carrera = carrera;
        this.semestreActual = semestreActual;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestreActual() {
        return semestreActual;
    }

    public void setSemestreActual(int semestreActual) {
        this.semestreActual = semestreActual;
    }
    
    
}
