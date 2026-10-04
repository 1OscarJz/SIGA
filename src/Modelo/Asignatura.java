package Modelo;


public class Asignatura {
    private String codAsignatura;
    private String nomAsignatura;
    private int creditos;

    public Asignatura() {
    }

    public Asignatura(String codAsignatura, String nomAsignatura, int creditos) {
        this.codAsignatura = codAsignatura;
        this.nomAsignatura = nomAsignatura;
        this.creditos = creditos;
    }

    public String getCodAsignatura() {
        return codAsignatura;
    }

    public void setCodAsignatura(String codAsignatura) {
        this.codAsignatura = codAsignatura;
    }

    public String getNomAsignatura() {
        return nomAsignatura;
    }

    public void setNomAsignatura(String nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
    
}
