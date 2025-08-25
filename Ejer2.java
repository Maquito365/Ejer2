public class Ejer2 {
    public static void main(String[] args) {
        Salones [] salones = {
            new Salones(1, "Grande", 300, true, 4500),
            new Salones(2, "Pequeño", 130, true, 1000),
            new Salones(3, "Mediano", 200, true, 2500),
            new Salones(4, "Grande", 500, true, 7000)
        };

        ControladorEjer2 controlador = new ControladorEjer2(salones);
        VistaEjer2 vista = new VistaEjer2(controlador);
        vista.Menu();
    }
}
