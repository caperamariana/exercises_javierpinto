/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalexercises;

/**
 *
 * @author gimji
 */
public class Exercise31 {
    public static PrincipalExercises cod = new PrincipalExercises();
    
    public static void ejercicio31(){
        switch(cod.entero1){
            case 1:
                cod.cadenaTexto = "Enero";
                break;
            case 2:
                cod.cadenaTexto = "Febrero";
                break;
            case 3:
                cod.cadenaTexto = "Marzo";
                break;
            case 4:
                cod.cadenaTexto = "Abril";
                break;
            case 5:
                cod.cadenaTexto = "Mayo";
                break;
            case 6:
                cod.cadenaTexto = "Junio";
                break;
            case 7:
                cod.cadenaTexto = "Julio";
                break;
            case 8:
                cod.cadenaTexto = "Agosto";
                break;
            case 9:
                cod.cadenaTexto = "Septiembre";
                break;
            case 10:
                cod.cadenaTexto = "Octubre";
                break;
            case 11:
                cod.cadenaTexto = "Noviembre";
                break;
            case 12:
                cod.cadenaTexto = "Diciembre";
                break;
            default:
                cod.cadenaTexto = "el numero no esta adentro del rango: ";       
        }
                
        System.out.println("mes: " + cod.cadenaTexto);
    }
    
}
