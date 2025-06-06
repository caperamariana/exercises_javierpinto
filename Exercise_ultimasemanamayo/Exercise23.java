/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise23 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio23(){
        for (cod.counter = 1; cod.counter <= 10; cod.counter++) {
            cod.entero1 = cod.counter / 2;
            cod.entero2 = cod.counter - (cod.entero1 * 2); 

            if (cod.entero2 == 0) {
                continue;
            } else {
                System.out.println(cod.counter); 
            }
        }
    }
}
