/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodosdeordenamiento;

/**
 *
 * @author XxJuniorMxX
 */
public class MetodoSeleccion {
    public static void main(String[] args) {
        int min,aux;
        int [] edades = new int[20];
        for (int i = 0; i <edades.length; i++) {
            edades[i]=(int)(Math.random()*20)+1;
        }
        System.out.println("Mostrar Arreglo Random: ");
        for (int Mostrar : edades) {
            System.out.print(Mostrar + " ");
        }
        
        //Ordenamiento Por Seleccion
        System.out.println("\nOrdenar Arreglo Metodo Selección ");
        for (int i = 0; i < edades.length; i++) {
            min = i;
            for (int j = i+1; j < edades.length; j++) {
                if(edades[j]<edades[min]){
                min=j;
                }
            }
            aux=edades[i];
            edades[i]=edades[min];
            edades[min]=aux;
        }
        System.out.println("Imprmir Arreglo Ordenado: ");
        for (int mostrar : edades) {
            System.out.print(" " + mostrar);
        }
        
    }
    
}
