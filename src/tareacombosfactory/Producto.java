/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacombosfactory;

/**
 *
 * @author Gloriana
 */

//Los Productos que empiezan con 0 son platos principales
//Los Productos que empiezan con 1 son bebidas
//Los Productos que empiezan con 2 son adicionales
public class Producto implements ICombo<Producto>{
    private  int codigo;
    private String nombre;
    private float precio;
    
    public Producto(int c, String n, float p){
        this.codigo=c;
        this.nombre=n;
        this.precio=p;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public float getPrecio(){
        return precio;
    }
    public void setCodigo(int c){
        this.codigo=c;
    }
    public void setNombre (String n){
        this.nombre=n;
    }
    public void setPrecio(Float p){
        this.precio=p;
    }
    
 
    @Override
    public Producto clone() {
        return new Producto(this.getCodigo(),this.getNombre(),this.getPrecio());
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto deepClone() {
        return clone();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
