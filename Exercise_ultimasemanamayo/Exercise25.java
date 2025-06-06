/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise25 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio25(){
        while (cod.semaforo.equals("V")) {
            System.out.println("Ingrese una letra");
            cod.letra = cod.ejercicios.next().charAt(0);   
            
            switch (cod.letra) {
                case 'A': case 'a':
                case 'E': case 'e':
                case 'I': case 'i':
                case 'O': case 'o':
                case 'U': case 'u':
                    cod.semaforo = "R";
                    break;
                default:
                    cod.semaforo = "V";
                    break;     
            }
        }
        System.out.println("Se ingreso una vocal, fin del programa."); 
    }
}
