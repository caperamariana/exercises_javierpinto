/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise10 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio10(){
        if (cod.entero1 > cod.entero2){
            System.out.println("El primer hermano es mayor , por");
            cod.entero3 = cod.entero1 - cod.entero2;
        }else{
            System.out.println("El primer hermano es menor , por");
            cod.entero3 = cod.entero2 - cod.entero1;
        }
    }
    
}
