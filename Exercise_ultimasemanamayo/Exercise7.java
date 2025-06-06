/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise7 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio7(){
        cod.decimales2 = cod.decimales1 * 1024;
        cod.decimales3 = ((cod.decimales2 / 700) + 1);
        System.out.println("Se necesitan " + cod.decimales3 + " CDs para la copia de seguridad");
    }
    
}
