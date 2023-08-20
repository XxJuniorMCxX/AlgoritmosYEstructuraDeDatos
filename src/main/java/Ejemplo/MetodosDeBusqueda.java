/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo;
import java.util.*;
/**
 *
 * @author XxJuniorMxX
 */
public class MetodosDeBusqueda 
{

    public static void constante() {
        String[] ciudad = {"Lima", "Piura", "Chiclayo"};
        System.out.println("Ordenado de Forma Menor a Mayor");
        Arrays.sort(ciudad);
        for (String ciu : ciudad) {
            System.out.print(ciu + " ");
        }
    }

    public static void main(String[] args) {
        
       // constante();
        //ordenar();
        //metodoBurbuja();//Buble Sort
        //metodoSeleccion();//Selection Sort
        metodoInsercion();//Insert Sort Parecido a Ordenar Cartas de Una Baraja 
        
        
        
       
        
    }
    
    
    //Seleccion
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
    
    //Metodo Burbuja
    public static void metodoBurbuja(){
        int[] edad = {3,5,8,1,5};  
        System.out.println("Arreglo Ordenado");
        for (int mostrar : edad) {
            System.out.println(mostrar + " ");
        }
        System.out.println("Ordenando Con Metodo Burbuja");
        sortBubble(edad);
        for (int i : edad) {
            System.out.println(" " + i + " ");
        }
        
        sortSeleccion(edad, 0);
        System.out.println("Ordenando con Selecion");
        for (int i : edad) {
            System.out.println(" " + i + " ");
        }
    }
    
      public static void metodoSeleccion(){
     int[] edad = {3,5,8,1,5};
        
        System.out.println("Arreglo Ordenado");
        for (int mostrar : edad) {
            System.out.println(mostrar + " ");
        }
        System.out.println("Ordenando con Selecion");
        sortSeleccion(edad, 0);
       
        for (int i : edad) {
            System.out.println(" " + i + " ");
        }
    }
    public static void ordenar(){
    String nombre1,nombre2;
    nombre1="Juan";
    nombre2="Rosa";
        System.out.println(nombre1 + " " + nombre2);
    String aux=nombre1;
    nombre1=nombre2;
     System.out.println(aux);
    nombre2=aux;
       
        System.out.println(nombre1 + " " + nombre2);
            
    }
    public static void swap(int arreglo[],int i, int j){
        int aux = arreglo[i];
        arreglo[i]=arreglo[j];
        arreglo[j]=aux;
        
    }
    public static int[] sort(int []arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length-1; j++) {
                if(arreglo[i]<arreglo[i+1]){
                   swap(arreglo,j,j+1);
                }
            }
        }
    return arreglo;
    
    }
   public static int[] sortBubble(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length-1; j++) {
                if(arreglo[j]>arreglo[j+1]){
                    swap(arreglo,j,j+1);
                }
            }
        }
        
        return arreglo;
    } 
   
   
   public static int[] sortInsert(int[] arreglo){
        int i = 1;
       while(i<arreglo.length){
           int j=i;
           while(j>0 && arreglo[j-1] > arreglo[j]){
               swap(arreglo,j,j-1);
               j-=1;
           }
           i+=1;
       }
       return arreglo; 
    }
   public static void metodoInsercion(){
     int[] edad = {3,5,8,1,4,9,7};
        
        System.out.println("Arreglo Ordenado");
        for (int mostrar : edad) {
            System.out.println(mostrar + " ");
        }
        System.out.println("Ordenando con Insercion");
        sortInsert(edad);
       
        for (int i : edad) {
            System.out.println(" " + i + " ");
        }
    }

}
