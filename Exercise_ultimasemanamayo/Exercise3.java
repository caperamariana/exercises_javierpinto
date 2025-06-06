/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise3 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio3() {
        cod.entero1 = (cod.entero1 * 4) + (cod.entero2 * -1); 
        System.out.println("El puntaje final es: " + cod.entero1);

        if (cod.entero1 >= 50) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }
        
    }
}
