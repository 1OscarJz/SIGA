/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JIMENEZ VILORIA
 */
public class HistorialAcademico {
    
    private int idHistorial;
    private Estudiante estudiante;
    private float promedio;

    public HistorialAcademico() {
    }

    public HistorialAcademico(int idHistorial, Estudiante estudiante, float promedio) {
        this.idHistorial = idHistorial;
        this.estudiante = estudiante;
        this.promedio = promedio;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    
    
    
}
