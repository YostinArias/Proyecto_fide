package Data;

public class Calendario {
    private String nombre;
    private String telefono;
    private String puesto;

    public Calendario() {
        this.nombre = nombre;
        this.telefono = telefono;
        this.puesto = puesto;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getPuesto() {
        return puesto;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
