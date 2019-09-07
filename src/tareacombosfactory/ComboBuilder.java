/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacombosfactory;

import java.util.ArrayList;

  public class ComboBuilder implements IBuilder<Combo>{
        private Producto plato;
        private ArrayList<Producto> bebidas;
        private ArrayList<Producto> adicionales;
        public ComboBuilder(){
            this.bebidas=new ArrayList<Producto>();
            this.adicionales=new ArrayList<Producto>();
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
        
        public ComboBuilder addBebida(Producto b){
            this.bebidas.add(b);
            return this;}
        
        public ComboBuilder addAdicional(Producto a){
                this.adicionales.add(a);
                return this;}
        

      
        public Combo build1(Combo combo1) {
            combo1.adicionales.addAll(adicionales);
            combo1.bebidas.addAll(bebidas);
            combo1.setTotal();
            return combo1;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
  }