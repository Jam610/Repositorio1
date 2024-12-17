
class Incidencias {
    private String descripcion;
    private String prioridad;
    private String estado; // "Pendiente" o "Resuelta"
    private String resolucion;
    private double precio;
    private Profesor profesor;
    private Aparato aparato;

    public Incidencias(String descripcion, String prioridad, Profesor profesor, Aparato aparato) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = "Pendiente"; // Por defecto, está pendiente
        this.profesor = profesor;
        this.aparato = aparato;
    }

    public void resolver(String resolucion, double precio) {
        this.resolucion = resolucion;
        this.precio = precio;
        this.estado = "Resuelta";
        this.aparato.setEstado(true); // Aparato vuelve a estar operativo
    }

    @Override
    public String toString() {
        return "Incidencia{Descripción='" + descripcion + "', Prioridad='" + prioridad + "', Estado='" + estado + "', Profesor='" + profesor + "', Aparato='" + aparato + "', Resolución='" + resolucion + "', Precio=" + precio + "}";
    }
}