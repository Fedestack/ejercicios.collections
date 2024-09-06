package org.fedestack.ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {
   Scanner sc = new Scanner(System.in);
   Producto producto;
   HashMap<String,Double> listaDeProductos = new HashMap<>();

public Producto crearProducto(){
String respuesta;
   do{
       producto = new Producto();
      System.out.println("Nombre del producto");
      producto.setNombre_producto(sc.nextLine().toLowerCase());
      System.out.println("Precio del producto");
      producto.setPrecio(sc.nextDouble());
      sc.nextLine();
      agregarProductoALaLista(producto);
      System.out.println("Desea agregar otro producto (s/n)");
      respuesta = sc. nextLine();
   }while (respuesta.equalsIgnoreCase("s"));

      return producto;
}

public void agregarProductoALaLista(Producto producto){
   listaDeProductos.put(producto.getNombre_producto(), producto.getPrecio());
    System.out.println("Producto agregado!!");
   System.out.println(listaDeProductos);
}

public HashMap<String,Double> devolverListaDeProductos(){
   return listaDeProductos;

}

public void modificarPrecio(){
   System.out.println("Ingrese un producto de la lista para modificar el precio");
   System.out.println(listaDeProductos);
   String modificar = sc.nextLine().toLowerCase();

      if(listaDeProductos.containsKey(modificar)){
               System.out.println("Ingrese el nuevo precio");
               Double nuevoPrecio = sc.nextDouble();
               sc.nextLine();
               listaDeProductos.put(modificar, nuevoPrecio);
            System.out.println("Producto modificado exitosamente");
            System.out.println(listaDeProductos);
         }else{
      System.out.println("El producto no esta en la lista");
      }
}

public void eliminarProducto(){
   System.out.println("Ingrese un producto de la lista para Eliminarlo");
   System.out.println(listaDeProductos);
   String eliminarProducto = sc.nextLine().toLowerCase();
   if(listaDeProductos.containsKey(eliminarProducto)){
      listaDeProductos.remove(eliminarProducto);
      System.out.println("Producto eliminado exitosamente");
      System.out.println(listaDeProductos);
   }else{
      System.out.println("El producto no esta en la lista");
   }
}

   public void mostrarTodosLosProductos() {
      if (listaDeProductos.isEmpty()) {
         System.out.println("No hay productos en la lista.");
      } else {
         for (Map.Entry<String, Double> entry : listaDeProductos.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + " | Precio: " + entry.getValue());
         }
      }
   }







}
