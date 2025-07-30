import java.util.List;

public class Reporte {

    public static void mostrarInstructores(List<Instructor> instructores) {
        System.out.println("🔹 Reporte de Instructores:");
        for (Instructor i : instructores) {
            System.out.println(i.getNombre() + " - Línea: " + i.getLinea().getNombre() + " - Programa: " + i.getPrograma().getNombre());
        }
    }

    public static void mostrarAprendices(List<Aprendiz> aprendices) {
        System.out.println("🔹 Reporte de Aprendices:");
        for (Aprendiz a : aprendices) {
            System.out.println(a.getNombre() + " - Línea: " + a.getLinea().getNombre() + " - Programa: " + a.getPrograma().getNombre());
        }
    }

    public static void mostrarAmbientes(List<Ambiente> ambientes) {
        System.out.println("🔹 Reporte de Ambientes:");
        for (Ambiente a : ambientes) {
            System.out.println(a.getNombre() + " - Tipo: " + (a.esEspecializado() ? "Especializado" : "General") + " - Línea: " + a.getLinea().getNombre());
        }
    }

    public static void mostrarHorarios(List<Horario> horarios) {
        System.out.println("🔹 Reporte de Horarios:");
        for (Horario h : horarios) {
            System.out.println("Horario: " + h.getDescripcion() + " - Jornada: " + h.getJornada());
        }
    }
}
