public class Asignacion {
    private Aprendiz aprendiz;
    private Ambiente ambiente;
    private Horario horario;

    public Asignacion(Aprendiz aprendiz, Ambiente ambiente, Horario horario) {
        this.aprendiz = aprendiz;
        this.ambiente = ambiente;
        this.horario = horario;
    }

    public Aprendiz getAprendiz() {
        return aprendiz;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public Horario getHorario() {
        return horario;
    }

    public void mostrarAsignacion() {
        System.out.println("Asignación:");
        System.out.println("Aprendiz: " + aprendiz.getNombre());
        System.out.println("Ambiente: " + ambiente.getTipo());
        System.out.println("Horario: " + horario.getDescripcion());
    }
}

