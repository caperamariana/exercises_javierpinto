/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise16 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio16(){
        switch (cod.entero1) {
            case 1:
                cod.cadenaTexto = "A";
                break;
            case 2:
                cod.cadenaTexto = "E";
                break;
            case 3:
                cod.cadenaTexto = "I";
                break;
            case 4:
                cod.cadenaTexto = "O";
                break;
            case 5:
                cod.cadenaTexto = "U";
                break;
            default:
                cod.cadenaTexto = "Valor incorrecto";
                break;
        }

        System.out.println("El valor correspondiente del número es: " + cod.cadenaTexto);
    }

}
