package org.fedestack.ejercicio5;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisServicio {

   Scanner sc = new Scanner(System.in);

   TreeSet<String> listaDePaises = new TreeSet<>();

   public void cargarPaises() {
   String respuesta;
   do{
      System.out.println("Ingrese un pais");
      listaDePaises.add(sc.nextLine());
      System.out.println("Desea agregar otro pais (s/n)");
      respuesta = sc.nextLine();
   }while(respuesta.equalsIgnoreCase("s"));
   }

   public void paisesOrdenadosAlfabeticamente(){
      System.out.println("Lista de paises ordenados alfabeticamente ");
      System.out.println(listaDePaises);
   }

   public void buscarPais(){
      boolean flag = false;
      System.out.println("Ingrese el pais a eliminar");
      String pais = sc.nextLine();
      Iterator it = listaDePaises.iterator();
      while(it.hasNext()){
         if(it.next().equals(pais)){
            it.remove();
            flag = true;
         System.out.println("El pais se elimino correctamente");
         System.out.println(listaDePaises);
            break;
         }
      }
      if(!flag){
      System.out.println("No se encontro el pais ingresado");
      System.out.println(listaDePaises);
      }
   }





}
