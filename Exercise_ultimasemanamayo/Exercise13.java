/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise13 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio13(){
        if (cod.decimales1 != cod.decimales2 && cod.decimales2 != cod.decimales3 && cod.decimales3 != cod.decimales3) {
            cod.cadenaTexto = "Escaleno";
        } else if (cod.decimales1 == cod.decimales2 && cod.decimales2 == cod.decimales3) {
            cod.cadenaTexto = "Equilatero";
        } else {
            cod.cadenaTexto = "Isosceles";
        }
        System.out.println("El tipo de triangulo es: " + cod.cadenaTexto);
    }
}
