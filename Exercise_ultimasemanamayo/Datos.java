/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;
import static com.mycompany.principalexercises.PrincipalExercises.ejercicios;

/**
 *
 * @author gimji
 */
public class Datos {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void LeerDatos1(){
        System.out.print("Ingrese la velocidad: ");
        cod.entero1 = cod.ejercicios.nextInt();
        System.out.print("Ingrese el tiempo: ");
        cod.entero2 = cod.ejercicios.nextInt();
    }
    
    public static void LeerDatos2(){
        System.out.print("Ingrese nota 1: ");
        cod.entero1 = cod.ejercicios.nextInt();
        System.out.print("Ingrese nota 2: ");
        cod.entero2 = cod.ejercicios.nextInt();
        System.out.print("Ingrese nota 3: ");
        cod.entero3 = cod.ejercicios.nextInt();
    }
    
    public static void LeerDatos3(){
        System.out.print("Ingrese numero de respuestas correctas: ");
        cod.entero1 = cod.ejercicios.nextInt();
        System.out.print("Ingrese numero de respuestas incorrectas: ");
        cod.entero2 = cod.ejercicios.nextInt();
        System.out.print("Ingrese numero de respuestas en blanco: ");
        cod.entero3 = cod.ejercicios.nextInt();
    }
    
    public static void LeerDatos4(){
        System.out.print("Ingrese número de partidos ganados: ");
        cod.entero1 = cod.ejercicios.nextInt();
        System.out.print("Ingrese número de partidos empatados: ");
        cod.entero2 = cod.ejercicios.nextInt();
        System.out.print("Ingrese número de partidos perdidos: ");
        cod.entero3 = cod.ejercicios.nextInt(); 
    }
    
    public static void LeerDatos5(){
        System.out.println("Ingrese el Numero de Horas laboradas en el mes: ");
        cod.entero1 = cod.ejercicios.nextInt();
        System.out.println("Ingrese su Tarifa por Hora: ");
        cod.entero2 = cod.ejercicios.nextInt();
    }
    
    public static void LeerDatos6(){
        System.out.println("Ingrese la longitud del lado A: ");
        cod.decimales1 = cod.ejercicios.nextDouble();
        System.out.println("Ingrese la longitud del lado B: ");
        cod.decimales2 = cod.ejercicios.nextDouble();
        System.out.println("Ingrese la longitud del lado C: ");
        cod.decimales3 = cod.ejercicios.nextDouble();
    }
    
    public static void LeerDatos7decimal(){
        System.out.println("Ingrese el numero de Gigabytes del disco duro: ");
        cod.decimales1 = cod.ejercicios.nextDouble();
    }
    
    public static void LeerDatos8decimal(){
        System.out.println("Ingrese la Abscisa del punto A: ");
        cod.decimales1 = cod.ejercicios.nextDouble();
        System.out.print("Ingrese la Abscisa del punto B: ");
        cod.decimales2 = cod.ejercicios.nextDouble();
        System.out.print("Ingrese la Ordenada del punto A: ");
        cod.decimales3 = cod.ejercicios.nextDouble();
        System.out.print("Ingrese la Ordenada del punto B: ");
        cod.decimales4 = cod.ejercicios.nextDouble();
    }
    
    public static void LeerDatos9(){
        System.out.println("Ingrese el año de nacimiento");
        cod.entero1 = cod.ejercicios.nextInt();
        System.out.println("Ingrese el año actual");
        cod.entero2 = cod.ejercicios.nextInt();
    }
    
    public static void LeerDatos10(){
        System.out.println("Ingrese la edad del primer hermano");
        cod.entero1 = cod.ejercicios.nextInt();
        System.out.println("Ingrese la edad del segundo hermano");
        cod.entero2 = cod.ejercicios.nextInt();
    }
    
    public static void LeerDatos11(){
        System.out.println("Ingrese la produccion del dia lunes:");
        cod.entero1 = cod.ejercicios.nextInt();
        System.out.println("Ingrese la produccion del dia martes: ");
        cod.entero2 = cod.ejercicios.nextInt();
        System.out.println("Ingrese la produccion del dia miercoles: ");
        cod.entero3 = cod.ejercicios.nextInt();
        System.out.println("Ingrese la produccion del dia jueves: ");
        cod.entero4 = cod.ejercicios.nextInt();
        System.out.println("Ingrese la produccion del dia viernes: ");
        cod.entero5 = cod.ejercicios.nextInt();
        System.out.println("Ingrese la produccion del dia sabado: ");
        cod.entero6 = cod.ejercicios.nextInt();
    }
    
    public static void LeerDatos12(){
        System.out.println("Ingrese el Primer Numero Entero: ");
        cod.entero1 = cod.ejercicios.nextInt();
        System.out.println("Ingrese el Segundo Numero Entero: ");
        cod.entero2 = cod.ejercicios.nextInt();
        System.out.println("Ingrese el Tercer Numero Entero: ");
        cod.entero3 = cod.ejercicios.nextInt();
    }
    
    public static void LeerDatos13decimal(){
        System.out.println("Ingrese el numero del primer lado: ");
        cod.decimales1 = cod.ejercicios.nextInt();
        System.out.println("Ingrese el numero del segundo lado: ");
        cod.decimales2 = cod.ejercicios.nextInt();
        System.out.println("Ingrese el numero del tercer lado: ");
        cod.decimales3 = cod.ejercicios.nextInt();
    }
    
    public static void LeerDatos14(){
        System.out.println("Ingrese un numero entero del (1 a 10): ");
        cod.entero1 = cod.ejercicios.nextInt();
    }
    
    public static void LeerDatos15(){
        System.out.println("Ingrese el monto de venta del mes: ");
        cod.decimales1 = cod.ejercicios.nextDouble();   
    }
    
    public static void LeerDatos16(){
        System.out.println("Ingrese un numero entero del 1 al 5: ");
        cod.entero1 = cod.ejercicios.nextInt();
    }
    
    public static void LeerDatos17(){
        System.out.print("Ingrese un numero entero de 2 digitos: ");
        cod.entero1 = cod.ejercicios.nextInt();
    }
    
    public static void LeerDatos18(){
        System.out.print("Ingrese un numero entero diferente a cero: ");
        cod.entero1 = cod.ejercicios.nextInt();
    }
    
    public static void LeerDatos19(){
        System.out.println(cod.number);
    }
    
    public static void LeerDatos20(){
        System.out.print("Ingrese el numero de empleados: ");
        cod.entero1 = cod.ejercicios.nextInt();
    }
    
    public static void LeerDatos22(){
        System.out.println("ingrese el primer numero entero: ");
        cod.entero1 = cod.ejercicios.nextInt();
        System.out.println("ingrese el segundo numero entero: ");
        cod.entero2 = cod.ejercicios.nextInt();
    }
    
    public static void LeerDatos26(){
        System.out.println(cod.entero1);
        System.out.println(cod.segundoNum);
    }
    
    public static void LeerDatos27(){
        System.out.print("Ingrese el primer numero: ");
        cod.entero1 = cod.ejercicios.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        cod.entero2 = cod.ejercicios.nextInt();
        System.out.print("Ingrese el operador (+, -, *, ^): ");
        cod.operador = cod.ejercicios.next().charAt(0);
    }
    
    public static void LeerDatos30(){
        System.out.println("Ingrese el primer numero: ");
        cod.decimales1 = cod.ejercicios.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        cod.decimales2 = cod.ejercicios.nextDouble();
    }
    
    public static void LeerDatos31(){
        System.out.println("Ingrese un numero del 1 al 12: ");
        cod.entero1 = cod.ejercicios.nextInt();
    }
    
    public static void LeerDatos32(){
        System.out.println("Ingrese un numero entero diferente a cero: ");
        cod.entero1 = cod.ejercicios.nextInt();
    }
    
    
    
    
    
    
    
    
    
            
            
    
    
    
}
