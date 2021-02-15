/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.presentacion;

/**
 *
 * @author agarm
 */
public class Main_5_profesora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar 3 arrays para los diferentes trimestres de un año escolar
        // cada celda va representar la nota de un alumno
        // Obtener el promedio de los trimestres y tb obtener el promedio de los alumnos
        
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
        
    }
    
}
