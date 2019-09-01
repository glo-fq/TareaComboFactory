/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacombosfactory;

import java.util.ArrayList;
import tareacombosfactory.Combo.ComboBuilder;

/**
 *
 * @author Gloriana
 */
public class SupremeFactory implements IComboFactoryMethod {
    
    public Combo crearCombo(String tipo,Combo c,Plato p, ArrayList<Bebida> b, ArrayList<Adicional> a, String newName){
        if (tipo=="al gusto"){
           Combo ca = new Combo.ComboBuilder().addAdicional(a).addBebida(b).build();
           return ca;
        }
        else if(tipo=="cambio"){
            Combo ca = new Combo.ComboBuilder().addAdicional(a).addBebida(b).build1(c);
            return ca;
        }else {
            ComboPredefinido predefinido = (ComboPredefinido) ComboFactory.getPrototype(tipo);
            predefinido.setName(newName);
            predefinido.setPlato(p);
            predefinido.setAdicionales(a);
            predefinido.setBebidas(b);
            ComboFactory.addPrototype(newName, predefinido);
            return predefinido;
        }
        
    }


    
}
