import java.util.ArrayList;
import java.util.List;

public class Aprendiz {
    private String nombre;
    private LineaFormacion linea;
    private ProgramaFormacion programa;
    private Ambiente ambiente;
    private List<Horario> horarios; 

    public Aprendiz(String nombre, LineaFormacion linea, ProgramaFormacion programa, Ambiente ambiente) {
        this.nombre = nombre;
        this.linea = linea;
        this.programa = programa;
        this.ambiente = ambiente;
        this.horarios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public LineaFormacion getLinea() {
        return linea;
    }

    public ProgramaFormacion getPrograma() {
        return programa;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void agregarHorario(Horario horario) {
        horarios.add(horario);
    }

    @Override
    public String toString() {
        return "Aprendiz: " + nombre + " | " + programa.toString() + " | " + ambiente.toString();
    }
}
