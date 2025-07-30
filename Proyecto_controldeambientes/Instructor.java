import java.util.ArrayList;
import java.util.List;

public class Instructor {
    private String nombre;
    private String cedula;
    private LineaFormacion linea;
    private ProgramaFormacion programa;
    private List<Horario> horarios;

    public Instructor(String nombre, String cedula, LineaFormacion linea, ProgramaFormacion programa) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.linea = linea;
        this.programa = programa;
        this.horarios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public LineaFormacion getLinea() {
        return linea;
    }

    public ProgramaFormacion getPrograma() {
        return programa;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void agregarHorario(Horario horario) {
        horarios.add(horario);
    }

    @Override
    public String toString() {
        return "Instructor: " + nombre + " | " + linea.toString() + " | " + programa.toString();
    }
}
