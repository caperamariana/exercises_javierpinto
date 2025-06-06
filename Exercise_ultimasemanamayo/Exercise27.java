/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise27 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio27(){
        switch (cod.operador) {
            case '+':
                cod.entero4 = cod.entero1 + cod.entero2;
                break;
            case '-':
                cod.entero4 = cod.entero1 - cod.entero2;
                break;
            case '*':
                cod.entero4 = cod.entero1 * cod.entero2;
                break;
            case '^':
                cod.entero4 = (int) Math.pow(cod.entero1, cod.entero2);
                break;
            default:
                cod.entero4 = 0; 
                break;
        }

        System.out.println("Resultado: " + cod.entero4);
        
    }
    
}
