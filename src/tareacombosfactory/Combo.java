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
    private ArrayList<Producto> bebidas;
    private ArrayList<Producto> adicionales;
    private float total;
    
    public Combo(Producto p, ArrayList<Producto> b, ArrayList<Producto> a){
        this.plato=p;
        this.bebidas=b;
        this.adicionales=a;
        setTotal();
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
        for(Producto item: this.bebidas){
            this.total+=item.getPrecio();
        }
        for(Producto item: this.adicionales){
            this.total+=item.getPrecio();
        }
        this.total+=this.plato.getPrecio();
    }
    public float getTotal(){
        return this.total;
    }
    public static class ComboBuilder implements IBuilder<Combo>{
        private Producto plato;
        private ArrayList<Producto> bebidas;
        private ArrayList<Producto> adicionales;
        public ComboBuilder(){
        }
        @Override
        public Combo build(){
            return new Combo(plato, bebidas, adicionales);
        }
        //Este es en caso de agregar bedidas y adicionales al combo

        public ComboBuilder setPlato(Producto p){
            this.plato=p;
            return this;
        }
        
        public ComboBuilder addBebida(ArrayList<Producto> b){
            this.bebidas.addAll(b);
            return this;}
        
        public ComboBuilder addAdicional(ArrayList<Producto> a){
            this.adicionales.addAll(a);
            return this;
        }

      
        public Combo build1(Combo combo1) {
            combo1.adicionales.addAll(adicionales);
            combo1.bebidas.addAll(bebidas);
            combo1.setTotal();
            return combo1;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }



 


        
    }
    
}
