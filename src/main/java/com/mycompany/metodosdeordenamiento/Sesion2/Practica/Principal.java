/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodosdeordenamiento.Sesion2.Practica;
/**
 *
 * @author XxJuniorMxX
 */
public class Principal {
    public static void main(String[] args) {
        
        Alumno a =new Alumno("Juan", 0, 0) ;
        Alumno a1 = new Alumno("Rosa", 0, 0);
        
        System.out.println("Habrá Igualdad" + a.equals(a1));
        
        System.out.println(a.compareTo(a1));
        Alumno [] alumnos = {new Alumno("Junior", 20, 6),
                              new  Alumno("Abel", 20, 6),
                              new  Alumno("Carlos", 20, 6),
                              new  Alumno("Mateo", 20, 6),
                              new  Alumno("Bernardo", 20, 6)
        };
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
        System.out.println("Ordenamiento Shell Sort");
        SortUTP1.shellSort(alumnos);
        
        for (Alumno alumno1 : alumnos) {
            System.out.println(alumno1);
        }
        
        
    }
            
    
}
