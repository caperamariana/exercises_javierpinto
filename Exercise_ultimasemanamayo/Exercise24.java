/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise24 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio24(){
        while (cod.serie < 1000){
            System.out.println(cod.serie);
            cod.serie = (cod.serie * cod.serie) + 1;
        }    
    }
}
