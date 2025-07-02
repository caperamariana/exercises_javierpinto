import java.util.Random;
import java.util.Scanner;

public class ExerciseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int[][] datos = new int[3][3];

        System.out.print("Digite un número entre 0 y 45: ");
        int objetivo = sc.nextInt();

        while (objetivo < 0 || objetivo > 45) {
            System.out.print("Número fuera de rango. Intente nuevamente: ");
            objetivo = sc.nextInt();
        }

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                datos[f][c] = aleatorio.nextInt(16);
            }
        }

        System.out.println("\nMatriz generada:");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(datos[f][c] + "\t");
            }
            System.out.println();
        }

        int[] filas = new int[3];
        int[] columnas = new int[3];

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                filas[f] += datos[f][c];
                columnas[c] += datos[f][c];
            }
        }

        System.out.println("\nSuma de filas:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Fila " + (i + 1) + ": " + filas[i]);
        }

        System.out.println("\nSuma de columnas:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Columna " + (i + 1) + ": " + columnas[i]);
        }

        boolean hayCoincidencia = false;

        System.out.println("\nCoincidencias con el número " + objetivo + ":");

        for (int i = 0; i < 3; i++) {
            if (filas[i] == objetivo) {
                System.out.print("Fila " + (i + 1) + ": ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(datos[i][j] + " ");
                }
                System.out.println();
                hayCoincidencia = true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (columnas[i] == objetivo) {
                System.out.print("Columna " + (i + 1) + ": ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(datos[j][i] + " ");
                }
                System.out.println();
                hayCoincidencia = true;
            }
        }

        if (!hayCoincidencia) {
            System.out.println("No hubo coincidencias.");
        }

        sc.close();
    }
}

