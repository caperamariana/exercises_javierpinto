public class Horario {
    private String dia;
    private String jornada; // Mañana, Tarde, Noche

    public Horario(String dia, String jornada) {
        this.dia = dia;
        this.jornada = jornada;
    }

    public String getDia() {
        return dia;
    }

    public String getJornada() {
        return jornada;
    }

    // 🔧 Método agregado para que funcione Asignacion.java
    public String getDescripcion() {
        return dia + " - " + jornada;
    }

    @Override
    public String toString() {
        return "Horario: " + dia + " - " + jornada;
    }
}
