public class Salones{
    private int numero;
    private String tipo;
    private int capacidad;
    private boolean disponibilidad;
    private double precio;

    public Salones(int numero, String tipo, int capacidad, boolean disponibilidad, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
    }

    public int getNumero() { return numero; }
    public String getTipo() { return tipo; }
    public int getCapacidad() { return capacidad; }
    public boolean isDisponibilidad() { return disponibilidad; }
    public void setDisponibilidad(boolean disponibilidad) { this.disponibilidad = disponibilidad; }
    public double setPrecio() { return precio; }
    
    @Override
    public String toString() {
        return "Salón # " + numero + " (" + tipo + "), Capacidad: " + capacidad + ", Precio:  Q " + precio + ", Disponible: " + disponibilidad; 
    }
}
