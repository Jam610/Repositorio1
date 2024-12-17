
import java.util.ArrayList;
import java.util.Scanner;

public class GesTIC {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Profesor> LProfesores = new ArrayList<>();
    static ArrayList<Aparato> LAparatos = new ArrayList<>();
    static ArrayList<Incidencias> Lincidencias = new ArrayList<>();

    // Método principal para probar la funcionalidad
    public static void main(String[] args) {
        boolean Continuar = true;
        // Menu GestiónTic que llama a los métodos de esta clase
        while (Continuar) {
            System.out.println("\nMenu Gestión Tic");
            System.out.println("1. Cargar Datos");
            System.out.println("2. Nueva Incidencia");
            System.out.println("3. Resolver Incidencia");
            System.out.println("4. Listar incidencias");
            System.out.println("5. Listar Incidencias Aparato");
            System.out.println("6. Finalizar");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            // Elige un numero int que mientras sea true o no haga return siempre se
            // ejecutará el menu.
            switch (opcion) {
                case 1:
                    CargarDatos();
                    break;
                case 2:
                    NuevaIncidencia();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Error");
            }
        }
    }

    // // Método para agregar un nuevo profesor
    // public void agregarProfesor(Profesor profesor, String nif, String nombre,
    // String departamento) {
    // LProfesores.add(profesor);
    // System.out.println("Profesor agregado: " + profesor);
    // }

    // // Método para agregar un nuevo aparato
    // public void agregarAparato(Aparato aparato) {
    // LAparatos.add(aparato);
    // System.out.println("Aparato agregado: " + aparato);
    // }

    // // Método para agregar una nueva incidencia
    // public void agregarIncidencia(Incidencias incidencia) {
    // Lincidencia.add(incidencia);
    // System.out.println("Incidencia registrada: " + incidencia);
    // }

    // Método para listar todos los profesores
    public static void listarProfesores() {
        System.out.println("Lista de Profesores:");
        if (LProfesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
        } else {
            for (Profesor profesor : LProfesores) {
                System.out.println(profesor);
            }
        }
    }

    // Método para listar todos los aparatos
    public static void listarAparatos() {
        System.out.println("Lista de Aparatos:");
        if (LAparatos.isEmpty()) {
            System.out.println("No hay aparatos registrados.");
        } else {
            for (Aparato aparato : LAparatos) {
                System.out.println(aparato);
            }
        }
    }

    // Método para listar todas las incidencias
    public static void listarIncidencias() {
        System.out.println("Lista de Incidencias:");
        if (Lincidencias.isEmpty()) {
            System.out.println("No hay incidencias registradas.");
        } else {
            for (Incidencias incidencia : Lincidencias) {
                System.out.println(incidencia);
            }
        }
    }

    public static void CargarDatos() {

        // Agregamos profesores y aparatos y utilizamos los métodos de listar arriba.
        GesTIC.LProfesores.add(new Profesor("123A", "Ana", "MAT"));
        GesTIC.LProfesores.add(new Profesor("123B", "Antonio", "TEC"));
        GesTIC.LProfesores.add(new Profesor("123C", "Maria", "EFI"));
        GesTIC.LProfesores.add(new Profesor("123D", "Juan", "MAT"));
        GesTIC.LProfesores.add(new Profesor("123E", "Claudia", "TIC"));

        GesTIC.LAparatos.add(new Aparato("PRA7", "Proyector", "A7"));
        GesTIC.LAparatos.add(new Aparato("PIZA7", "Pizarra Digital", "A7"));
        GesTIC.LAparatos.add(new Aparato("ORA7", "Ordenador", "A7"));
        GesTIC.LAparatos.add(new Aparato("ORA8", "Ordenador", "A8"));
        GesTIC.LAparatos.add(new Aparato("PRA8", "Proyector", "A8"));
        GesTIC.LAparatos.add(new Aparato("PRA9", "Proyector", "A9"));
        GesTIC.LAparatos.add(new Aparato("PRA7", "Pizarra Digital", "A9"));
        GesTIC.LAparatos.add(new Aparato("ORA9", "Ordenador", "A9"));

        GesTIC.listarProfesores();
        GesTIC.listarAparatos();
        GesTIC.listarIncidencias();

    }

    public static void NuevaIncidencia() {
        // Solicitar NIF del profesor
        System.out.print("Introduce el NIF del profesor: ");
        String nif = sc.nextLine();
        Profesor profesor = buscarProfesorPorNif(nif);

        if (profesor == null) {
            System.out.println("Profesor no encontrado.");
            return;
        }

        // Solicitar código del aparato
        System.out.print("Introduce el código del aparato: ");
        String codigo = sc.nextLine();
        Aparato aparato = buscarAparatoPorCodigo(codigo);

        if (aparato == null) {
            System.out.println("Aparato no encontrado.");
            return;
        }

        // Solicitar descripción y prioridad de la incidencia
        System.out.print("Describe la incidencia: ");
        String descripcion = sc.nextLine();
        System.out.print("Indica la prioridad (baja, media, alta): ");
        String prioridad = sc.nextLine();

        // Crear la incidencia
        Incidencias nuevaIncidencia = new Incidencias(descripcion, prioridad, profesor, aparato);

        // Añadir la incidencia a las listas correspondientes
        Lincidencias.add(nuevaIncidencia);
        aparato.agregarIncidencia(nuevaIncidencia);
        profesor.agregarIncidencia(nuevaIncidencia);

        // Cambiar el estado del aparato a no operativo
        aparato.setEstado(false);

        // Mostrar la incidencia registrada
        System.out.println("Incidencia registrada:\n" + nuevaIncidencia);
    }

    // Método para resolver la incidencia
    public static void ResolverIncidencia() {
        // Solicitar índice de la incidencia a resolver
        System.out.print("Introduce el índice de la incidencia a resolver: ");
        int indice = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        if (indice < 0 || indice >= Lincidencias.size()) {
            System.out.println("Índice inválido.");
            return;
        }

        // Obtener la incidencia
        Incidencias incidencia = Lincidencias.get(indice);

        // Verificar si la incidencia está pendiente
        if (!incidencia.toString().contains("Pendiente")) {
            System.out.println("La incidencia ya está resuelta.");
            return;
        }

        // Solicitar resolución y precio
        System.out.print("Describe la resolución: ");
        String resolucion = sc.nextLine();
        System.out.print("Introduce el precio de la reparación: ");
        double precio = sc.nextDouble();

        // Resolver la incidencia
        incidencia.resolver(resolucion, precio);

        // Mostrar incidencia resuelta
        System.out.println("Incidencia resuelta:\n" + incidencia);
    }

    // Método para listar todas las incidencias
    public static void ListarIncidencias() {
        if (Lincidencias.isEmpty()) {
            System.out.println("No hay incidencias registradas.");
        } else {
            System.out.println("Lista de incidencias:");
            for (int i = 0; i < Lincidencias.size(); i++) {
                System.out.println(i + ". " + Lincidencias.get(i));
            }
        }
    }

    // Métodos auxiliares para buscar profesor y aparato por sus identificadores
    public static Profesor buscarProfesorPorNif(String nif) {
        // Buscar el profesor en la lista por el NIF
        for (Profesor profesor : LProfesores) {
            if (profesor.getNif().equals(nif)) {
                return profesor; // Retorna el profesor encontrado
            }
        }
        return null; // Si no se encuentra, devuelve null
    }

      public static Aparato buscarAparatoPorCodigo(String codigo){
        // Buscar el aparato en la lista por el código
        for (Aparato aparato : LAparatos) {
            if (aparato.getID().equals(codigo)) {
                return aparato; // Retorna el aparato encontrado
            }
        }
        return null; // Si no se encuentra, devuelve null
    }
}
