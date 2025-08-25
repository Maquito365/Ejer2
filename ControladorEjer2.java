
import java.util.List;

public class ControladorEjer2 {
    private Salones[] salones;
    private List<Reservación> reservaciones;
    private List<Reservación> listaEspera;

    public ControladorEjer2(Salones[] salones) {
        this.salones = salones;
        this.reservaciones = new java.util.ArrayList<>();
        this.listaEspera = new java.util.ArrayList<>();
    }

    public void registroReservacion (Eventos evento){
        for (Salones salon : salones){
            if (salon.isDisponibilidad() && evento.isDeposito() && evento.getPersonasAsistentes() <= salon.getCapacidad() && (!salon.getTipo().equals("Grande") || evento.getTipoEvento().equalsIgnoreCase("VIP"))){
                salon.setDisponibilidad(false);
                Reservación reservacion = new Reservación(evento, salon, "Reservación Confirmada: ");
                reservaciones.add(reservacion);
                System.out.println("Reservación confirmada para el evento: " + evento.getNombreEvento() + " en el salón: " + salon.getNumero());
                return;
            }
        }

        Reservación reservación = new Reservación(evento, null, "En lista de espera: ");
        listaEspera.add(reservación);
        System.out.println("No hay salones disponibles. El evento: " + evento.getNombreEvento() + " ha sido añadido a la lista de espera");
    }
    
    public void mostrarReservaciones(){
    System.out.println("--- Reservaciones Actuales---");
    for( Reservación reservación : reservaciones){
        System.out.println(reservación);
    }

    }

    public void mostrarListaEspera(){
        System.out.println("--- Lista de Espera ---");
        for( Reservación reservación : listaEspera){
            System.out.println(reservación);
        }
    }
}
