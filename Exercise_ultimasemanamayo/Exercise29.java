/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise29 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio29(){
        for (cod.counter = 1; cod.counter <= 5; cod.counter++) {
            System.out.print("ingrese el num voto " + cod.counter + " (1, 2, 3 o voto nulo o blanco es 0:  ");
            cod.entero1 = cod.ejercicios.nextInt();

            switch (cod.entero1) {
                case 1:
                    cod.entero2 = cod.entero2 + 1;
                    break;
                case 2:
                    cod.entero3 = cod.entero3 + 1;
                    break;
                case 3:
                    cod.entero4 = cod.entero4 + 1;
                    break;
                default:
                    cod.entero5 = cod.entero5 + 1;
                    break;
            }
        }

                if ((cod.entero2 > cod.entero3) && (cod.entero2 > cod.entero4) && (cod.entero2 > cod.entero5)) {
                    cod.entero6 = 1;
                } else if ((cod.entero3 > cod.entero4) && (cod.entero3 > cod.entero4)) {
                    cod.entero6 = 2;
                } else if (cod.entero3 > cod.entero4) {
                    cod.entero6 = 3;
                } else {
                    cod.entero6 = 0; 
                }

                System.out.println("el candidato ganador es el candidato: " + cod.entero6);
    }
    
}
