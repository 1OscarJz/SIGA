package Modelo;

public class Programa {
    private String codProg;
    private String nomProg;
    private Facultad facultad;

    public Programa() {
    }

    public Programa(String codProg, String nomProg) {
        this.codProg = codProg;
        this.nomProg = nomProg;
        this.facultad = facultad;
    }

    public String getCodProg() {
        return codProg;
    }

    public void setCodProg(String codProg) {
        this.codProg = codProg;
    }

    public String getNomProg() {
        return nomProg;
    }

    public void setNomProg(String nomProg) {
        this.nomProg = nomProg;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
    
    
    
}
