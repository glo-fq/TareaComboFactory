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
public class ComboPredefinido extends Combo implements ICombo<ComboPredefinido> {
    private String name;

    public ComboPredefinido(Plato p, ArrayList<Bebida> b, ArrayList<Adicional> a){
        super(p,b,a);
    }
    public void setName(String n){
        this.name=n;
    }
    
    @Override
    public ComboPredefinido clone() {
        ComboPredefinido clone = new ComboPredefinido(getPlato(), getBebidas(),getAdicionales());
        return clone;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ComboPredefinido deepClone() {
     
        ArrayList<Bebida> cloneBebidas = new ArrayList<Bebida>();
        ArrayList<Adicional> cloneAdicionales = new ArrayList<Adicional>();
        Plato p1 = this.getPlato().clone();
        for(Bebida item: getBebidas()){
            Bebida cloneItem = item.clone();
            cloneBebidas.add(cloneItem);
        }
        for(Adicional item: getAdicionales()){
            Adicional cloneItem = item.clone();
            cloneAdicionales.add(cloneItem);
        }
        ComboPredefinido clone = new ComboPredefinido(p1, cloneBebidas,cloneAdicionales);
        return clone;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
