package org.fedestack.comparadores;

import org.fedestack.ejercicio4.Pelicula;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparadores {

   // Ordenar por duración de mayor a menor
   public static Comparator<Pelicula> ordenarPorDuracionDesc = (o1, o2) -> o2.getDuracion().compareTo(o1.getDuracion());

   // Ordenar por duración de menor a mayor
   public static Comparator<Pelicula> ordenarPorDuracionAsc = (p1,p2) -> p1.getDuracion().compareTo(p2.getDuracion());

   // Ordenar por director alfabeticamente
   public static Comparator<Pelicula> ordenarPorDirectorAsc = (p1,p2) -> p1.getDirector().compareTo(p2.getDirector());
}
