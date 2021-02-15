/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.presentacion;
import java.util.Arrays;

/**
 *
 * @author agarm
 */
public class Main_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar un array con números , guardar en la posición 0 el número mayor, intercambiando los valores entre la
        //posición 0 y donde se encuentra el numero mayor
        
        int[] numeros = {1,2,3,4,5};
        int aux;
        
        for (int i = 0; i < numeros.length -1; i++) {
            if (numeros[i+1] > numeros[0]) {
                aux = numeros[0];
                numeros[0] = numeros[i+1];
                numeros[i+1] = aux;
            }
        }
        System.out.println("El número mayor en la posición 0 -> " + Arrays.toString(numeros));
        
    }
   }
    
