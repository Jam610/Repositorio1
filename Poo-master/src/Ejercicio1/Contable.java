package Ejercicio1;

public class Contable extends Empleado {
    private double plusSalario;

    public Contable() {
        // Inicializar con valores predeterminados
        super.metodo1();
        this.metodo1();
        this.plusSalario = 200;
    }

    public Contable(String DNI, String nombre, String email, double salarioBase, int horasExtra, double precioHoraExtra, int numDespacho, double plusSalario) {
        // Llamar al constructor del padre
        super(DNI, nombre, email, salarioBase, horasExtra, precioHoraExtra);
        this.plusSalario = plusSalario;
    }

    @Override
    public void metodo1() {

    }
    public double getPlusSalario() {
        return this.plusSalario;
    }

    public void setPlusSalario(double plusSalario) {
        this.plusSalario = plusSalario;
    }

    @Override
    public double calcularSalarioTotal() {
        return super.calcularSalarioTotal() + this.plusSalario;
    }

    @Override
    public String toString() {
        String info = super.toString();
        info = info + "\tPlus de salario: " + this.getPlusSalario() + "\n";
        info = info +"\tSalario total con plus: " + this.calcularSalarioTotal() + "\n";
        return info;
    }
}
