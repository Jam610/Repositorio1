package Herencia;
// new Vehiculo (4, 250, 180) no se puede hacer porque no se puede crear un vehiculo
// new Coche ()
public class Coche extends Vehiculo{
    private int nPuertas;

    Coche(){
        super.metodo1();
        this.metodo1();
    }
    //Constructor de la subclase (coche) llama, con super(), al constructor de la superclase (vehículo)
    Coche(String marca, String modelo, int ruedas, int velocidad, int potencia, int puertas){
        //el Constructor del padre
        super(marca, modelo, ruedas, velocidad, potencia);
        setnPuertas(puertas);
    }

    @Override
    public void metodo1() {
        System.out.print("¿Cuantas puertas tiene el coche?: ");
        int puertas = scanner.nextInt();
        this.setnPuertas(puertas);
        System.out.print("¿Cuánto ha recorrido el coche?: ");
        int KmTotales = scanner.nextInt();
        this.recorre(10);
        this.setKmTotales(KmTotales);
        System.out.println("=====================================");
    }

    public int getnPuertas (){
        return nPuertas;
    }

    public void setnPuertas(int p){
        this.nPuertas = p;
    }
    // redefinir los getKmTotales del padre 10 + los kilómetros del vehículo
    @Override
    public int getKmTotales() {
        return 10 + super.getKmTotales();
    }

    public String toString(){
        String info = super.toString();
        info = info + "\tnPuertas: " + this.getnPuertas()+ "\n";
        info = info + "\tKmTotales: " + this.getKmTotales() +"\n";
        return info;
    }
}
