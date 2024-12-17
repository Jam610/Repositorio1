import java.util.ArrayList;

public class Aparato {
    //Atributos de los aparatos
    private String ID;
    private String tipo;
    private String aula;
    private Boolean estado = false;
    private ArrayList<Incidencias> incidencias;
    public static void main(String[] args){

    }

    public void agregarIncidencia(Incidencias incidencia) {
        this.incidencias.add(incidencia);
    }

    //constructor de los aparatos
    public Aparato(String ID,String tipo, String aula){
        this.aula = aula;
        this.ID = ID;
        this.tipo = tipo;
       
    }

    // Lo getters y setters de los aparatos
    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAula() {
        return this.aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public Boolean isEstado() {
        return this.estado;
    }

    public Boolean getEstado() {
        return this.estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String toString() {
        return "ID: " + ID + ", tipo: " + tipo + ", aula: " + aula;
    }

}
