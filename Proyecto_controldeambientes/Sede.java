public class Sede {
    private String nombre;
    private Ciudad ciudad;

    public Sede(String nombre, Ciudad ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return "Sede: " + nombre + " | " + ciudad.toString();
    }
}