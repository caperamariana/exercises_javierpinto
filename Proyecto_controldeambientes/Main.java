import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Ciudad> ciudades = new ArrayList<>();
        ArrayList<Sede> sedes = new ArrayList<>();
        ArrayList<LineaFormacion> lineas = new ArrayList<>();
        ArrayList<ProgramaFormacion> programas = new ArrayList<>();
        ArrayList<Ambiente> ambientes = new ArrayList<>();
        ArrayList<Instructor> instructores = new ArrayList<>();
        ArrayList<Aprendiz> aprendices = new ArrayList<>();
        ArrayList<Horario> horarios = new ArrayList<>();
        ArrayList<Asignacion> asignaciones = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Registrar ciudad");
            System.out.println("2. Registrar sede");
            System.out.println("3. Registrar línea de formación");
            System.out.println("4. Registrar programa de formación");
            System.out.println("5. Registrar ambiente");
            System.out.println("6. Registrar instructor");
            System.out.println("7. Registrar aprendiz");
            System.out.println("8. Mostrar datos registrados");
            System.out.println("9. Asignar horario");
            System.out.println("10. Generar reportes");
            System.out.println("11. Validar restricciones");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la ciudad: ");
                    String nombreCiudad = scanner.nextLine();
                    ciudades.add(new Ciudad(nombreCiudad));
                    System.out.println("Ciudad registrada.");
                    break;

                case 2:
                    if (ciudades.isEmpty()) {
                        System.out.println("Primero debe registrar una ciudad.");
                        break;
                    }
                    System.out.println("Seleccione la ciudad de la sede:");
                    for (int i = 0; i < ciudades.size(); i++) {
                        System.out.println(i + ". " + ciudades.get(i).getNombre());
                    }
                    int indexCiudad = Integer.parseInt(scanner.nextLine());
                    System.out.print("Ingrese el nombre de la sede: ");
                    String nombreSede = scanner.nextLine();
                    sedes.add(new Sede(nombreSede, ciudades.get(indexCiudad)));
                    System.out.println("Sede registrada.");
                    break;

                case 3:
                    System.out.print("Ingrese el nombre de la línea de formación: ");
                    String nombreLinea = scanner.nextLine();
                    lineas.add(new LineaFormacion(nombreLinea));
                    System.out.println("Línea registrada.");
                    break;

                case 4:
                    if (lineas.isEmpty()) {
                        System.out.println("Primero debe registrar una línea de formación.");
                        break;
                    }
                    System.out.println("Seleccione la línea del programa:");
                    for (int i = 0; i < lineas.size(); i++) {
                        System.out.println(i + ". " + lineas.get(i).getNombre());
                    }
                    int indexLinea = Integer.parseInt(scanner.nextLine());
                    System.out.print("Ingrese el nombre del programa: ");
                    String nombrePrograma = scanner.nextLine();
                    programas.add(new ProgramaFormacion(nombrePrograma, lineas.get(indexLinea)));
                    System.out.println("Programa registrado.");
                    break;

                case 5:
                    if (lineas.isEmpty()) {
                        System.out.println("Primero debe registrar una línea de formación.");
                        break;
                    }

                    System.out.print("Ingrese el nombre del ambiente: ");
                    String nombreAmbiente = scanner.nextLine();
                    System.out.print("Ingrese el tipo (Normal, Especializado, Maquinario): ");
                    String tipoAmbiente = scanner.nextLine();
                    System.out.print("Ingrese una descripción: ");
                    String descripcion = scanner.nextLine();

                    System.out.println("Seleccione la línea del ambiente:");
                    for (int i = 0; i < lineas.size(); i++) {
                        System.out.println(i + ". " + lineas.get(i).getNombre());
                    }
                    int indexLineaAmbiente = Integer.parseInt(scanner.nextLine());

                    ambientes.add(new Ambiente(nombreAmbiente, tipoAmbiente, descripcion, lineas.get(indexLineaAmbiente)));
                    System.out.println("Ambiente registrado.");
                    break;

                case 6:
                    if (lineas.isEmpty() || programas.isEmpty()) {
                        System.out.println("Debe registrar línea y programa antes.");
                        break;
                    }

                    System.out.print("Ingrese el nombre del instructor: ");
                    String nombreInstructor = scanner.nextLine();
                    System.out.print("Ingrese la cédula del instructor: ");
                    String cedulaInstructor = scanner.nextLine();

                    System.out.println("Seleccione la línea:");
                    for (int i = 0; i < lineas.size(); i++) {
                        System.out.println(i + ". " + lineas.get(i).getNombre());
                    }
                    int indexLineaInstructor = Integer.parseInt(scanner.nextLine());

                    System.out.println("Seleccione el programa:");
                    for (int i = 0; i < programas.size(); i++) {
                        System.out.println(i + ". " + programas.get(i).getNombre());
                    }
                    int indexProgramaInstructor = Integer.parseInt(scanner.nextLine());

                    instructores.add(new Instructor(
                        nombreInstructor,
                        cedulaInstructor,
                        lineas.get(indexLineaInstructor),
                        programas.get(indexProgramaInstructor)
                    ));
                    System.out.println("Instructor registrado.");
                    break;

                case 7:
                    if (lineas.isEmpty() || programas.isEmpty() || ambientes.isEmpty()) {
                        System.out.println("Debe registrar línea, programa y ambiente antes.");
                        break;
                    }
                    System.out.print("Ingrese el nombre del aprendiz: ");
                    String nombreAprendiz = scanner.nextLine();

                    System.out.println("Seleccione la línea:");
                    for (int i = 0; i < lineas.size(); i++) {
                        System.out.println(i + ". " + lineas.get(i).getNombre());
                    }
                    int indexLineaAprendiz = Integer.parseInt(scanner.nextLine());

                    System.out.println("Seleccione el programa:");
                    for (int i = 0; i < programas.size(); i++) {
                        System.out.println(i + ". " + programas.get(i).getNombre());
                    }
                    int indexPrograma = Integer.parseInt(scanner.nextLine());

                    System.out.println("Seleccione el ambiente:");
                    for (int i = 0; i < ambientes.size(); i++) {
                        System.out.println(i + ". " + ambientes.get(i).getNombre());
                    }
                    int indexAmbiente = Integer.parseInt(scanner.nextLine());

                    aprendices.add(new Aprendiz(
                        nombreAprendiz,
                        lineas.get(indexLineaAprendiz),
                        programas.get(indexPrograma),
                        ambientes.get(indexAmbiente)
                    ));
                    System.out.println("Aprendiz registrado.");
                    break;

                case 8:
                    System.out.println("\n--- Datos Registrados ---");
                    System.out.println("Ciudades:");
                    ciudades.forEach(System.out::println);

                    System.out.println("\nSedes:");
                    sedes.forEach(System.out::println);

                    System.out.println("\nLíneas de formación:");
                    lineas.forEach(System.out::println);

                    System.out.println("\nProgramas:");
                    programas.forEach(System.out::println);

                    System.out.println("\nAmbientes:");
                    ambientes.forEach(System.out::println);

                    System.out.println("\nInstructores:");
                    instructores.forEach(System.out::println);

                    System.out.println("\nAprendices:");
                    aprendices.forEach(System.out::println);
                    break;

                case 9:
                    System.out.println("\n--- ASIGNAR HORARIO ---");
                    System.out.print("Ingrese el día: ");
                    String dia = scanner.nextLine();
                    System.out.print("Ingrese la jornada (Mañana, Tarde, Noche): ");
                    String jornada = scanner.nextLine();
                    Horario nuevoHorario = new Horario(dia, jornada);
                    horarios.add(nuevoHorario);

                    System.out.println("¿Asignar a:\n1. Instructor\n2. Aprendiz?");
                    int opcionAsignar = Integer.parseInt(scanner.nextLine());

                    if (opcionAsignar == 1 && !instructores.isEmpty()) {
                        System.out.println("Seleccione el instructor:");
                        for (int i = 0; i < instructores.size(); i++) {
                            System.out.println(i + ". " + instructores.get(i).getNombre());
                        }
                        int indexInst = Integer.parseInt(scanner.nextLine());
                        instructores.get(indexInst).agregarHorario(nuevoHorario);
                        System.out.println("Horario asignado al instructor.");
                    } else if (opcionAsignar == 2 && !aprendices.isEmpty()) {
                        System.out.println("Seleccione el aprendiz:");
                        for (int i = 0; i < aprendices.size(); i++) {
                            System.out.println(i + ". " + aprendices.get(i).getNombre());
                        }
                        int indexApr = Integer.parseInt(scanner.nextLine());
                        aprendices.get(indexApr).agregarHorario(nuevoHorario);

                        System.out.println("Seleccione el ambiente:");
                        for (int i = 0; i < ambientes.size(); i++) {
                            System.out.println(i + ". " + ambientes.get(i).getNombre());
                        }
                        int indexAmb = Integer.parseInt(scanner.nextLine());

                        asignaciones.add(new Asignacion(aprendices.get(indexApr), ambientes.get(indexAmb), nuevoHorario));
                        System.out.println("Horario asignado al aprendiz y creado registro de asignación.");
                    } else {
                        System.out.println("Lista vacía o selección inválida.");
                    }
                    break;

                case 10:
                    int opcionReporte;
                    do {
                        System.out.println("\n--- MENÚ DE REPORTES ---");
                        System.out.println("1. Instructores por línea y programa");
                        System.out.println("2. Aprendices por línea y programa");
                        System.out.println("3. Ambientes por tipo y línea");
                        System.out.println("4. Horarios por jornada");
                        System.out.println("0. Volver al menú principal");
                        System.out.print("Seleccione una opción: ");
                        opcionReporte = Integer.parseInt(scanner.nextLine());

                        switch (opcionReporte) {
                            case 1:
                                Reporte.mostrarInstructores(instructores);
                                break;
                            case 2:
                                Reporte.mostrarAprendices(aprendices);
                                break;
                            case 3:
                                Reporte.mostrarAmbientes(ambientes);
                                break;
                            case 4:
                                ArrayList<Horario> todosHorarios = new ArrayList<>();
                                for (Instructor i : instructores) {
                                    todosHorarios.addAll(i.getHorarios());
                                }
                                for (Aprendiz a : aprendices) {
                                    todosHorarios.addAll(a.getHorarios());
                                }
                                Reporte.mostrarHorarios(todosHorarios);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opción inválida.");
                        }
                    } while (opcionReporte != 0);
                    break;

                case 11:
                    System.out.println("\n--- VALIDACIÓN DE RESTRICCIONES ---");

                    for (int i = 0; i < instructores.size(); i++) {
                        for (int j = i + 1; j < instructores.size(); j++) {
                            if (!Validador.validarInstructorUnico(instructores.get(i), List.of(instructores.get(j)))) {
                                System.out.println("Instructor con cédula duplicada: " + instructores.get(i).getCedula());
                            }
                        }
                    }

                    for (Instructor i : instructores) {
                        if (!Validador.validarHorarioUnicoInstructor(i)) {
                            System.out.println("Instructor con más de un horario: " + i.getNombre());
                        }
                    }

                    for (Aprendiz a : aprendices) {
                        if (!Validador.validarJornadasAprendiz(a)) {
                            System.out.println("Aprendiz con más de dos jornadas: " + a.getNombre());
                        }
                        if (!Validador.validarProgramaUnicoAprendiz(a)) {
                            System.out.println("Aprendiz sin programa/línea: " + a.getNombre());
                        }
                    }
                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
