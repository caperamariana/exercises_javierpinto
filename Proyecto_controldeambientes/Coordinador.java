import java.util.ArrayList;
import java.util.List;

public class Coordinador {
    private String nombre;
    private String cedula;
    private List<Instructor> instructoresAsignados;

    public Coordinador(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.instructoresAsignados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public List<Instructor> getInstructoresAsignados() {
        return instructoresAsignados;
    }

    public void asignarInstructor(Instructor instructor) {
        if (!instructoresAsignados.contains(instructor)) {
            instructoresAsignados.add(instructor);
            System.out.println("Instructor asignado correctamente.");
        } else {
            System.out.println("Este instructor ya está asignado a este coordinador.");
        }
    }

    public void mostrarInstructores() {
        System.out.println("Instructores asignados al coordinador " + nombre + ":");
        for (Instructor i : instructoresAsignados) {
            System.out.println("- " + i.getNombre());
        }
    }
}
