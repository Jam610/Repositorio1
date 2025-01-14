package Herencia;

public class Camion extends Vehiculo {
    private int capacidadCarga;

    Camion() {
        super.metodo1();
        this.metodo1();
    }

    Camion(String marca, String modelo, int ruedas, int velocidad, int potencia, int capacidadCarga) {
        super(marca, modelo, ruedas, velocidad, potencia);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void metodo1() {
        System.out.print("¿Cuál es la capacidad de carga del camión (en toneladas)?: ");
        int capacidad = scanner.nextInt();
        this.setCapacidadCarga(capacidad);
        System.out.print("¿Cuánto ha recorrido el camión?: ");
        int kmTotales = scanner.nextInt();
        this.setKmTotales(kmTotales);
        System.out.println("=====================================");
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        String info = super.toString();
        info += "\tCapacidad de carga: " + this.getCapacidadCarga() + " toneladas\n";
        info += "\tKmTotales: " + this.getKmTotales() + "\n";
        return info;
    }
}
