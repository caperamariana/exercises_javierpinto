/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise28 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio28(){
        for (cod.counter = 1; cod.counter <= 10; cod.counter++) {
            System.out.print("ingrese una letra (" + cod.counter + "/10): ");
            cod.letra = cod.ejercicios.next().charAt(0);

            switch (cod.letra) {
                case 'A': case 'a':
                    cod.entero1 = cod.entero1 + 1;
                    break;
                case 'E': case 'e':
                    cod.entero1 = cod.entero1 + 1;
                    break;
                case 'I': case 'i':
                    cod.entero1 = cod.entero1 + 1;
                    break;
                case 'O': case 'o':
                    cod.entero1 = cod.entero1 + 1;
                    break;
                case 'U': case 'u':
                    cod.entero1 = cod.entero1 + 1;
                    break;
                default:
                    cod.entero2 = cod.entero2 + 1;
                    break;
            }
        }
        
        System.out.println("numero de vocales: " + cod.entero1);
        System.out.println("numero de consonantes: " + cod.entero2);
    } 
}
