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

public class PrincipalExercises { 
    
    static Scanner ejercicios = new Scanner(System.in);

    public static int entero1 = 0, entero2 = 0, entero3 = 0, entero4 = 0, entero5 = 0 , entero6 = 0, 
                      entero7 = 0, entero8 = 0, var1, counter = 0, number = 2, serie = 1 , segundoNum = 1, divisor=0;
    public static String cadenaTexto, semaforo = "V";
    public static double decimales1 = 0, decimales2 = 0, decimales3 = 0, decimales4 = 0, decimales5 = 0;
    public static char letra, operador;
    
    public static void main(String[] args) {
        PrincipalExercises cod = new PrincipalExercises();
        
        do{
        
        System.out.print("Digite una opcion (var1) del 1 al 32 (0 para salir): ");
        var1 = ejercicios.nextInt();

        switch (var1) {
            case 1:
            {
                Datos.LeerDatos1();
                Exercise1.ejercicio1();
                break;
            }

            case 2:
            {
                Datos.LeerDatos2();
                Exercise2.ejercicio2();
                break;
            }

            case 3:
            {
                Datos.LeerDatos3();
                Exercise3.ejercicio3();
                break;
            }

            case 4:
            {
                Datos.LeerDatos4();
                Exercise4.ejercicio4();
                break;
            }
            
            case 5: 
            {
                Datos.LeerDatos5();
                Exercise5.ejercicio5();
                break;
            }
            
            case 6:
            {
                Datos.LeerDatos6();
                Exercise6.ejercicio6();
                break;
            }
            
            case 7:
            {
                Datos.LeerDatos7decimal();
                Exercise7.ejercicio7();
                break;
            }
            
            case 8:
            {
                Datos.LeerDatos8decimal();
                Exercise8.ejercicio8();
                break;
            }
            
            case 9:
            {
                Datos.LeerDatos9();
                Exercise9.ejercicio9();
                break;
            }
            
            case 10:
            {
                Datos.LeerDatos10();
                Exercise10.ejercicio10();
                break;
            }
            
            case 11:
            {    
                   
                Datos.LeerDatos11();
                Exercise11.ejercicio11();
                break;
            }
            
            case 12:
            {
                Datos.LeerDatos12();
                Exercise12.ejercicio12();
                break;
            }      
            
            case 13:
            {
                Datos.LeerDatos13decimal();
                Exercise13.ejercicio13();
                break;
            }
            
            case 14:
            {
                Datos.LeerDatos14();
                Exercise14.ejercicio14();
                break;
            }
            
            case 15:
            {
                Datos.LeerDatos15();
                Exercise15.ejercicio15();
                break;
            }
            
            case 16:
            {
                Datos.LeerDatos16();
                Exercise16.ejercicio16();
                break;
            }   
            
            case 17:
            {
                Datos.LeerDatos17();
                Exercise17.ejercicio17();
                break;
            }
            
            case 18: 
            {
                Datos.LeerDatos18();
                Exercise18.ejercicio18();
                break;
                
            }
            
            case 19:
            {
                Datos.LeerDatos19();
                Exercise19.ejercicio19();
                break;
            }
            
            case 20:
            {
                Datos.LeerDatos20();
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
                Datos.LeerDatos22();
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
                Datos.LeerDatos26();
                Exercise26.ejercicio26();
                break;
            }
            
            case 27:
            {
                Datos.LeerDatos27();
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
                Datos.LeerDatos30();
                Exercise30.ejercicio30();
                break;
            }
            
            case 31:
            {
                Datos.LeerDatos31();
                Exercise31.ejercicio31();
                break;
            }
            
            case 32:
            {
                Datos.LeerDatos32();
                Exercise32.ejercicio32();
                break;
            }
            default:
                System.out.println("Opción no válida.");
                break;
        }
    } while (var1 != 0);

        ejercicios.close();
    }
}