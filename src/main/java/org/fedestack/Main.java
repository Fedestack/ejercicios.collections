package org.fedestack;

import org.fedestack.comparadores.Comparadores;
import org.fedestack.ejercicio3.Alumno;
import org.fedestack.ejercicio3.AlumnoServicio;
import org.fedestack.ejercicio4.Pelicula;
import org.fedestack.ejercicio4.PeliculaServicio;
import org.fedestack.ejercicio5.Pais;
import org.fedestack.ejercicio5.PaisServicio;
import org.fedestack.ejercicio6.Producto;
import org.fedestack.ejercicio6.ProductoServicio;
import org.fedestack.ejercicio7.Numero;
import org.fedestack.ejercicios.collections1;

import java.sql.SQLOutput;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
      // to see how IntelliJ IDEA suggests fixing it.
      Random random = new Random();
      Scanner sc = new Scanner(System.in);

      //CREO UN ARRAYLIST Y LO RECORRO CON EL FOREACH MODERNO
//      ArrayList<Integer> numeros = new ArrayList<>();
//      for(int i = 0; i < 10; i++) {
//         numeros.add(i, random.nextInt(0, 9) + 1);
//      }
//         numeros.forEach(System.out::print);


      //CREO UN ARRAY Y LO RECORRO CON EL FOREACH MODERNO
//      int[] numerosArray = new int[10];
//
//      for(int i = 0; i < 10; i++) {
//      numerosArray[i] = random.nextInt(0,9)+1;
//      }
//      Arrays.stream(numerosArray).forEach(System.out::print);

      // ejercicio1
     // collections1 c1 = new collections1();

      // LLAMANDO AL EJERCICIO1 Y GUARDANDO EL RETURN EN LA NUEVA VARIABLE
      //ArrayList<String> listaDePerros = c1.ejercicio1();
      //c1.ejercicio2(listaDePerros);

//      AlumnoServicio as = new AlumnoServicio();
//      as.crearAlumno();
//      as.mostrarListaAlumnos();
//
//      List<Alumno> alumnos = as.obtenerListaAlumnos();
//
//      System.out.println("Ingrese el nombre del alumno para devolver su promedio");
//      String alumnoNombre = sc.next();
//
//      boolean encontrado = false;
//
//      for (Alumno aux: alumnos){
//         if(aux.getNombre().equalsIgnoreCase(alumnoNombre)){
//            System.out.printf("El resultado del promedio de las notas "+aux.getNotas()+" es %.2f%n",
//                    as.notaFinal(aux.getNotas()));
//            encontrado = true;
//            break;
//         }
//      }
//      if (!encontrado) {
//         System.out.println("Alumno no encontrado.");
//      }


//      PeliculaServicio ps = new PeliculaServicio();
//      ps.crearPelicula();
//      ps.pelisOrdenadasAsc();
//      ps.mostrarPelisMasDeUnaHora();
//
//      List<Pelicula> listaDePeliculas = ps.listaDePelis();
//
//      ps.orenarPorDuracionDesc();
//      ps.ordenarPorDuracionAsc();
//      ps.ordenarPorDirectorAsc();


//      Pais pais = new Pais();
//      pais.paises();


//      ProductoServicio ps = new ProductoServicio();
//      Producto p1;
//
//      String respuesta;
//      do{
//         System.out.println("------ MENU ------");
//         System.out.println("Ingrese una opcion\n1- Ingresar un nuevo producto\n2- Modificar el precio de un producto\n3- " +
//                 "Eliminar un producto\n4- Mostrar los productos\n5- Salir");
//         respuesta = sc.next();
//         sc.nextLine();
//
//         switch(respuesta){
//            case "1": p1 = ps.crearProducto();
//            break;
//            case "2": ps.modificarPrecio();
//            break;
//            case "3": ps.eliminarProducto();
//            break;
//            case "4": ps.mostrarTodosLosProductos();
//            break;
//            case "5": System.out.println("Gracias, vuelva prontos");
//            break;
//            default:
//            System.out.println("Valor incorrecto");
//      }
//      }while(!respuesta.equals("5"));

      Numero n1 = new Numero();
      n1.numeros();
      n1.recorrerLista();

}
   }
