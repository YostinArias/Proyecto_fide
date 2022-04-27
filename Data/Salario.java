package Data;

public class Salario {


    public double Salariobruto;
    private String nombre;
    private String telefono;
    private String puesto;

    public Salario() {
        this.nombre = nombre;
        this.telefono = telefono;
        this.puesto = puesto;
    }

    public double getSalariobruto() {
        return Salariobruto;
    }

    public void setSalariobruto(double salariobruto) {
        Salariobruto = salariobruto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
