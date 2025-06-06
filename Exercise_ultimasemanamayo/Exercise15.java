/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise15 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio15(){
        if (cod.decimales1 >= 0 && cod.decimales1 < 1000) {
            cod.decimales2 = (0 * cod.decimales1) / 100;
        } else if (cod.decimales1 >= 1000 && cod.decimales1 < 5000) {
            cod.decimales2 = (3 * cod.decimales1) / 100;
        } else if (cod.decimales1 >= 5000 && cod.decimales1 < 20000) {
            cod.decimales2 = (5 * cod.decimales1) / 100;
        } else {
            cod.decimales2 = (8 * cod.decimales1) / 100;
        }

        System.out.println("La bonificacion total es: $ " + cod.decimales2);
    }
    
}
