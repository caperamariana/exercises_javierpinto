
package com.mycompany.principalexercises;



import java.util.Scanner;

public class Exercise30Version2 { 
    
    static Scanner lector = new Scanner(System.in);

    public static int valorA = 0, valorB = 0, valorC = 0, valorD = 0, valorE = 0 , valorF = 0, 
                      valorG = 0, valorH = 0, auxiliar, contador = 0, numeroBase = 2, secuencia = 1 , valorExtra = 1, divisibilidad=0;
    public static String textoEntrada, estado = "V";
    public static double decimalUno = 0, decimalDos = 0, decimalTres = 0, decimalCuatro = 0, decimalCinco = 0;
    public static char caracter, simbolo;
    
    public static void main(String[] args) {
        EjecutorPrincipal instancia = new EjecutorPrincipal();
        
        do{
        
        System.out.print("Digite una opcion (auxiliar) del 1 al 32 (0 para salir): ");
        auxiliar = lector.nextInt();

        switch (auxiliar) {
            case 1:
            {
                ManejadorDatos.LeerDatos1();
                Exercise1.ejercicio1();
                break;
            }

            case 2:
            {
                ManejadorDatos.LeerDatos2();
                Exercise2.ejercicio2();
                break;
            }

            case 3:
            {
                ManejadorDatos.LeerDatos3();
                Exercise3.ejercicio3();
                break;
            }

            case 4:
            {
                ManejadorDatos.LeerDatos4();
                Exercise4.ejercicio4();
                break;
            }
            
            case 5: 
            {
                ManejadorDatos.LeerDatos5();
                Exercise5.ejercicio5();
                break;
            }
            
            case 6:
            {
                ManejadorDatos.LeerDatos6();
                Exercise6.ejercicio6();
                break;
            }
            
            case 7:
            {
                ManejadorDatos.LeerDatos7decimal();
                Exercise7.ejercicio7();
                break;
            }
            
            case 8:
            {
                ManejadorDatos.LeerDatos8decimal();
                Exercise8.ejercicio8();
                break;
            }
            
            case 9:
            {
                ManejadorDatos.LeerDatos9();
                Exercise9.ejercicio9();
                break;
            }
            
            case 10:
            {
                ManejadorDatos.LeerDatos10();
                Exercise10.ejercicio10();
                break;
            }
            
            case 11:
            {    
                   
                ManejadorDatos.LeerDatos11();
                Exercise11.ejercicio11();
                break;
            }
            
            case 12:
            {
                ManejadorDatos.LeerDatos12();
                Exercise12.ejercicio12();
                break;
            }      
            
            case 13:
            {
                ManejadorDatos.LeerDatos13decimal();
                Exercise13.ejercicio13();
                break;
            }
            
            case 14:
            {
                ManejadorDatos.LeerDatos14();
                Exercise14.ejercicio14();
                break;
            }
            
            case 15:
            {
                ManejadorDatos.LeerDatos15();
                Exercise15.ejercicio15();
                break;
            }
            
            case 16:
            {
                ManejadorDatos.LeerDatos16();
                Exercise16.ejercicio16();
                break;
            }   
            
            case 17:
            {
                ManejadorDatos.LeerDatos17();
                Exercise17.ejercicio17();
                break;
            }
            
            case 18: 
            {
                ManejadorDatos.LeerDatos18();
                Exercise18.ejercicio18();
                break;
                
            }
            
            case 19:
            {
                ManejadorDatos.LeerDatos19();
                Exercise19.ejercicio19();
                break;
            }
            
            case 20:
            {
                ManejadorDatos.LeerDatos20();
                Exercise20.ejercicio20();
                break;
            }   
            
            case 21:
            {
                Exercise21.ejercicio21();
                break;
            }
            
            case 22:
            {
                ManejadorDatos.LeerDatos22();
                Exercise22.ejercicio22();
                break;
            } 
            
            case 23: 
            {
                Exercise23.ejercicio23();
                break;
            } 
            
            case 24:
            {
                Exercise24.ejercicio24();
                break;
            }   
            
            case 25:
            {
                Exercise25.ejercicio25();
                break;
            }  
            
            case 26:
            {
                ManejadorDatos.LeerDatos26();
                Exercise26.ejercicio26();
                break;
            }
            
            case 27:
            {
                ManejadorDatos.LeerDatos27();
                Exercise27.ejercicio27();
                break;
            }
            
            case 28:
            {
                Exercise28.ejercicio28();
                break;
            }
            
            case 29:
            {
                Exercise29.ejercicio29();
                break;
            }
            
            case 30:
            {
                ManejadorDatos.LeerDatos30();
                Exercise30.ejercicio30();
                break;
            }
            
            case 31:
            {
                ManejadorDatos.LeerDatos31();
                Exercise31.ejercicio31();
                break;
            }
            
            case 32:
            {
                ManejadorDatos.LeerDatos32();
                Exercise32.ejercicio32();
                break;
            }
            default:
                System.out.println("Opción no válida.");
                break;
        }
    } while (auxiliar != 0);

        lector.close();
    }
}


package com.mycompany.principalexercises;
import static com.mycompany.principalexercises.EjecutorPrincipal.lector;


public class ManejadorDatos {
    public static EjecutorPrincipal instancia = new EjecutorPrincipal();
    
    public static void LeerDatos1(){
        System.out.print("Ingrese la velocidad: ");
        instancia.valorA = instancia.lector.nextInt();
        System.out.print("Ingrese el tiempo: ");
        instancia.valorB = instancia.lector.nextInt();
    }
    
    public static void LeerDatos2(){
        System.out.print("Ingrese nota 1: ");
        instancia.valorA = instancia.lector.nextInt();
        System.out.print("Ingrese nota 2: ");
        instancia.valorB = instancia.lector.nextInt();
        System.out.print("Ingrese nota 3: ");
        instancia.valorC = instancia.lector.nextInt();
    }
    
    public static void LeerDatos3(){
        System.out.print("Ingrese numero de respuestas correctas: ");
        instancia.valorA = instancia.lector.nextInt();
        System.out.print("Ingrese numero de respuestas incorrectas: ");
        instancia.valorB = instancia.lector.nextInt();
        System.out.print("Ingrese numero de respuestas en blanco: ");
        instancia.valorC = instancia.lector.nextInt();
    }
    
    public static void LeerDatos4(){
        System.out.print("Ingrese número de partidos ganados: ");
        instancia.valorA = instancia.lector.nextInt();
        System.out.print("Ingrese número de partidos empatados: ");
        instancia.valorB = instancia.lector.nextInt();
        System.out.print("Ingrese número de partidos perdidos: ");
        instancia.valorC = instancia.lector.nextInt(); 
    }
    
    public static void LeerDatos5(){
        System.out.println("Ingrese el Numero de Horas laboradas en el mes: ");
        instancia.valorA = instancia.lector.nextInt();
        System.out.println("Ingrese su Tarifa por Hora: ");
        instancia.valorB = instancia.lector.nextInt();
    }
    
    public static void LeerDatos6(){
        System.out.println("Ingrese la longitud del lado A: ");
        instancia.decimalUno = instancia.lector.nextDouble();
        System.out.println("Ingrese la longitud del lado B: ");
        instancia.decimalDos = instancia.lector.nextDouble();
        System.out.println("Ingrese la longitud del lado C: ");
        instancia.decimalTres = instancia.lector.nextDouble();
    }
    
    public static void LeerDatos7decimal(){
        System.out.println("Ingrese el numero de Gigabytes del disco duro: ");
        instancia.decimalUno = instancia.lector.nextDouble();
    }
    
    public static void LeerDatos8decimal(){
        System.out.println("Ingrese la Abscisa del punto A: ");
        instancia.decimalUno = instancia.lector.nextDouble();
        System.out.print("Ingrese la Abscisa del punto B: ");
        instancia.decimalDos = instancia.lector.nextDouble();
        System.out.print("Ingrese la Ordenada del punto A: ");
        instancia.decimalTres = instancia.lector.nextDouble();
        System.out.print("Ingrese la Ordenada del punto B: ");
        instancia.decimalCuatro = instancia.lector.nextDouble();
    }
    
    public static void LeerDatos9(){
        System.out.println("Ingrese el año de nacimiento");
        instancia.valorA = instancia.lector.nextInt();
        System.out.println("Ingrese el año actual");
        instancia.valorB = instancia.lector.nextInt();
    }
    
    public static void LeerDatos10(){
        System.out.println("Ingrese la edad del primer hermano");
        instancia.valorA = instancia.lector.nextInt();
        System.out.println("Ingrese la edad del segundo hermano");
        instancia.valorB = instancia.lector.nextInt();
    }
    
    public static void LeerDatos11(){
        System.out.println("Ingrese la produccion del dia lunes:");
        instancia.valorA = instancia.lector.nextInt();
        System.out.println("Ingrese la produccion del dia martes: ");
        instancia.valorB = instancia.lector.nextInt();
        System.out.println("Ingrese la produccion del dia miercoles: ");
        instancia.valorC = instancia.lector.nextInt();
        System.out.println("Ingrese la produccion del dia jueves: ");
        instancia.valorD = instancia.lector.nextInt();
        System.out.println("Ingrese la produccion del dia viernes: ");
        instancia.valorE = instancia.lector.nextInt();
        System.out.println("Ingrese la produccion del dia sabado: ");
        instancia.valorF = instancia.lector.nextInt();
    }
    
    public static void LeerDatos12(){
        System.out.println("Ingrese el Primer Numero Entero: ");
        instancia.valorA = instancia.lector.nextInt();
        System.out.println("Ingrese el Segundo Numero Entero: ");
        instancia.valorB = instancia.lector.nextInt();
        System.out.println("Ingrese el Tercer Numero Entero: ");
        instancia.valorC = instancia.lector.nextInt();
    }
    
    public static void LeerDatos13decimal(){
        System.out.println("Ingrese el numero del primer lado: ");
        instancia.decimalUno = instancia.lector.nextInt();
        System.out.println("Ingrese el numero del segundo lado: ");
        instancia.decimalDos = instancia.lector.nextInt();
        System.out.println("Ingrese el numero del tercer lado: ");
        instancia.decimalTres = instancia.lector.nextInt();
    }
    
    public static void LeerDatos14(){
        System.out.println("Ingrese un numero entero del (1 a 10): ");
        instancia.valorA = instancia.lector.nextInt();
    }
    
    public static void LeerDatos15(){
        System.out.println("Ingrese el monto de venta del mes: ");
        instancia.decimalUno = instancia.lector.nextDouble();   
    }
    
    public static void LeerDatos16(){
        System.out.println("Ingrese un numero entero del 1 al 5: ");
        instancia.valorA = instancia.lector.nextInt();
    }
    
    public static void LeerDatos17(){
        System.out.print("Ingrese un numero entero de 2 digitos: ");
        instancia.valorA = instancia.lector.nextInt();
    }
    
    public static void LeerDatos18(){
        System.out.print("Ingrese un numero entero diferente a cero: ");
        instancia.valorA = instancia.lector.nextInt();
    }
    
    public static void LeerDatos19(){
        System.out.println(instancia.numeroBase);
    }
    
    public static void LeerDatos20(){
        System.out.print("Ingrese el numero de empleados: ");
        instancia.valorA = instancia.lector.nextInt();
    }
    
    public static void LeerDatos22(){
        System.out.println("ingrese el primer numero entero: ");
        instancia.valorA = instancia.lector.nextInt();
        System.out.println("ingrese el segundo numero entero: ");
        instancia.valorB = instancia.lector.nextInt();
    }
    
    public static void LeerDatos26(){
        System.out.println(instancia.valorA);
        System.out.println(instancia.valorExtra);
    }
    
    public static void LeerDatos27(){
        System.out.print("Ingrese el primer numero: ");
        instancia.valorA = instancia.lector.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        instancia.valorB = instancia.lector.nextInt();
        System.out.print("Ingrese el simbolo (+, -, *, ^): ");
        instancia.simbolo = instancia.lector.next().charAt(0);
    }
    
    public static void LeerDatos30(){
        System.out.println("Ingrese el primer numero: ");
        instancia.decimalUno = instancia.lector.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        instancia.decimalDos = instancia.lector.nextDouble();
    }
    
    public static void LeerDatos31(){
        System.out.println("Ingrese un numero del 1 al 12: ");
        instancia.valorA = instancia.lector.nextInt();
    }
    
    public static void LeerDatos32(){
        System.out.println("Ingrese un numero entero diferente a cero: ");
        instancia.valorA = instancia.lector.nextInt();
    }
    
    
    
    
    
    
    
    
    
            
            
    
    
    
}
