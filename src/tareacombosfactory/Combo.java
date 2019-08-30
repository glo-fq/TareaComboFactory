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
    
    public class ComboBuilder implements IBuilder{
        
        public ComboBuilder build(){}
        
        public ComboBuilder setPlato(){}
        
        public ComboBuilder addBebida(){}
        
        public ComboBuilder addAdicional(){}
        
    }
    
}
