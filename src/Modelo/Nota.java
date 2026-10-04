package Modelo;


public class Nota {
    private String idNota;
    private float nota;
    private String fechaRegistro;

    public Nota() {
    }

    public Nota(String idNota, float nota, String fechaRegistro) {
        this.idNota = idNota;
        this.nota = nota;
        this.fechaRegistro = fechaRegistro;
    }

    public String getIdNota() {
        return idNota;
    }

    public void setIdNota(String idNota) {
        this.idNota = idNota;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    
    
}
