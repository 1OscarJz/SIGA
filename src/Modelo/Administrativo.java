package Modelo;


public class Administrativo extends Persona {
    private String cargo;
    private String departamento;

    public Administrativo() {
        
    }

    public Administrativo(String cargo, String departamento) {
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
}
