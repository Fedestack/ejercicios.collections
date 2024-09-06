package org.fedestack.ejercicio6;
/* Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas. */

public class Producto {

   private String nombre_producto;
   private Double precio;

   public Producto() {
   }

   public Producto(String nombre_producto, Double precio) {
      this.nombre_producto = nombre_producto;
      this.precio = precio;
   }

   public String getNombre_producto() {
      return nombre_producto;
   }

   public void setNombre_producto(String nombre_producto) {
      this.nombre_producto = nombre_producto;
   }

   public Double getPrecio() {
      return precio;
   }

   public void setPrecio(Double precio) {
      this.precio = precio;
   }

   @Override
   public String toString() {
      return "Producto{" +
              "nombre_producto='" + nombre_producto + '\'' +
              ", precio=" + precio +
              '}';
   }
}
