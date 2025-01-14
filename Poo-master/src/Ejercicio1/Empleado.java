package Ejercicio1;

import java.util.Scanner;

/**
 * Clase que representa a un empleado.
 */
public class Empleado {
    // Scanner para leer la entrada del usuario
    static Scanner scanner = new Scanner(System.in);
    // Atributos del empleado
    private String DNI;
    private String nombre;
    private String email;
    private double salarioBase = 1000;
    private int horasExtra;
    private double precioHoraExtra;

    /**
     * Constructor por defecto que inicializa la clase y llama al método metodo1.
     */
    Empleado() {
        this.metodo1();
        // this.pedirDatos(); // Comentado, se puede usar si es necesario
    }

    // Constructor con parámetros para inicializar los atributos del empleado.
    public Empleado(String DNI, String nombre, String email, double salarioBase, int horasExtra, double precioHoraExtra) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.email = email;
        this.salarioBase = salarioBase;
        this.horasExtra = horasExtra;
        this.precioHoraExtra = precioHoraExtra;
    }

    /**
     * Método para solicitar y establecer los datos del empleado.
     */
    public void metodo1() {
        System.out.println("El DNI del Empleado: ");
        String DNI = scanner.nextLine();
        this.setDNI(DNI);
        System.out.println("Nombre del Empleado");
        String nombre = scanner.nextLine();
        this.setNombre(nombre);
        System.out.println("El email del Empleado");
        String email = scanner.nextLine();
        this.setEmail(email);
        System.out.println("Horas extra del empleado: ");
        int horasExtra = scanner.nextInt();
        this.setHorasExtra(horasExtra);
    }

    /**
     * Método para calcular el salario total del empleado.
     * @return Salario total del empleado.
     */
    public double calcularSalarioTotal() {
        return this.salarioBase + (this.horasExtra * this.precioHoraExtra);
    }

    // Métodos getter y setter para los atributos del empleado
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getPrecioHoraExtra() {
        return precioHoraExtra;
    }

    public void setPrecioHoraExtra(double precioHoraExtra) {
        this.precioHoraExtra = precioHoraExtra;
    }

    // Método para obtener una representación en cadena del empleado.

    @Override
    public String toString() {
        String info = "";
        info = info + "\tNombre y DNI:  " + this.getNombre() + " (" + this.getDNI() + ")" + "\n";
        info = info + "\tEmail: " + this.getEmail() + "\n";
        info = info + "\tSalario base: " + this.getSalarioBase() + "\n";
        info = info + "\tSalario total: " + this.calcularSalarioTotal() + "\n";
        return info;
    }
}
