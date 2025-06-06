/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise8 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio8(){
        cod.decimales5 = Math.sqrt(Math.pow(cod.decimales2 - cod.decimales1, 2) + Math.pow(cod.decimales4 - cod.decimales3, 2));
        System.out.println("la distancia entre los puntos A y B es: " + cod.decimales5);
    }
}
