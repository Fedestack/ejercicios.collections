package org.fedestack.ejercicio3;

import java.util.*;

public class AlumnoServicio {
Scanner sc = new Scanner(System.in);
   List<Alumno> listaAlumnos = new ArrayList<>();

   public void crearAlumno(){
      String rta = "";
      Alumno alumno;
      do{
         alumno = new Alumno();
         System.out.println("Ingrese el nombre del alumno");
         alumno.setNombre(sc.next());
         listaAlumnos.add(alumno);
         System.out.println("Desea agregar otro alumno (s/n)");
         rta = sc.next();
      }while(rta.equalsIgnoreCase("s"));
   }

   public void mostrarListaAlumnos(){
      for (Alumno aux : listaAlumnos){
      System.out.println(aux);
      }
   }

   public List<Alumno> obtenerListaAlumnos(){
      return listaAlumnos;
   }

   public double notaFinal(List<Integer> notas){
      int suma = 0;
      int contador = 0;
      for (Integer aux : notas){
         contador++;
         suma += aux;
      }
      return (double) suma / contador;
   }


}
