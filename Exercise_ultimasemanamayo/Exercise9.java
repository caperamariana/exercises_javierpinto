/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise9 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio9(){
        cod.entero3 = cod.entero2 - cod.entero1;
        System.out.println("Tienes " + cod.entero3 + " años");
        
        if(cod.entero3>17){
            System.out.println("Debe solicitar su CUIL");
        }else{
            System.out.println("No debes solicitar su CUIL aun");
        }
    }
    
}
