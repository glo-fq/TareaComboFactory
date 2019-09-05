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
    private Integer num;

    public ComboPredefinido(Producto p, ArrayList<Producto> b, ArrayList<Producto> a){
        super(p,b,a);
    }
    public void setName(Integer n){
        this.num=n;
    }
    
    @Override
    public ComboPredefinido clone() {
        ComboPredefinido clone = new ComboPredefinido(getPlato(), getBebidas(),getAdicionales());
        return clone;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ComboPredefinido deepClone() {
     
        ArrayList<Producto> cloneBebidas = new ArrayList<Producto>();
        ArrayList<Producto> cloneAdicionales = new ArrayList<Producto>();
        Producto p1 = this.getPlato().clone();
        for(Producto item: getBebidas()){
            Producto cloneItem = item.clone();
            cloneBebidas.add(cloneItem);
        }
        for(Producto item: getAdicionales()){
            Producto cloneItem = item.clone();
            cloneAdicionales.add(cloneItem);
        }
        ComboPredefinido clone = new ComboPredefinido(p1, cloneBebidas,cloneAdicionales);
        return clone;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
