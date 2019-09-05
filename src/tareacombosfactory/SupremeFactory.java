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
    
    public Combo crearCombo(String tipo,Integer numCombo,Plato p, ArrayList<Bebida> b, ArrayList<Adicional> a, Integer newNumCombo){
        if (tipo=="al gusto"){
           ComboAlGusto cg = new ComboAlGusto();
           return cg.newCombo(p, b, a);
           
        }
        else if(tipo=="cambio"){
            ComboPredefinido predefinido = (ComboPredefinido) ComboFactory.getPrototype(numCombo);
            ComboCambio cc= new ComboCambio();
            return cc.CambiarCombo(predefinido,b,a);
        }else {
            ComboPredefinido predefinido = (ComboPredefinido) ComboFactory.getPrototype(numCombo);
            predefinido.setName(newNumCombo);
            predefinido.setPlato(p);
            predefinido.setAdicionales(a);
            predefinido.setBebidas(b);
            ComboFactory.addPrototype(newNumCombo, predefinido);
            return predefinido;
        }
        
    }
    


    
}
