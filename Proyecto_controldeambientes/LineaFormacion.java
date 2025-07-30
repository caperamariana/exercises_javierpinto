public class LineaFormacion {
    private String nombre;

    public LineaFormacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Línea de Formación: " + nombre;
    }
}