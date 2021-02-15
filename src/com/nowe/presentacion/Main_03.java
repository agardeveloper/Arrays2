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
public class Main_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Encontrar el número mayor y guardar en la posición 0 del array
        // Y donde estaba el número mayor dejar el de la posición 0
        
        //1. Declaración de variables
        int[] num = {1,5,2,8,3};
        int numMayor =Integer.MIN_VALUE, posicion = 0;
        int auxiliar;
        
        //2. Estructura for
        for (int i = 0; i <num.length -1; i++) { // length -1 porque como hacemos por abajo i+1 para que no se salga de rango del array en la última posición
            if(num[i+1] > num[0]){
                auxiliar = num[0]; // la primera posición la guardamos en auxiliar
                num[0] = num[i+1]; // lo de la posición 0 toma el valor de la i+1, y se borra lo del num[0]
                num[i+1] = auxiliar; //lo que teníamos en el auxiliar lo ponemos en el i+1
            }
        }
        //3. Se muestra el resultado
        System.out.println("Array cambiado -> " + Arrays.toString(num));
    }
    }
  