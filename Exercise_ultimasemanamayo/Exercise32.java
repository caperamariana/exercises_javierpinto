/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise32 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio32(){
        if (cod.entero1 == 0){
            System.out.println("el numero no puede ser cero " );
        }else{
            System.out.println("los divisores de: " + cod.entero1 + " son");
                    
            for(cod.divisor = 1; cod.divisor <= Math.abs(cod.entero1); cod.divisor++){
                cod.entero2 = cod.entero1 / cod.divisor;
                cod.entero3 = cod.entero2 * cod.divisor;
                cod.entero4 = cod.entero1 - cod.entero3;
                        
                if (cod.entero4 == 0){
                    System.out.println(cod.divisor);
                }
            } 
        }
        
    }
    
}
