/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise20 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio20(){
        for (cod.counter = 1; cod.counter <= cod.entero1; cod.counter++){
            System.out.println("Ingrese el sueldo del empleado " + cod.counter + ":");
            cod.decimales1 = cod.ejercicios.nextDouble();
            cod.decimales2 = cod.decimales2 + cod.decimales1; 
        }
                
        cod.decimales3 = cod.decimales2 / cod.entero1;
        System.out.println("El sueldo promedo de los empleados es: " + cod.decimales3);
    }
    
}
