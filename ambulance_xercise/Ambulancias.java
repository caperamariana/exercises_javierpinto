import java.util.*;

public class Ambulancias {

    static List<Conductor> conductores = new ArrayList<>();
    static List<Paciente> pacientes = new ArrayList<>();
    static List<Vehiculo> ambulancias = new ArrayList<>();
    static Vehiculo carroFunebre;

    static String[] nombres = {"Juan", "Ana", "Luis", "Carlos", "Marta", "Pedro", "Lucía", "Andrés", "Sofía", "Jorge", "Elena", "Camila", "Diego", "Daniela", "Miguel", "Paula"};
    static String[] apellidos = {"Pérez", "Gómez", "Rodríguez", "López", "Martínez", "Ramírez", "Díaz", "Sánchez", "Castro", "Torres", "Navarro", "Ruiz", "Fernández"};

    public static void main(String[] args) {
        cargarDatos();
        asignarConductoresAVehiculos();
        recogerPacientes();
        asignarCarroFunebre();
        generarReporte();
    }

    public static void cargarDatos() {
        for (int i = 1; i <= 10; i++) {
            ambulancias.add(new Vehiculo("ambulancia", "A" + i));
        }

        carroFunebre = new Vehiculo("funebre", "F1");

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            String apellido = apellidos[random.nextInt(apellidos.length)];
            String telefono = "300000000" + (i + 1);
            conductores.add(new Conductor(nombre, apellido, telefono));
        }

        for (int i = 1; i <= 100; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            String apellido = apellidos[random.nextInt(apellidos.length)];
            String telefono = "310000000" + i;
            boolean estaVivo = i > 15; // los primeros 15 están muertos
            pacientes.add(new Paciente(nombre, apellido, telefono, estaVivo));
        }
    }

    public static void asignarConductoresAVehiculos() {
        for (int i = 0; i < 10; i++) {
            Conductor conductor = conductores.get(i);
            conductor.vehiculoAsignado = ambulancias.get(i);
        }
    }

    public static void recogerPacientes() {
        int indexPaciente = 0;

        for (Vehiculo ambulancia : ambulancias) {
            for (int i = 0; i < 10 && indexPaciente < pacientes.size(); i++) {
                Paciente paciente = pacientes.get(indexPaciente++);
                ambulancia.pasajeros.add(paciente);
            }
        }
    }

    public static void asignarCarroFunebre() {
        Conductor conductorFunebre = conductores.get(9);
        conductorFunebre.vehiculoAsignado = carroFunebre;

        for (Paciente p : pacientes) {
            if (!p.estaVivo) {
                carroFunebre.pasajeros.add(p);
            }
        }
    }

    public static void generarReporte() {
        System.out.println("=== REPORTE DE TRANSPORTE (los 10 conductores de ambulancias) ===\n");

        for (int i = 0; i < 10; i++) {
            Conductor conductor = conductores.get(i);
            Vehiculo vehiculo = conductor.vehiculoAsignado;

            if (vehiculo == null || vehiculo.pasajeros.isEmpty()) continue;

            int totalPacientes = 0;
            int muertos = 0;

            for (Paciente paciente : vehiculo.pasajeros) {
                totalPacientes++;
                if (!paciente.estaVivo) muertos++;

                System.out.println(
                    "Conductor: " + conductor.nombre + " " + conductor.apellido +
                    " | Teléfono: " + conductor.telefono +
                    " | Paciente: " + paciente.nombre + " " + paciente.apellido +
                    " | Vehículo: " + vehiculo.idVehiculo + " (" + vehiculo.tipo + ")" +
                    " | Estado: " + (paciente.estaVivo ? "Vivo" : "Muerto")
                );
            }

            System.out.println("--> TOTAL PACIENTES TRANSPORTADOS: " + totalPacientes +
                               " | Fallecidos: " + muertos + "\n");
        }
    }
}
