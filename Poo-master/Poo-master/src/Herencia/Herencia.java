package Herencia;
import Herencia.*;
import java.util.ArrayList;
import java.util.Scanner;
import  java.util.Scanner;
public class Herencia {
    static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    //SOBRECARGA {. . .} COCHE{ THIS.SETPedirDATOS }
    public static void main(String[] args) {
                int opcion;

                do {
                    System.out.println("1. Añadir coche");
                    System.out.println("2. Añadir moto");
                    System.out.println("3. Añadir camión");
                    System.out.println("4. Mostrar vehículos");
                    System.out.println("5. Salir");
                    System.out.print("Elige una opción: ");
                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            vehiculos.add(new Coche());
                            break;

                        case 2:
                            vehiculos.add(new Moto());
                            break;

                        case 3:
                            vehiculos.add(new Camion());
                            break;

                        case 4:
                            for (Vehiculo v : vehiculos) {
                                System.out.println(v);
                            }
                            break;

                        case 5:
                            System.out.println("Saliendo...");
                            break;

                        default:
                            System.out.println("Opción inválida.");
                    }
                } while (opcion != 5);
            }
//        Coche c1 = new Coche(4,230,2,180,"Audi","A3");
//        Coche c2 = new Coche(4,250,4,180,"Mercedes","CLA200");
//        c1.recorre(100);
//        c2.recorre(200);
//        c1.recorre(300);
//        c2.recorre(50);
//        c2.recorre(200);
//        Coche c1 = new Coche();
//        Coche c2 = new Coche();
//        System.out.println(c1);
//        System.out.println(c2);

        }
