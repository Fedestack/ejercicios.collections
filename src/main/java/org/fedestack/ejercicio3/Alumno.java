package org.fedestack.ejercicio3;
/* Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main. */


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Alumno {
   private String nombre;
   private List<Integer> notas;

   public Alumno() {
      this.notas = new ArrayList<>();
      agregarNotas();
   }

   public Alumno(String nombre) {
      this.nombre = nombre;
      this.notas =  new ArrayList<>();
      agregarNotas();
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public List<Integer> getNotas() {
      return notas;
   }

   public void setNotas(List<Integer> notas) {
      this.notas = notas;
   }

   @Override
   public String toString() {
      return "Alumno{" +
              "nombre='" + nombre + '\'' +
              ", notas=" + notas +
              '}';
   }


   public void agregarNotas(){
      Random random = new Random();
      for(int i = 0; i < 3; i++) {
         this.notas.add(random.nextInt(10) + 1);
      }
   }
}
