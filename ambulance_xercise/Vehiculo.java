import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    String tipo;
    String idVehiculo;
    List<Paciente> pasajeros = new ArrayList<>();

    public Vehiculo(String tipo, String idVehiculo) {
        this.tipo = tipo;
        this.idVehiculo = idVehiculo;
    }
}
