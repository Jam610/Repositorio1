package Ejercicio1;

public class Director extends Empleado {
    private int numDespacho;
    private double plusSalario;

    public Director() {
        // Inicializar con valores predeterminados
        super.metodo1();
        this.metodo1();
        this.numDespacho = 0;
        this.plusSalario = 400;
    }

    public Director(String DNI, String nombre, String email, double salarioBase, int horasExtra, double precioHoraExtra, int numDespacho, double plusSalario) {
        // Llamar al constructor del padre
        super(DNI, nombre, email, salarioBase, horasExtra, precioHoraExtra);
        this.numDespacho = numDespacho;
        this.plusSalario = plusSalario;
    }


    @Override
    public void metodo1() {
        
    }

    public int getNumDespacho() {
        return this.numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
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
        info = info +"\tNúmero de despacho: " + this.getNumDespacho() + "\n";
        info = info +"\tPlus de salario: " + this.getPlusSalario() + "\n";
        info = info +"\tSalario total con plus: " + this.calcularSalarioTotal() + "\n";
        return info;
    }
}
