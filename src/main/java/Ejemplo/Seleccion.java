/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo;

import static Ejemplo.Burbuja.swap;

/**
 *
 * @author XxJuniorMxX
 */
public class Seleccion {
    public static int buscarIdxElementoMin(int[] arreglo, int inicio){
        int idxMin = inicio;
        for (int i = inicio; i < arreglo.length; i++) {
            if(arreglo[i]<arreglo[idxMin])
                idxMin = i;
        }
        return idxMin;
    }
    
    public static int[] sortSeleccion(int [] arreglo, int inicio){
        if(inicio>=arreglo.length) return arreglo;
        int min = buscarIdxElementoMin(arreglo, inicio);
        if(min!=inicio) swap(arreglo,inicio,min);
        return sortSeleccion(arreglo,inicio+1);
    }
  
}
