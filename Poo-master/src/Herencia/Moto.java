package Herencia;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    Moto() {
        super.metodo1();
        this.metodo1();
    }

    Moto(String marca, String modelo, int ruedas, int velocidad, int potencia, boolean tieneSidecar) {
        super(marca, modelo, ruedas, velocidad, potencia);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void metodo1() {
        System.out.print("¿Tiene sidecar la moto? (true/false): ");
        boolean sidecar = scanner.nextBoolean();
        this.setTieneSidecar(sidecar);
        System.out.print("¿Cuánto ha recorrido la moto?: ");
        int kmTotales = scanner.nextInt();
        this.setKmTotales(kmTotales);
        System.out.println("=====================================");
    }

    public boolean getTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public String toString() {
        String info = super.toString();
        info += "\tTiene sidecar: " + this.getTieneSidecar() + "\n";
        info += "\tKmTotales: " + this.getKmTotales() + "\n";
        return info;
    }
}
