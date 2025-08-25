public class Eventos {
    private String encargado;
    private String nombreEvento;
    private String tipoEvento;
    private String fechaEvento;
    private int PersonasAsistentes;
    private int horaInicio;
    private int horaFinal;
    private boolean depositoEstado;

    public Eventos(String encargado, String nombreEvento, String tipoEvento, String fechaEvento, int personasAsistentes, int horaInicio, int horaFinal, boolean depositoEstado) {
        this.encargado = encargado;
        this.nombreEvento = nombreEvento;
        this.tipoEvento = tipoEvento;
        this.fechaEvento = fechaEvento;
        this.PersonasAsistentes = personasAsistentes;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.depositoEstado = depositoEstado;
    }
    
    public String getEncargado() { return encargado; }
    public String getNombreEvento() { return nombreEvento; }
    public String getTipoEvento() { return tipoEvento; }
    public String getFechaEvento() { return fechaEvento; }
    public int getPersonasAsistentes() { return PersonasAsistentes; }
    public int getHoraInicio() { return horaInicio; }
    public int getHoraFinal() { return horaFinal; }
    public boolean isDeposito() { return depositoEstado; }
    public void setDepositoEstado(boolean depositoEstado) { this.depositoEstado = depositoEstado; }

}
