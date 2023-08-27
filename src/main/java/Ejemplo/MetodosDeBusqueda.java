/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo;

import javax.swing.JOptionPane;

/**
 *
 * @author XxJuniorMxX
 */
public class MetodosDeBusqueda {

    public static void swap(int arreglo[], int i, int j) {
        int aux = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = aux;
    }

    //Metodo Burbuja
    public void metodoBurbuja() {
        //int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Cantidad de Números"));
        int aux;
        int[] edad = new int[20];
        for (int i = 0; i < edad.length; i++) {
            edad[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Arreglo De Burbuja Sin Ordenar");
        for (int mostrar : edad) {
            System.out.print(mostrar + "  ");
        }
        System.out.print("\nOrdenando Con Metodo Burbuja\n");
        sortBubble(edad);
        for (int i : edad) {
            System.out.print(i + "  ");
        }
    }

    public static int[] sortBubble(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {//if numeroActual>numeroSiguiente swap(cambio)
                    swap(arreglo, j, j + 1);
                }
            }
        }

        return arreglo;
    }

//    public static int[] sort(int[] arreglo) {
//        for (int i = 0; i < arreglo.length; i++) {
//            for (int j = 0; j < arreglo.length - 1; j++) {
//                if (arreglo[i] < arreglo[i + 1]) {
//                    swap(arreglo, j, j + 1);
//                }
//            }
//        }
//        return arreglo;
//
//    }
    //Seleccion
    //Metodo De Seleccion
    public static void metodoSeleccion() {
        //int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Cantidad de Números"));
        int aux;
        int[] edad = new int[20];
        for (int i = 0; i < edad.length; i++) {
            edad[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("\nArreglo Creado De Seleccion");
        for (int mostrar : edad) {
            System.out.print(mostrar + "  ");
        }
        System.out.print("\nOrdenando Con Metodo De Seleccion\n");
        sortSeleccion(edad, 0);
        for (int i : edad) {
            System.out.print(i + "  ");
        }
    }
    //TOMAMOS EL MENOR COMO EL PRIMERO DE TODOS LOS  ELEMENTOS
    public static int buscarIdxElementoMin(int[] arreglo, int inicio) {
        int idxMin = inicio;
        for (int i = inicio; i < arreglo.length; i++) {
            if (arreglo[i] < arreglo[idxMin]) {
                idxMin = i;
            }
        }
        return idxMin;
    }

    public static int[] sortSeleccion(int[] arreglo, int inicio) {
        if (inicio >= arreglo.length) {
            return arreglo;
        }
        int min = buscarIdxElementoMin(arreglo, inicio);
        if (min != inicio) {
            swap(arreglo, inicio, min);
        }
        return sortSeleccion(arreglo, inicio + 1);
    }

    //3.-Metodo Inserccion 
    public static void metodoInsercion() {
        //int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Cantidad de Números"));
        int aux;
        int[] edad = new int[20];
        for (int i = 0; i < edad.length; i++) {
            edad[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("\nArreglo Creado De Insercion");
        for (int mostrar : edad) {
            System.out.print(mostrar + "  ");
        }
        System.out.print("\nOrdenando Con Metodo De Insercion\n");
        sortInsert(edad);
        for (int i : edad) {
            System.out.print(i + "  ");
        }
    }

    public static int[] sortInsert(int[] arreglo) {
        int i = 1;
        while (i < arreglo.length) {
            int j = i;
            while (j > 0 && arreglo[j - 1] > arreglo[j]) {
                swap(arreglo, j, j - 1);
                j -= 1;
            }
            i += 1;
        }
        return arreglo;
    }

}
