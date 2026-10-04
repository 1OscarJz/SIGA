package Modelo;


public class Horario {
    private String dia;
    private int idHorario;
    private String salon;
    private String horaInicio;
    private String horaFin;

    public Horario() {
    }

    public Horario(String dia, int idHorario, String salon, String horaInicio, String horaFin) {
        this.dia = dia;
        this.idHorario = idHorario;
        this.salon = salon;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }
    
    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    
    
   
    
}
