import java.util.ArrayList;

public class Profesor {
   private String nif;
    private String nombre;
    private String departamento;
    private ArrayList<Incidencias> incidencias;
    private Profesor profesor;

    public Profesor(String nif, String nombre, String departamento) {
        this.nif = nif;
        this.nombre = nombre;
        this.departamento = departamento;
        this.incidencias = new ArrayList<>();
    }

    public void agregarIncidencia(Incidencias incidencia) {
        this.incidencias.add(incidencia);
    }
    
    // Métodos getters y setters (si los necesitas)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdepartamento() {
        return departamento;
    }

    public void setdepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Incidencias> getIncidencias() {
        return this.incidencias;
    }

    public void setIncidencias(ArrayList<Incidencias> incidencias) {
        this.incidencias = incidencias;
    }

    public Profesor getProfesor() {
        return this.profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }


    // Método toString para mostrar los detalles del profesor
    @Override
    public String toString() {
        return "Profesor: " + nombre + ", departamento: " + departamento;
    }
}
