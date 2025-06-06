/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise6 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio6(){
        cod.decimales4 = (cod.decimales1 + cod.decimales2 + cod.decimales3) / 2;
        cod.decimales5 = Math.sqrt(cod.decimales4 * (cod.decimales4 - cod.decimales1) * (cod.decimales4 - cod.decimales2) * (cod.decimales4 - cod.decimales3));
        System.out.println("El area total del triangulo es: " + cod.decimales5);
    }
    
}
