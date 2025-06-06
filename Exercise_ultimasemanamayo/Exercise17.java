/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise17 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio17(){
        cod.entero2 = (cod.entero1 / 10);
        cod.entero3 = cod.entero1 - (cod.entero2 * 10);            
        cod.entero4 = cod.entero2;
        cod.entero5 = cod.entero3;

        System.out.println("Numero de decenas: " + cod.entero4);
        System.out.println("Numero de unidades: " + cod.entero5);
    } 
}
