/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise18 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio18(){
        cod.entero2= cod.entero1 / 2;
        cod.entero3 = cod.entero1 - (cod.entero2 * 2);
 
        if (cod.entero3 == 0) {
            cod.cadenaTexto = "Es par";
        } else {
            cod.cadenaTexto= "Es impar";
        }

        System.out.println(cod.cadenaTexto);
    }
}
