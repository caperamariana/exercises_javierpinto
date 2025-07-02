import java.util.InputMismatchException;
import java.util.Scanner;

public final class Ambulancia {

    private static final int    NUM_AMBULANCIAS = 3; 
    private static final int    MAX_RECORRIDOS  = 8;  
    private static final double MAX_KM          = 400; 

    private Ambulancia() {}

    public static void registrarAmbulancias() {
        Scanner sc = Main.teclado;

        for (int idx = 0; idx < NUM_AMBULANCIAS; idx++) {
            String id = leerIdAmbulancia(sc, idx);
            Main.ambulancias[idx] = id;
        }

        mostrarAmbulanciasRegistradas();
    }

    public static void asignarRecorridos() {

        inicializarClinicasSiHaceFalta();
        solicitarAmbulanciasACadaClinica();

        for (int amb = 0; amb < NUM_AMBULANCIAS; amb++) {

            if (Main.ambulancias[amb] == null ||
                (Main.funeraria[0] != null && Main.funeraria[0].equals(Main.Conductores[amb]))) {
                continue;
            }

            double kmAcumulados = 0;
            int    viajes       = 0;

            while (viajes < MAX_RECORRIDOS && kmAcumulados < MAX_KM) {

                Clinica siguiente = clinicaConSolicitudesPendientes();
                if (siguiente == null) break; 

                double distancia = siguiente.distanciaRecorrido();
                if (kmAcumulados + distancia > MAX_KM) break;

               
                int idxClinica = indiceClinica(siguiente);
                Main.recorridos[amb][idxClinica]++;
                Main.recorridosPorConductor[amb]++;
                kmAcumulados += distancia;
                viajes++;

               
                siguiente.solicitarAmbulancia();
            }

            Main.kmAmbulancias[amb] = kmAcumulados;
        }
    }

    private static String leerIdAmbulancia(Scanner sc, int idx) {
        while (true) {
            try {
                System.out.printf("ID para la ambulancia %d (1‑10): ", idx + 1);
                int idNum = sc.nextInt();
                sc.nextLine(); 
                if (idNum < 1 || idNum > 10) {
                    System.out.println("⚠️  El ID debe estar entre 1 y 10.");
                    continue;
                }
                return String.valueOf(idNum);

            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("⚠️  Debes introducir un número entre 1 y 10.");
            }
        }
    }

    private static void mostrarAmbulanciasRegistradas() {
        System.out.println("\n✅ Ambulancias registradas:");
        for (int i = 0; i < NUM_AMBULANCIAS; i++) {
            if (Main.ambulancias[i] != null) {
                System.out.printf("   %d) %s%n", i + 1, Main.ambulancias[i]);
            }
        }
    }

    private static void inicializarClinicasSiHaceFalta() {
        if (Main.clinicas[0] != null) return;

        Main.clinicas[0] = new Clinica("Hospital Moncaliano",        55.0);
        Main.clinicas[1] = new Clinica("Carmen Emilia Ospina",      35.0);
        Main.clinicas[2] = new Clinica("Clínica Fracturas",    45.0);
        Main.clinicas[3] = new Clinica("Funeraria",                 15.0);
    }

    private static void solicitarAmbulanciasACadaClinica() {
        for (int i = 0; i < 3; i++) {
            Main.clinicas[i].solicitarAmbulancia();
        }
    }

    private static Clinica clinicaConSolicitudesPendientes() {
        for (int i = 0; i < 3; i++) {
            if (Main.clinicas[i].getSolicitudes() > 0) {
                return Main.clinicas[i];
            }
        }
        return null;
    }

    private static int indiceClinica(Clinica c) {
        for (int i = 0; i < 3; i++) {
            if (Main.clinicas[i] == c) return i;
        }
        return -1;
    }
}
