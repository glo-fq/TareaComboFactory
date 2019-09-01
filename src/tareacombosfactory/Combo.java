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
    private Plato plato;
    private ArrayList<Bebida> bebidas;
    private ArrayList<Adicional> adicionales;
    
    public Combo(Plato p, ArrayList<Bebida> b, ArrayList<Adicional> a){
        this.plato=p;
        this.bebidas=b;
        this.adicionales=a;
    }
    public Combo(){}
    public Plato getPlato(){
        return plato;
    }
    public ArrayList<Bebida> getBebidas(){
        return bebidas;
    }
        public ArrayList<Adicional> getAdicionales(){
        return adicionales;
    }
    public void setPlato(Plato p){
        this.plato=p;
    }
    public void setBebidas(ArrayList<Bebida> b){
        this.bebidas=b;
    }
    public void setAdicionales (ArrayList<Adicional> a){
        this.adicionales=a;
    }
    
    public static class ComboBuilder implements IBuilder<Combo>{
        private Plato plato;
        private ArrayList<Bebida> bebidas;
        private ArrayList<Adicional> adicionales;
        public ComboBuilder(){
        }
        @Override
        public Combo build(){
            return new Combo(plato, bebidas, adicionales);
        }
        //Este es en caso de agregar bedidas y adicionales al combo

        public ComboBuilder setPlato(Plato p){
            this.plato=p;
            return this;
        }
        
        public ComboBuilder addBebida(ArrayList<Bebida> b){
            this.bebidas.addAll(b);
            return this;}
        
        public ComboBuilder addAdicional(ArrayList<Adicional> a){
            this.adicionales.addAll(a);
            return this;
        }

      
        public Combo build1(Combo combo1) {
            combo1.adicionales.addAll(adicionales);
            combo1.bebidas.addAll(bebidas);
            return combo1;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }



 


        
    }
    
}
