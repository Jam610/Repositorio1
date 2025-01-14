package Herencia;

import java.util.Scanner;

//no podemos hacer un new de Vehiculo pero sí de las subclases: coche moto y camion
public abstract class Vehiculo {
    static Scanner scanner = new Scanner(System.in);
    private String marca;
    private String modelo;
    protected int nRuedas;
    protected int velocidad;
    protected int potencia;
    private int kmTotales = 0;

    Vehiculo() {
        //this.pedirDatos();
    }
    Vehiculo(String marca, String modelo, int nR, int vel, int pot) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPotencia(pot);
        this.setVelocidad(vel);
        this.setnRuedas(nR);
    }

    public void metodo1() {
        System.out.print("Introduce la marca del vehículo: ");
        String marca = scanner.nextLine();
        this.setMarca(marca);
        System.out.print("Introduce el modelo del vehículo: ");
        String modelo = scanner.nextLine();
        this.setModelo(modelo);
        System.out.print("Introduce la potencia del vehículo: ");
        int potencia = scanner.nextInt();
        this.setPotencia(potencia);
        System.out.print("Introduce la velocidad del vehículo: ");
        int velocidad = scanner.nextInt();
        this.setVelocidad(velocidad);
        System.out.print("Introduce las ruedas del vehículo: ");
        int ruedas = scanner.nextInt();
        this.setnRuedas(ruedas);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getnRuedas() {
        return nRuedas;
    }

    public void setnRuedas(int nRuedas) {
        this.nRuedas = nRuedas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getKmTotales() {
        return kmTotales;
    }

    public void setKmTotales(int kmTotales) {
        this.kmTotales = kmTotales;
    }

    //Va recorriendo los kilómetros recorridos
    public void recorre(int km) {
        kmTotales = kmTotales + km;
    }

    public String toString() {
        String info = "";
        info = info + "\n" + this.getMarca() + "/" + this.getModelo() + "\n";
        info = info + "-------------------------------------------" + "\n";
        info = info + "\tRuedas:" + getnRuedas() + "\n";
        info = info + "\tVelocidad: " + getVelocidad() + " m/s \n";
        info = info + "\tPotencia: " + getPotencia() + "kw \n";
        return info;
    }
}
