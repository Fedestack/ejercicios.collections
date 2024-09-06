package org.fedestack.ejercicios;

/* Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArravList. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class collections1 {
   Scanner sc = new Scanner(System.in);
   String respuesta = "";

   public ArrayList<String> ejercicio1() {
      ArrayList<String> perros = new ArrayList<>();
      do {
         System.out.println("Ingrese la raza de un perro");
         perros.add(sc.next());
         System.out.println("Quiere guardar otro perro? (s/n)");
         respuesta = sc.next();
      } while (respuesta.equalsIgnoreCase("s"));

      mostrarArray(perros);
      return perros;
   }

   public void mostrarArray(ArrayList<String> perros) {
    // perros.forEach(System.out::println);
    System.out.println(perros);
   }

  /* Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
  un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
  está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
  ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
  la lista ordenada. */

   public void ejercicio2(ArrayList<String> perros) {
      Iterator<String> iterator = perros.iterator();
      boolean flag = false;
      System.out.println("Ingrese una raza de perro para verificar si esta en la lista");
      String respuesta = sc.next();
      while (iterator.hasNext()) {
         if (iterator.next().equalsIgnoreCase(respuesta)) {
            iterator.remove();
         System.out.println("Se encontro "+respuesta+" y se elimino de la lista");
        // perros.forEach(System.out::println);
            flag = true;
         }
      }
      if(!flag){
      System.out.println(respuesta+" No se encontro dentro de la lista");
      }
      Collections.sort(perros);
      System.out.println(perros);
   }
}
