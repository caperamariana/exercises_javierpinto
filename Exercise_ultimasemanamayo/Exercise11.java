/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise11 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio11(){
        cod.entero7 = cod.entero1 + cod.entero2 + cod.entero3 + cod.entero4 + cod.entero5 + cod.entero6;
        cod.entero8 = cod.entero7 / 6;

        if (cod.entero8 >= 100) {
            System.out.println("MSG = Recibira Incentivos");
        } else {
            System.out.println("MSG = No recibira Incentivos");
        }

        System.out.println(cod.entero8);
    }
}
