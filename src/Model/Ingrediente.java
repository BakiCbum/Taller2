package Model;
//Clase para representar ingredientes

public class Ingrediente {

 private String nombre;

 private double costo;



 public Ingrediente(String nombre, double costo) {

     this.nombre = nombre;

     this.costo = costo;

 }



 public String getNombre() {

     return nombre;

 }



 public double getCosto() {

     return costo;

 }

}