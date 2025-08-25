public class Reservación {
    private Eventos evento;
    private Salones salon;
    private String estadoReservacion;

    public Reservación(Eventos evento, Salones salon, String estadoReservacion) {
        this.evento = evento;
        this.salon = salon;
        this.estadoReservacion = estadoReservacion;
    }

    public Eventos getEvento() { return evento; }
    public Salones getSalon() { return salon; }
    public String getEstadoReservacion() { return estadoReservacion; }

    public void setSalon(Salones salon) { this.salon = salon; }
    public void setEstado(String estadoReservacion) { this.estadoReservacion = estadoReservacion; }

    @Override
    public String toString(){
        String SalonStr = (salon != null) ? salon.toString() : "No tienes ningun salón asignado.";
        return estadoReservacion + evento.getNombreEvento() + "Encargado: " + evento.getEncargado()+ "Fecha: " + evento.getFechaEvento() + evento.getHoraInicio()+ " :00- " + evento.getHoraFinal() + ":00-"+ "Personas: " + evento.getPersonasAsistentes() + "\n" + SalonStr;
    }
}
