/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise12 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio12(){
        if (cod.entero1 > cod.entero2 && cod.entero1 > cod.entero3) {
            cod.entero4 = cod.entero1;
        }else if (cod.entero2 > cod.entero3) {
            cod.entero4 = cod.entero2;
        }else{
            cod.entero4 = cod.entero3;
        }
        System.out.println("El numero mayor de los tres es el: " + cod.entero4); 
    }
}
