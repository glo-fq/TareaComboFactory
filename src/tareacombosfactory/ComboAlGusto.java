/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacombosfactory;

import java.util.ArrayList;

/**
 *
 * @author maryp
 */
public class ComboAlGusto extends Combo {
    public ComboAlGusto(){
    }
    public Combo newCombo(Plato p, ArrayList<Bebida> b, ArrayList<Adicional> a){
        Combo ca= new Combo.ComboBuilder().setPlato(p).addAdicional(a).addBebida(b).build();
        return ca;
    }
}