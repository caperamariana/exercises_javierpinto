public class Ambiente {
    private String nombre;
    private String tipo; 
    private String descripcion;
    private LineaFormacion linea; 

    public Ambiente(String nombre, String tipo, String descripcion, LineaFormacion linea) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.linea = linea;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LineaFormacion getLinea() {
        return linea;
    }

    public boolean esEspecializado() {
        return tipo.equalsIgnoreCase("Especializado");
    }

    @Override
    public String toString() {
        return "Ambiente: " + nombre + " | Tipo: " + tipo + " | Desc: " + descripcion;
    }
}
