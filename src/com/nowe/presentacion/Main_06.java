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
public class Main_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El método para copiar arrays se llama arraycopy, mirar en el pdf
  
        //Declaración de variables
        int[] t1 = {10,6,8};
        int[] t2 = {9,5,7};
        int[] t3 = {8,4,6};
        
        
        int sumaT1=0, sumaT2=0, sumaT3=0, sumaA=0;
        
        for (int i = 0; i < t1.length; i++) {
            sumaT1 += t1[i];
            sumaT2 += t2[i];
            sumaT3 += t3[i];
        }
        
        System.out.println("Promedio Primer trimestre -> " + (sumaT1/t1.length));
        System.out.println("Promedio Segundo trimestre -> " + (sumaT2/t2.length));
        System.out.println("Promedio Primer trimestre -> " + (sumaT3/t3.length));
        
        for (int i = 0; i < t1.length; i++) {
            sumaA = t1[i] + t2[i] + t3[i];
            System.out.println("Promedio del alumno " + i + " -> " + sumaA/3);
        }
        
       /*
        COPIAR ARRAYS
        La clase System aporta un método arraycopy que permite copiar un array en otro.
        Veamos la sintaxis:
        Gráfico 22. Sintaxis del método arraycopy
        39
        A continuación detallamos cada uno de sus parámetros:
        • src; El array origen, del cual vamos a copiar los datos.
        • srcPos; posición desde la cual empezamos a copiar en el array de origen
        • dest; El array destino, en el cual vamos a pegar los datos.
        • destPos; posición desde la cual empezamos a pegar en el array de destino
        • length; el número de elementos que serán copiados.
        Vamos a ver un ejemplo en el cual copiamos 3 elementos del array nums comenzando
        en el índice 2 y los pegamos en el array números a partir de la posición con índice 1.
         */
        
        //Vamos a unir la información de los 3 trimestres en un sólo array
        
        int[] notas = new int[9];
        System.arraycopy(t1, 0, notas, 0, 3);
        System.arraycopy(t2, 0, notas, 3, 3);
        //abajo: origen t3, queremos empezar desde la posicion 0 y pegarlo en notas, en la posicion 6 y queremos pegar 3 elementos
        System.arraycopy(t3, 0, notas, 6, 3);
        // t3, 0 posición del origen, notas, pega en la posición 6 del array nuevo notas, destino y 3 elementos
        //esto se llama argumentos o parametros
        System.out.println("Notas -> " + Arrays.toString(notas));
        
    }

}
