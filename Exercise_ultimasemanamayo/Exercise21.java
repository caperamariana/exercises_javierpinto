/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise21 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio21(){
        for (cod.counter = 1; cod.counter <= 200; cod.counter++){
            System.out.println("Ingrese la edad de la persona" + cod.counter + " :");
            cod.entero1 = cod.ejercicios.nextInt();
                    
            if (cod.entero1 < 18){
                cod.entero2 = cod.entero2 + 1;
            }else{
                cod.entero3 = cod.entero3 + 1;
                }
        }
                
        System.out.println("La cantidad de personas mayores de edad son: " + cod.entero2);
        System.out.println("La cantidad de personas menores de edad son: " + cod.entero3);
    }   
}
