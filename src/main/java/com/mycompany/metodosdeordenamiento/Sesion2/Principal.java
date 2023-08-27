/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodosdeordenamiento.Sesion2;

import Clases.SortUTP;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author XxJuniorMxX
 */
public class Principal {

    public static void main(String[] args) {

        /*String nombre1 = "Juan";
        String nombre2 = "Rosa";
        //comparar 
        //System.out.println(" Nombre 1 Con Nombre2: " + nombre1.compareTo(nombre2));
        
        System.out.println("Nombre 1 Es Igual a Nombre 2: " + nombre1.equals(nombre2));
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        Cancion c= new Cancion("Pedro Navaja", "Ruben Blades", 441, Cancion.Genero.SALSA, LocalDate.parse("06/08/1988",dateFormat));
        Cancion c1= new Cancion("Pedro Navaja", "Ruben Blades", 440, Cancion.Genero.SALSA, LocalDate.parse("06/08/1988",dateFormat));
        
        System.out.println("cancion 1 es =,<,>  a Cancion: " +c.compareTo(c1));*/
        
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        Cancion []catalogo={
            new Cancion("Pedro Navaja","Ruben Blades",441,Cancion.Genero.SALSA,LocalDate.parse("07/09/1978",dateFormat)),
            new Cancion("Pedro Navaja","Ruben Blades",441,Cancion.Genero.SALSA,LocalDate.parse("07/09/1978",dateFormat)),
            new Cancion("Pedro Navaja","Aha",200,Cancion.Genero.POP,LocalDate.parse("07/09/1980",dateFormat)),
            new Cancion("Thriller","Michael Jackson",358,Cancion.Genero.ROCK,LocalDate.parse("07/09/1982",dateFormat)),
            new Cancion("Thriller","Aha",358,Cancion.Genero.ROCK,LocalDate.parse("01/08/1982",dateFormat)),
            new Cancion("Thriller","Soda Stereo",358,Cancion.Genero.ROCK,LocalDate.parse("01/08/1982",dateFormat)),
            new Cancion("Thriller","Mana",358,Cancion.Genero.ROCK,LocalDate.parse("07/09/1982",dateFormat))
        };
        
        System.out.println("Data original");
        for (Cancion cancion : catalogo) {
            System.out.println(cancion);
        }
        
       // System.out.println("******Arreglo Merge Sort*******");
        
//        SortUTP.mergeSort(catalogo);//subdivide el arreglo hasta no poder luego los va
//        for (Cancion cancion : catalogo) {
//            System.out.println(cancion);
//        }
        
        
        
        System.out.println("Arreglo QickSort");
        SortUTP.quickSort(catalogo);
        for (Cancion cancion : catalogo) {
            System.out.println(cancion);
        }
    }

}
