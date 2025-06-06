/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise26 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio26(){
        cod.entero2 = cod.entero1 + cod.segundoNum;

        while (cod.entero2 < 100000) {
            System.out.println(cod.entero2);
            cod.entero1 = cod.segundoNum;
            cod.segundoNum = cod.entero2;
            cod.entero2 = cod.entero1 + cod.segundoNum;
        }
    }  
}
