package org.fedestack.ejercicio7;
/* Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio). */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numero {
   Scanner sc = new Scanner(System.in).useDelimiter("\n");
   List<Integer> listaDeNumeros = new ArrayList<>();

   public void numeros(){
      int numeroIngresado = 0;

      while (numeroIngresado!=-99){
         System.out.println("Ingrese un numero");
         numeroIngresado = sc.nextInt();
         if(numeroIngresado==-99){
            break;
         }else{
            listaDeNumeros.add(numeroIngresado);
         }
      }
      System.out.println(listaDeNumeros);
      System.out.println("Termino el ingreso de datos");
   }

   public void recorrerLista(){
      if (listaDeNumeros.isEmpty()) {
         System.out.println("No se han ingresado números.");
         return;
      }

      int suma = 0;
    System.out.println("Los numeros ingresados son :");
      for (Integer aux : listaDeNumeros){
      System.out.println(aux);
      suma += aux;
      }
    System.out.println("La suma de los numeros ingresados es "+suma);
    System.out.println("El promedio de los numeros ingesados es "+(double) suma/(listaDeNumeros.size()));
   }

}
