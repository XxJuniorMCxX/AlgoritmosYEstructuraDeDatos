/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodosdeordenamiento.Sesion2.Practica;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author XxJuniorMxX
 */
public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private int edad;
    private int ciclo;

    public Alumno() {
    }

    public Alumno(String nombre, int edad, int ciclo) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciclo = ciclo;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + this.edad;
        hash = 89 * hash + this.ciclo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (this.ciclo != other.ciclo) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", ciclo=" + ciclo + '}';
    }

    @Override
    public int compareTo(Alumno o) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return ALUMNO_COMPARATOR_NATURAL_ORDER.compare(this, o);
    }
    public static final Comparator<Alumno> ALUMNO_COMPARATOR_NATURAL_ORDER = Comparator.comparing(Alumno::getNombre).thenComparing(Alumno::getEdad);
    
    
}
