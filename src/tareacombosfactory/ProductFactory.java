/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacombosfactory;

/**
 *
 * @author maryp
 */
//Los Productos que empiezan con 0 son platos principales
//Los Productos que empiezan con 1 son bebidas
//Los Productos que empiezan con 2 son adicionales
public class ProductFactory {
     public  Producto crearProducto(int codigo, String nombre, float precio){
         //Esto lo que hace es sacar el primer digito del código
         String v = String.valueOf(codigo);
         int t= v.length();
         Double desplazamiento= Math.pow(10, t-1);
         Double numero1= codigo/desplazamiento;
         if (numero1==0){
             return new Plato(codigo,nombre,precio);
         }
         else if (numero1==1){
             return new Bebida(codigo,nombre,precio);
         }
         else{
             return new Adicional(codigo,nombre,precio);
         }
     }
}
