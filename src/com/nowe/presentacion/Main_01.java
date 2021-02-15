/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.presentacion;

import java.util.Scanner;

/**
 *
 * @author agarm
 */
public class Main_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir un array de 5 posiciones, obtener el número mayor almacenado en el array
        //Y decir en qué posición está
        
        //1. Declaración de variables
        int[] num = {1,5,2,8,3};
        int numMayor =Integer.MIN_VALUE, posicion = 0;
        
        //2. Estructura for
        for (int i = 0; i <num.length; i++) {
            if(num[i] > numMayor){
                numMayor = num[i]; 
                posicion = i;
            }
        }
        //3. Se muestra el resultado
        System.out.println("El número mayor -> " + numMayor+ " posición -> " + posicion);
    }
    
}
