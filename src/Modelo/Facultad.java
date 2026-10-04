package Modelo;


public class Facultad {
    private String codFac;
    private String nomFac;

    public Facultad() {
    }

    public Facultad(String codFac, String nomFac) {
        this.codFac = codFac;
        this.nomFac = nomFac;
    }

    public String getCodFac() {
        return codFac;
    }

    public void setCodFac(String codFac) {
        this.codFac = codFac;
    }

    public String getNomFac() {
        return nomFac;
    }

    public void setNomFac(String nomFac) {
        this.nomFac = nomFac;
    }
    
    
    
}
