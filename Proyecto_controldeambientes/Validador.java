import java.util.List;

public class Validador {

    public static boolean validarInstructorUnico(Instructor instructor, List<Instructor> instructores) {
        for (Instructor inst : instructores) {
            if (inst.getCedula().equals(instructor.getCedula())) {
                return false;
            }
        }
        return true;
    }

    public static boolean validarHorarioUnicoInstructor(Instructor instructor) {
        return instructor.getHorarios().size() <= 1;
    }

    public static boolean validarJornadasAprendiz(Aprendiz aprendiz) {
        return aprendiz.getHorarios().size() <= 2;
    }

    public static boolean validarProgramaUnicoAprendiz(Aprendiz aprendiz) {
        return aprendiz.getPrograma() != null && aprendiz.getLinea() != null;
    }
}

