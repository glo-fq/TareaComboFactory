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
    public Combo newCombo(ComboBuilder c){
        Combo ca=  c.build();
        ca.setTotal();
        return ca;
    }
}
