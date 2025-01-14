package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal de la aplicación.
 */
public class App {
    // Scanner para leer la entrada del usuario
    static Scanner scanner = new Scanner(System.in);
    // Lista para almacenar los empleados
    static ArrayList<Empleado> empleados = new ArrayList<>();

    /**
     * Método principal que ejecuta el programa.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu(); // Muestra el menú de opciones
            opcion = scanner.nextInt(); // Lee la opción seleccionada por el usuario
            scanner.nextLine(); // Limpiar el buffer
            switch (opcion) {
                case 1:
                    empleados.add(new Empleado()); // Añade un nuevo empleado
                    break;
                case 2:
                    empleados.add(new Contable()); // Añade un nuevo contable
                    break;
                case 3:
                    empleados.add(new Director()); // Añade un nuevo director
                    break;
                case 4:
                    añadirHorasExtras(); // Añade horas extras a todos los empleados
                    break;
                case 5:
                    imprimirEmpleados(); // Imprime la lista de empleados
                    break;
                case 0:
                    System.out.println("Saliendo del programa..."); // Mensaje de salida
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo."); // Mensaje de opción no válida
            }
        } while (opcion != 0); // Repite hasta que la opción sea 0 (salir)
    }

    /**
     * Muestra el menú de opciones al usuario.
     */
    public static void mostrarMenu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Crear Empleado");
        System.out.println("2. Crear Contable");
        System.out.println("3. Crear Director");
        System.out.println("4. Añadir 5 horas extras a todos los empleados");
        System.out.println("5. Imprimir empleados y mostrar sueldo");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    /**
     * Añade 5 horas extras a todos los empleados.
     */
    public static void añadirHorasExtras() {
        for (Empleado empleado : empleados) {
            empleado.setHorasExtra(empleado.getHorasExtra() + 5); // Incrementa las horas extras
        }
        System.out.println("Se han añadido 5 horas extras a todos los empleados."); // Mensaje de confirmación
    }

    /**
     * Imprime la lista de empleados y sus detalles.
     */
    public static void imprimirEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado); // Imprime los detalles del empleado
        }
    }
}
