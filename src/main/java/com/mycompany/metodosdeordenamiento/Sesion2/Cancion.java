/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodosdeordenamiento.Sesion2;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author XxJuniorMxX
 */
public class Cancion implements Comparable<Cancion>{

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDate getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(LocalDate lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    @Override
    public int compareTo(Cancion o) {
        return CANCION_COMPARATOR_NATURAL_ORDER.compare(this, o);
   }
    public static final Comparator<Cancion> CANCION_COMPARATOR_NATURAL_ORDER = Comparator.comparing(Cancion::getNombre).thenComparing(Cancion::getArtista).thenComparing(Cancion::getDuracion);
    
    public enum Genero{ROCK, POP, URBANO, SALSA}
    private String nombre;
    private String artista;
    private int duracion;
    private Genero genero;
    private LocalDate lanzamiento;

    public Cancion() {
    }

    public Cancion(String nombre, String artista, int duracion, Genero genero, LocalDate lanzamiento) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = genero;
        this.lanzamiento = lanzamiento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.artista);
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
        final Cancion other = (Cancion) obj;
        if (this.duracion != other.duracion) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.artista, other.artista);
    }
    
    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", artista=" + artista + ", duracion=" + duracion + ", genero=" + genero + ", lanzamiento=" + lanzamiento + '}';
    }
    
    
}
