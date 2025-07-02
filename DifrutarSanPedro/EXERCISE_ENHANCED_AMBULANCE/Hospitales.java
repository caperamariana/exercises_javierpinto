public class Hospitales {

    private final String nombreCentro;
    private final double kmIda;
    private int cantidadSolicitudes;

    public Hospitales(String nombreCentro, double kmIda) {
        if (kmIda <= 0) throw new IllegalArgumentException("La distancia debe ser mayor que cero.");
        this.nombreCentro = nombreCentro;
        this.kmIda = kmIda;
        this.cantidadSolicitudes = 0;
    }

    public String obtenerNombre() {
        return nombreCentro;
    }

    public double obtenerDistanciaIda() {
        return kmIda;
    }

    public void registrarSolicitud() {
        cantidadSolicitudes++;
    }

    public int solicitudesPendientes() {
        return cantidadSolicitudes;
    }

    public double calcularTrayectoTotal() {
        return kmIda * 2;
    }

    public void solicitudAtendida() {
        if (cantidadSolicitudes > 0) {
            cantidadSolicitudes--;
        }
    }

    @Override
    public String toString() {
        return String.format("🏥 %s (%.1f km ida)", nombreCentro, kmIda);
    }
}

