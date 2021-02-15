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
public class Main_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Definir dos arrays con datos
        Definir uno tercero para almacenar la suma de los dos anteriores
        Con bucles
         */
        //1. Variables
        int[] num1 = {1,2,3};
        int[] num2 = {3,1,4};
        int[] resultado = new int[num1.length]; 
        
        //2. Bucle for para sumar num1 y num2
        for (int i = 0; i < num1.length; i++) {
            resultado[i] = num1[i] + num2[i];
        }
        //3. Bucle for para mostrar el resultado de la suma
        System.out.println("El array resultado de la suma es -> ");
        for (int i = 0; i < resultado.length; i++) {
          System.out.print(resultado[i] + ", ");  
        }
        //En vez del último bucle para mostrar resultado puedo poner, sin bucle:
        //System.out.println("Resultado -> " + Arrays.toString(resultado));
        //Y tengo que importar java.util.Arrays;
    }
}
