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
public class Main_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar 3 arrays para los diferentes trimestres de un año escolar
        // Cada celda va a representar la nota de un alumno
        // Obtener el promedio de los trimestres y también obtener el promedio de los alumnos
        // trimestre 1, 2, 3 Y cada celda es la nota de un alumno distinto
        // 3 alumnos
        // ES MEJOR EL DE LA PROFESORA, EL SIGUIENTE MAIN

        //1. Variables
        int[] t1 = {5, 7, 9};
        int[] t2 = {6, 5, 7};
        int[] t3 = {7, 9, 8};
        int promT1=0, promT2=0, promT3=0, promA1=0, promA2=0, promA3=0;

        for (int i = 0; i < t1.length; i++) {
          promT1 += t1[i];
          promT2 += t2[i];
          promT3 += t3[i];
        }
        promA1 = t1[0] + t2[0] + t3[0];
        promA2 = t1[1] + t2[1] + t3[1];
        promA3 = t1[2] + t2[2] + t3[2];
        
        System.out.println("Promedio del primer trimestre -> " + promT1/3 + " Promedio del segundo trimestre -> " + promT2/3 + " Promedio del tercer trimestre ->  " + promT3/3);
        System.out.println("Promedio primer alumno -> " + promA1/3 + " Promedio segundo alumno -> " + promA2/3 + " Promedio tercer alumno -> " + promA3/3);
    }

}
