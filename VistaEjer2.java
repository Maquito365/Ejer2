import java.util.Scanner;
public class VistaEjer2 {
    private ControladorEjer2 controlador;
    private Scanner scanner;

    public VistaEjer2(ControladorEjer2 controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }

    public void Menu(){
        boolean salir = false;
        while(!salir) {
            System.out.println("\n--- Menú Reservaciones ---");
            System.out.println("1. Crear nueva reservación");
            System.out.println("2. Ver reservaciones confirmadas");
            System.out.println("3. Ver lista de espera");
            System.out.println("4. Salir");
            int op = scanner.nextInt(); scanner.nextLine();

            switch (op){
                case 1: crearReservacion(); 
                case 2: controlador.mostrarReservaciones(); break;
                case 3: controlador.mostrarListaEspera(); break;
                case 4: salir = true; break;
            }
        }
    }
    public void crearReservacion(){
        System.out.print("Encargado: "); String encargado = scanner.nextLine();
        System.out.print("Nombre del Evento: "); String nEvento = scanner.nextLine();
        System.out.print("Tipo de Evento (Normal/VIP): "); String tipoEvento = scanner.nextLine();
        System.out.print("Fecha (dd/mm/aaaa): "); String fecha = scanner.nextLine();
        System.out.print("Personas: "); int personas = scanner.nextInt();
        System.out.print("Hora inicio: "); int hIncial = scanner.nextInt();
        System.out.print("Hora final: "); int hFinal = scanner.nextInt();
        System.out.print("¿Depósito pagado? (true/false): "); boolean depPagado = scanner.nextBoolean();
        
        Eventos evento = new Eventos(encargado, nEvento, tipoEvento, fecha, personas, hIncial, hFinal, depPagado);
        controlador.registroReservacion(evento);
    }
    
    
}
