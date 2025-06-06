/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */

import java.util.Scanner;

public class VersionAnterior {       

    public static int entero1 = 0, entero2 = 0, entero3 = 0, entero4 = 0, entero5 = 0 , entero6 = 0, 
        entero7 = 0, entero8 = 0, var1, counter = 0, number = 2, serie = 1 , segundoNum = 1, divisor=0;
    public static String cadenaTexto, semaforo = "V";
    public static double decimales1 = 0, decimales2 = 0, decimales3 = 0, decimales4 = 0, decimales5 = 0;
    public static char letra, operador;
    
    public static Scanner ejercicios = new Scanner(System.in);

    public static void main(String[] args) {
        VersionAnterior cl = new VersionAnterior();
        
        
        do{
        
        System.out.print("Digite una opcion (var1) del 1 al 32 (0 para salir): ");
        var1 = ejercicios.nextInt();

        switch (var1) {
            case 1:
            {
                System.out.print("Ingrese la velocidad: ");
                entero1 = ejercicios.nextInt();
                System.out.print("Ingrese el tiempo: ");
                entero2 = ejercicios.nextInt();
                ejercicio1(entero1, entero2, entero3);
                break;
            }

            case 2:
            {
                System.out.print("Ingrese nota 1: ");
                entero1 = ejercicios.nextInt();
                System.out.print("Ingrese nota 2: ");
                entero2 = ejercicios.nextInt();
                System.out.print("Ingrese nota 3: ");
                entero3 = ejercicios.nextInt();
                ejercicio2(entero1, entero2, entero3, entero4);
                break;
            }

            case 3:
            {
                System.out.print("Ingrese numero de respuestas correctas: ");
                entero1 = ejercicios.nextInt();
                System.out.print("Ingrese numero de respuestas incorrectas: ");
                entero2 = ejercicios.nextInt();
                System.out.print("Ingrese numero de respuestas en blanco: ");
                entero3 = ejercicios.nextInt();
                ejercicio3(entero1, entero2);
        
                break;
            }

            case 4:
            {
                System.out.print("Ingrese numero de partidos ganados: ");
                entero1 = ejercicios.nextInt();
                System.out.print("Ingrese numero de partidos empatados: ");
                entero2 = ejercicios.nextInt();
                System.out.print("Ingrese numero de partidos perdidos: ");
                entero3 = ejercicios.nextInt(); 
                ejercicio4(entero1, entero2, entero3);
                
                break;
            }
            
            case 5: 
            {
                System.out.println("Ingrese el Numero de Horas laboradas en el mes: ");
                entero1 = ejercicios.nextInt();
                System.out.println("Ingrese su Tarifa por Hora: ");
                entero2 = ejercicios.nextInt();
                ejercicio5(entero1, entero2, entero3);
                break;
            }
            
            case 6:
            {
                System.out.println("Ingrese la longitud del lado A: ");
                decimales1 = ejercicios.nextDouble();
                System.out.println("Ingrese la longitud del lado B: ");
                decimales2 = ejercicios.nextDouble();
                System.out.println("Ingrese la longitud del lado C: ");
                decimales3 = ejercicios.nextDouble();
                ejercicio6(decimales1, decimales2, decimales3, decimales4, decimales5);
                
                break;
            }
            
            case 7:
            {
                System.out.println("Ingrese el numero de Gigabytes del disco duro: ");
                decimales1 = ejercicios.nextDouble();
                ejercicio7(decimales1, decimales2, decimales3);
        
                break;
            }
            
            case 8:
            {
                System.out.println("Ingrese la Abscisa del punto A: ");
                decimales1 = ejercicios.nextDouble();
                System.out.print("Ingrese la Abscisa del punto B: ");
                decimales2 = ejercicios.nextDouble();
                System.out.print("Ingrese la Ordenada del punto A: ");
                decimales3 = ejercicios.nextDouble();
                System.out.print("Ingrese la Ordenada del punto B: ");
                decimales4 = ejercicios.nextDouble();
                ejercicio8(decimales1, decimales2, decimales3, decimales4, decimales5);
                
                break;
            }
            
            case 9:
            {
                System.out.println("Ingrese el ano de nacimiento");
                entero1 = ejercicios.nextInt();
                System.out.println("Ingrese el ano actual");
                entero2 = ejercicios.nextInt();
                ejercicio9(entero1, entero2, entero3);
                
                break;
            }
            
            case 10:
            {
                System.out.println("Ingrese la edad del primer hermano");
                entero1 = ejercicios.nextInt();
                System.out.println("Ingrese la edad del segundo hermano");
                entero2 = ejercicios.nextInt();
                ejercicio10(entero1, entero2, entero3);
                
                break;
            }
            
            case 11:
            {    
                   
                System.out.println("Ingrese la produccion del dia lunes:");
                entero1 = ejercicios.nextInt();
                System.out.println("Ingrese la produccion del dia martes: ");
                entero2 = ejercicios.nextInt();
                System.out.println("Ingrese la produccion del dia miercoles: ");
                entero3 = ejercicios.nextInt();
                System.out.println("Ingrese la produccion del dia jueves: ");
                entero4 = ejercicios.nextInt();
                System.out.println("Ingrese la produccion del dia viernes: ");
                entero5 = ejercicios.nextInt();
                System.out.println("Ingrese la produccion del dia sabado: ");
                entero6 = ejercicios.nextInt();
                ejercicio11(entero1, entero2, entero3, entero4, entero5, entero6, entero7, entero8);
                
                break;
            }
            
            case 12:
            {
                System.out.println("Ingrese el Primer Numero Entero: ");
                entero1 = ejercicios.nextInt();
                System.out.println("Ingrese el Segundo Numero Entero: ");
                entero2 = ejercicios.nextInt();
                System.out.println("Ingrese el Tercer Numero Entero: ");
                entero3 = ejercicios.nextInt();
                ejercicio12(entero1, entero2, entero3, entero4);
                          
                break;
            }      
            
            case 13:
            {
                System.out.println("Ingrese el numero del primer lado: ");
                decimales1 = ejercicios.nextInt();
                System.out.println("Ingrese el numero del segundo lado: ");
                decimales2 = ejercicios.nextInt();
                System.out.println("Ingrese el numero del tercer lado: ");
                decimales3 = ejercicios.nextInt();
                ejercicio13(decimales1, decimales2, decimales3, cadenaTexto);
                
                break;
            }
            
            case 14:
            {
                System.out.println("Ingrese un numero entero del (1 a 10): ");
                entero1 = ejercicios.nextInt();
                ejercicio14(entero1, cadenaTexto);
                
                break;
            }
            
            case 15:
            {
                System.out.println("Ingrese el monto de venta del mes: ");
                decimales1 = ejercicios.nextDouble();
                ejercicio15(decimales1, decimales2);

                break;
            }
            
            case 16:
            {
                System.out.println("Ingrese un numero entero del 1 al 5: ");
                entero1 = ejercicios.nextInt();
                ejercicio16(entero1, cadenaTexto);
               
                break;
            }   
            
            case 17:
            {
                System.out.print("Ingrese un numero entero de 2 digitos: ");
                entero1 = ejercicios.nextInt();
                ejercicio17(entero1, entero2, entero3, entero4, entero5);
                
                break;
            }
            
            case 18: 
            {
                System.out.print("Ingrese un numero entero diferente a cero: ");
                entero1 = ejercicios.nextInt();
                ejercicio18(entero1, entero2, entero3, cadenaTexto);
                
                break;
                
            }
            
            case 19:
            {
                ejercicio19(number, counter);
                break;
            }
            
            case 20:
            {
                ejercicio20(entero1, counter, decimales1, decimales2, decimales3, ejercicios);
                break;
            }   
            
            case 21:
            {
                ejercicio21(counter, ejercicios, entero1, entero2, entero3);
                break;
            }
            
            case 22:
            {
                ejercicio22(ejercicios, counter, entero1, entero2,entero3);
                break;
            } 
            
            case 23: 
            {
                ejercicio23(counter, entero1, entero2);
                break;
            } 
            
            case 24:
            {
                ejercicio24(serie);
                break;
            }   
            
            case 25:
            {
                ejercicio25(ejercicios, letra, semaforo);
                break;
            }  
            
            case 26:
            {
                ejercicio26(entero1, segundoNum, entero2);
                break;
            }
            
            case 27:
            {
                ejercicio27(ejercicios, operador, entero1, entero2, entero3, entero4);
                break;
            }
            
            case 28:
            {
                ejercicio28(ejercicios, counter, entero1, letra, entero2);
                break;
            }
            
            case 29:
            {
                ejercicio29(ejercicios, counter, entero1, entero2, entero3, entero4, entero5, entero6);
                break;
            }
            
            case 30:
            {
                ejercicio30(ejercicios, decimales1, decimales2, decimales3, decimales4);
                break;
            }
            
            case 31:
            {
                ejercicio31(entero1, ejercicios, cadenaTexto);
                break;
            }
            
            case 32:
            {
                ejercicio32(ejercicios, entero1, entero2, entero3, entero4, divisor);
                break;
            }
            default:
                System.out.println("Opción no válida.");
                break;
        }
    } while (var1 != 0);

        ejercicios.close();
    }

    public static void ejercicio1(int entero1, int entero2, int entero3) {
        entero3 = entero1 * entero2;
        System.out.println("La distancia es: " + entero3);
    }

    public static void ejercicio2(int entero1, int entero2, int entero3, int entero4) {
        entero4 = (entero1 + entero2 + entero3) / 3; 
        System.out.println("El promedio es: " + entero4);
    }

    public static void ejercicio3(int entero1, int entero2) {
        entero1 = (entero1 * 4) + (entero2 * -1); 
        System.out.println("El puntaje final es: " + entero1);

        if (entero1 >= 50) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }
    }

    public static void ejercicio4(int entero1, int entero2, int entero3) {
        entero1 = (entero1 * 3) + (entero2 * 1); 
        System.out.println("El puntaje total del equipo es: " + entero1);  
    }
    
    public static void ejercicio5(int entero1, int entero2, int entero3) {
        entero3 = entero1 * entero2 ;
        System.out.println("La planilla total del empleado es: $ " + entero3);
    }
    
    public static void ejercicio6(double decimales1, double decimales2, double decimales3, double decimales4, double decimales5) {
        decimales4 = (decimales1 + decimales2 + decimales3) / 2;
        decimales5 = Math.sqrt(decimales4 * (decimales4 - decimales1) * (decimales4 - decimales2) * (decimales4 - decimales3));
        System.out.println("El area total del triangulo es: " + decimales5);
    }
    
    public static void ejercicio7(double decimales1, double decimales2, double decimales3) {
        decimales2 = decimales1 * 1024;
        decimales3 = ((decimales2 / 700) + 1);
        System.out.println("Se necesitan " + decimales3 + " CDs para la copia de seguridad"); 
    }
    
    public static void ejercicio8(double decimales1, double decimales2, double decimales3, double decimales4, double decimales5) {
        decimales5 = Math.sqrt(Math.pow(decimales2 - decimales1, 2) + Math.pow(decimales4 - decimales3, 2));
        System.out.println("la distancia entre los puntos A y B es: " + decimales5);
    }
    
    public static void ejercicio9(int entero1, int entero2, int entero3) {
        entero3 = entero2 - entero1;
        System.out.println("Tienes " + entero3 + " años");
        
        if(entero3>17){
            System.out.println("Debe solicitar su CUIL");
        }else{
            System.out.println("No debes solicitar su CUIL aun");
        }
    }
    
    public static void ejercicio10(int entero1, int entero2, int entero3) {
        if (entero1 > entero2){
            System.out.println("El primer hermano es mayor , por");
            entero3 = entero1 - entero2;
        }else{
            System.out.println("El primer hermano es menor , por");
            entero3 = entero2 - entero1;
        }      
        System.out.println(entero3 + " anos");
    }
    
    public static void ejercicio11(int entero1, int entero2, int entero3, int entero4, int entero5, int entero6, int entero7, int entero8) {
        entero7 = entero1 + entero2 + entero3 + entero4 + entero5 + entero6;
        entero8 = entero7 / 6;

        if (entero8 >= 100) {
            System.out.println("MSG = Recibira Incentivos");
        } else {
            System.out.println("MSG = No recibira Incentivos");
        }
        System.out.println(entero8); 
    }
    
    public static void ejercicio12(int entero1, int entero2, int entero3, int entero4) {
        if (entero1 > entero2 && entero1 > entero3) {
            entero4 = entero1;
        }else if (entero2 > entero3) {
            entero4 = entero2;
        }else{
            entero4 = entero3;
        }
        System.out.println("El numero mayor de los tres es el: " + entero4);
    }
    
    public static void ejercicio13(double decimales1, double decimales2, double decimales3, String cadenaTexto) {
        if (decimales1 != decimales2 && decimales2 != decimales3 && decimales3 != decimales3) {
            cadenaTexto = "Escaleno";
        } else if (decimales1 == decimales2 && decimales2 == decimales3) {
            cadenaTexto = "Equilatero";
        } else {
            cadenaTexto = "Isosceles";
        }
        System.out.println("El tipo de triangulo es: " + cadenaTexto);
    }
    
    public static void ejercicio14(int entero1, String cadenaTexto) {
        switch (entero1) {
            case 1:
                cadenaTexto = "I";
                break;
            case 2:
                cadenaTexto = "II";
                break;
            case 3:
                cadenaTexto = "III";
                break;
            case 4:
                cadenaTexto = "IV";
                break;
            case 5:
                cadenaTexto = "V";
                break;
            case 6:
                cadenaTexto = "VI";
                break;
            case 7:
                cadenaTexto = "VII";
                break;
            case 8:
                cadenaTexto = "VIII";
                break;
            case 9:
                cadenaTexto = "IX";
                break;
            case 10:
                cadenaTexto = "X";
                break;
            default:
                cadenaTexto  = "Numero incorrecto";
                break;
        }
        System.out.println("El numero es Equivalente en romano a : " + cadenaTexto);
    }
    
    public static void ejercicio15(double decimales1, double decimales2) {
        if (decimales1 >= 0 && decimales1 < 1000) {
            decimales2 = (0 * decimales1) / 100;
        } else if (decimales1 >= 1000 && decimales1 < 5000) {
            decimales2 = (3 * decimales1) / 100;
        } else if (decimales1 >= 5000 && decimales1 < 20000) {
            decimales2 = (5 * decimales1) / 100;
        } else {
            decimales2 = (8 * decimales1) / 100;
        }
        System.out.println("La bonificacion total es: $ " + decimales2);
    }
    
    public static void ejercicio16(int entero1, String cadenaTexto) {
        switch (entero1) {
            case 1:
                cadenaTexto = "A";
                break;
            case 2:
                cadenaTexto = "E";
                break;
            case 3:
                cadenaTexto = "I";
                break;
            case 4:
                cadenaTexto = "O";
                break;
            case 5:
                cadenaTexto = "U";
                break;
            default:
                cadenaTexto = "Valor incorrecto";
                break;
        }
        System.out.println("El valor correspondiente del num es: " + cadenaTexto);
    } 
    
    public static void ejercicio17(int entero1, int entero2, int entero3, int entero4, int entero5) {
        entero2 = (entero1 / 10);
        entero3 = entero1 - (entero2 * 10);            
        entero4 = entero2;
        entero5 = entero3;

        System.out.println("Numero de decenas: " + entero4);
        System.out.println("Numero de unidades: " + entero5);
    }
    
    public static void ejercicio18(int entero1, int entero2, int entero3, String cadenaTexto) {
        entero2= entero1 / 2;
        entero3 = entero1 - (entero2 * 2);
 
        if (entero3 == 0) {
            cadenaTexto = "Es par";
        } else {
            cadenaTexto= "Es impar";
        }
        System.out.println(cadenaTexto);
    }
    
    public static void ejercicio19(int number, int counter) {
        System.out.println(number);  
    
        for (counter  = 1; counter <= 4; counter++) {
            number = number + 2;
        System.out.println(number);
        }
    }
    
    public static void ejercicio20(int entero1, int counter, double decimales1, double decimales2, double decimales3, Scanner ejercicios) {
        System.out.println("Ingrese el numero de empleados");
        entero1 = ejercicios.nextInt();
                
        for (counter = 1; counter <= entero1; counter++){
            System.out.println("ingrese el sueldo del empleado " + counter + ": ");
            decimales1 = ejercicios.nextDouble();
            decimales2 = decimales2 + decimales1; 
        }
                
        decimales3 = decimales2 / entero1;
        System.out.println("El sueldo promedo de los empleados es: " + decimales3);
    }
    
    public static void ejercicio21(int counter, Scanner ejercicios, int entero1,int entero2, int entero3){
        for (counter = 1; counter <= 200; counter++){
            System.out.println("Ingrese la edad de la persona" + counter + " :");
            entero1 = ejercicios.nextInt();
                    
            if (entero1 < 18){
                entero2 = entero2 + 1;
            }else{
                entero3 = entero3 + 1;
            }
        }
        System.out.println("La cantidad de personas mayores de edad son: " + entero2);
        System.out.println("La cantidad de personas menores de edad son: " + entero3);
    }
    
    public static void ejercicio22(Scanner ejercicios, int counter, int entero1, int entero2, int entero3){
        System.out.println("ingrese el primer numero entero: ");
        entero1 = ejercicios.nextInt();
        System.out.println("ingrese el segundo numero entero: ");
        entero2 = ejercicios.nextInt();

        for (counter = 1 ; counter <= entero2 ; counter++) { 
            entero3 = entero3 + entero1;
        }
        System.out.println("el4 producto del primer y segundo numero es : " + entero3);
    }
    
    public static void ejercicio23(int counter, int entero1, int entero2){
        for (counter = 1; counter <= 10; counter++) {
            entero1 = counter / 2;
            entero2 = counter - (entero1 * 2); 

            if (entero2 == 0) {
                continue;
            } else {
                System.out.println(counter); 
            }
        }
    }
    
    public static void ejercicio24(int serie){
        while (serie < 1000){
            System.out.println(serie);
            serie = (serie * serie) + 1;
        }
    }
    
    public static void ejercicio25(Scanner ejercicios, char letra, String semaforo){
        while (semaforo.equals("V")) {
            System.out.println("Ingrese una letra");
            letra = ejercicios.next().charAt(0);   
            
            switch (letra) {
                case 'A': case 'a':
                case 'E': case 'e':
                case 'I': case 'i':
                case 'O': case 'o':
                case 'U': case 'u':
                semaforo = "R";
                break;
                default:
                semaforo = "V";
                break;     
            }
        }
                System.out.println("Se ingreso una vocal, fin del programa.");
    }
    
    public static void ejercicio26(int entero1, int segundoNum, int entero2){
        System.out.println(entero1);
        System.out.println(segundoNum);

        entero2 = entero1 + segundoNum;

        while (entero2 < 100000) {
            System.out.println(entero2);
            entero1 = segundoNum;
            segundoNum = entero2;
            entero2 = entero1 + segundoNum;
        }
    }
    
    public static void ejercicio27(Scanner ejercicios, char operador, int entero1, int entero2, int entero3, int entero4){
        System.out.print("ingrese el primer numero: ");
        entero1 = ejercicios.nextInt();
        System.out.print("ingrese el segundo numero: ");
        entero2 = ejercicios.nextInt();
        System.out.print("ingrese el operador (+, -, *, ^): ");
        operador = ejercicios.next().charAt(0); 

        switch (operador) {
            case '+':
                entero4 = entero1 + entero2;
                break;
            case '-':
                entero4 = entero1 - entero2;
                break;
            case '*':
                entero4 = entero1 * entero2;
                break;
            case '^':
                entero4 = (int) Math.pow(entero1, entero2);
                break;
            default:
                entero4 = 0; 
                break;
        }
        System.out.println("Resultado: " + entero4);
    }
    
    public static void ejercicio28(Scanner ejercicios, int counter, int entero1, char letra, int entero2){
        for (counter = 1; counter <= 10; counter++) {
            System.out.print("ingrese una letra (" + counter + "/10): ");
            letra = ejercicios.next().charAt(0);

            switch (letra) {
                case 'A': case 'a':
                    entero1 = entero1 + 1;
                    break;
                case 'E': case 'e':
                    entero1 = entero1 + 1;
                    break;
                case 'I': case 'i':
                    entero1 = entero1 + 1;
                    break;
                case 'O': case 'o':
                    entero1 = entero1 + 1;
                    break;
                case 'U': case 'u':
                    entero1 = entero1 + 1;
                    break;
                default:
                    entero2 = entero2 + 1;
                    break;
            }
        }  
            System.out.println("numero de vocales: " + entero1);
            System.out.println("numero de consonantes: " + entero2);
    }
    
    public static void ejercicio29(Scanner ejercicios, int counter, int entero1, int entero2, int entero3, int entero4, int entero5, int entero6){
        for (counter = 1; counter <= 5; counter++) {
            System.out.print("ingrese el num voto " + counter + " (1, 2, 3 o voto nulo o blanco es 0:  ");
            entero1 = ejercicios.nextInt();

            switch (entero1) {
                case 1:
                    entero2 = entero2 + 1;
                    break;
                case 2:
                    entero3 = entero3 + 1;
                    break;    
                case 3:
                    entero4 = entero4 + 1;
                    break;
                default:
                    entero5 = entero5 + 1;
                    break;
            }
                
        }

        if ((entero2 > entero3) && (entero2 > entero4) && (entero2 > entero5)) {
            entero6 = 1;
        } else if ((entero3 > entero4) && (entero3 > entero4)) {
            entero6 = 2;
        } else if (entero3 > entero4) {
            entero6 = 3;
        } else {
            entero6 = 0; 
        }
        System.out.println("el candidato ganador es el candidato: " + entero6); 
    }
    
    public static void ejercicio30(Scanner ejercicios, double decimales1, double decimales2, double decimales3, double decimales4){
        System.out.println("ingrese el primer numero: ");
        decimales1 = ejercicios.nextDouble();
        System.out.println("ingrese el segundo numero: ");
        decimales2 = ejercicios.nextDouble();
                
        decimales3 = decimales1 + decimales2;
        decimales4 = decimales3 / 2;
        System.out.println("el promedio de los dos numeros es: " + decimales4);
    }
    
    public static void ejercicio31(int entero1, Scanner ejercicios, String cadenaTexto){
        System.out.println("ingrese un numero del 1 al 12: ");
        entero1 = ejercicios.nextInt();
                
        switch(entero1){
            case 1:
                cadenaTexto = "Enero";
                break;
            case 2:
                cadenaTexto = "Febrero";
                break;
            case 3:
                cadenaTexto = "Marzo";
                break;
            case 4:
                cadenaTexto = "Abril";
                break;
            case 5:
                cadenaTexto = "Mayo";
                break;
            case 6:
                cadenaTexto = "Junio";
                break;
            case 7:
                cadenaTexto = "Julio";
                break;
            case 8:
                cadenaTexto = "Agosto";
                break;
            case 9:
                cadenaTexto = "Septiembre";
                break;
            case 10:
                cadenaTexto = "Octubre";
                break;
            case 11:
                cadenaTexto = "Noviembre";
                break;
            case 12:
                cadenaTexto = "Diciembre";
                break;
            default:
                cadenaTexto = "el numero no esta adentro del rango: ";       
        }
            System.out.println("mes: " + cadenaTexto);
    }
    
    public static void ejercicio32(Scanner ejercicios, int entero1, int entero2, int entero3, int entero4, int divisor){
        System.out.println("ingrese un numero entero diferente a cero: ");
        entero1 = ejercicios.nextInt();
                
        if (entero1 == 0){
            System.out.println("el numero no puede ser cero " );
        }else{
            System.out.println("los divisores de: " + entero1 + " son");
                    
            for(divisor = 1; divisor <= Math.abs(entero1); divisor++){
                entero2 = entero1 / divisor;
                entero3 = entero2 * divisor;
                entero4 = entero1 - entero3;
                        
                if (entero4 == 0){
                    System.out.println(divisor);
                }
            } 
        }
    } 
    
}