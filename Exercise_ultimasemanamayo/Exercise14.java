/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise14 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio14(){
        switch (cod.entero1) {
            case 1:
                cod.cadenaTexto = "I";
                break;
            case 2:
                cod.cadenaTexto = "II";
                break;
            case 3:
                cod.cadenaTexto = "III";
                break;
            case 4:
                cod.cadenaTexto = "IV";
                break;
            case 5:
                cod.cadenaTexto = "V";
                break;
            case 6:
                cod.cadenaTexto = "VI";
                break;
            case 7:
                cod.cadenaTexto = "VII";
                break;
            case 8:
                cod.cadenaTexto = "VIII";
                break;
            case 9:
                cod.cadenaTexto = "IX";
                break;
            case 10:
                cod.cadenaTexto = "X";
                break;
            default:
                cod.cadenaTexto  = "Numero incorrecto";
                break;
        }
            System.out.println("El numero es Equivalente en romano a : " + cod.cadenaTexto);
    }
}