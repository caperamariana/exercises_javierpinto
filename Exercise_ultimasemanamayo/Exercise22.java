/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise22 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio22(){
        for (cod.counter = 1 ; cod.counter <= cod.entero2 ; cod.counter++) { 
            cod.entero3 = cod.entero3 + cod.entero1;
        }
        System.out.println("el producto del primer y segundo numero es : " + cod.entero3);
    }
}
