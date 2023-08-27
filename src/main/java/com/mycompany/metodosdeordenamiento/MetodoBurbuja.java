/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.metodosdeordenamiento;
import javax.swing.JOptionPane;
/**
 *
 * @author XxJuniorMxX
 */
public class MetodoBurbuja {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Cantidad de Números"));
        int aux;
        int [] numeros =new int[num];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int)(Math.random()*20)+1;
        }
        for (int numero : numeros) {
          
            System.out.print(numero + " ");
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length-1; j++) {
                if(numeros[j]>numeros[j+1]){
                    aux=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=aux;             
                }
            }
        }
        System.out.println("\nOrdenamiento Burjuba");
        for (int buble : numeros) {
            System.out.print(buble + " ");
        }
    }
}
