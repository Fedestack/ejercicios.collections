package org.fedestack.ejercicio4;

import org.fedestack.comparadores.Comparadores;

import java.util.*;

public class PeliculaServicio {
   Scanner sc = new Scanner(System.in).useDelimiter("\n");
   List<Pelicula> listaDePeliculas = new ArrayList<>();

   public void crearPelicula() {
      String respuesta;
      do {
         Pelicula pelis = new Pelicula();

         System.out.println("Ingrese el titulo de la pelicula");
         pelis.setTitulo(sc.nextLine());
         System.out.println("Ingrese el director de la pelicula");
         pelis.setDirector(sc.nextLine());
         System.out.println("Ingrese la duracion de la pelicula en horas");
         pelis.setDuracion(sc.nextDouble());
         listaDePeliculas.add(pelis);
         System.out.println("Desea guardar otra pelicula? (s/n)");
         respuesta = sc.next();
         sc.nextLine();
      } while (respuesta.equalsIgnoreCase("s"));
   }

   public List<Pelicula> listaDePelis() {
      return listaDePeliculas;
   }

   public void pelisOrdenadasAsc() {
      System.out.println("Peliculas ordenadas alfabeticamente");
      Collections.sort(listaDePeliculas);
      for (Pelicula aux : listaDePeliculas) {
         System.out.println(aux);
      }
   }

   public void mostrarPelisMasDeUnaHora() {
      System.out.println("Peliculas con duracion mayor a 1hs");
      for (Pelicula aux : listaDePeliculas) {
         if (aux.getDuracion() > 1) {
            System.out.println(aux);
         }
      }
   }

   public void orenarPorDuracionDesc() {
      System.out.println("Peliculas ordenadas por duracion descendente");
      Collections.sort(listaDePeliculas, Comparadores.ordenarPorDuracionDesc);
      for (Pelicula aux : listaDePeliculas) {
         System.out.println(aux);
      }
   }

   public void ordenarPorDuracionAsc() {
      System.out.println("Peliculas ordenadas por duracion ascendente");
      Collections.sort(listaDePeliculas, Comparadores.ordenarPorDuracionAsc);
      for (Pelicula aux : listaDePeliculas) {
         System.out.println(aux);
      }
   }

   public void ordenarPorDirectorAsc() {
      System.out.println("Peliculas ordenadas alfabeticamente por director ");
      Collections.sort(listaDePeliculas, Comparadores.ordenarPorDirectorAsc);
      for (Pelicula aux : listaDePeliculas) {
         System.out.println(aux);
      }
   }
}
