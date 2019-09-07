/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacombosfactory;

import java.util.ArrayList;

/**
 *
 * @author Gloriana
 */
public class Combo {
    private Producto plato;
    ArrayList<Producto> bebidas;
    ArrayList<Producto> adicionales;
    private float total;
    
    public Combo(Producto p, ArrayList<Producto> b, ArrayList<Producto> a){
        this.plato=p;
        this.bebidas=b;
        this.adicionales=a;
       // setTotal();
    }
    public Combo(){}
    public Producto getPlato(){
        return plato;
    }
    public ArrayList<Producto> getBebidas(){
        return bebidas;
    }
        public ArrayList<Producto> getAdicionales(){
        return adicionales;
    }
    public void setPlato(Producto p){
        this.plato=p;
    }
    public void setBebidas(ArrayList<Producto> b){
        this.bebidas=b;
    }
    public void setAdicionales (ArrayList<Producto> a){
        this.adicionales=a;
    }
    public void setTotal(){
        float t=0;
        for(Producto item: this.bebidas){
            t+=item.getPrecio();
        }
        for(Producto item: this.adicionales){
            t+=item.getPrecio();
        }
        t+=this.plato.getPrecio();
        this.total=t;
    }
    public float getTotal(){
        return this.total;
    }
  



 


        
    }
    

