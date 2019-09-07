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
public class ComboCambio extends Combo {
    public ComboCambio(){
    
    }
    public Combo CambiarCombo(Combo c, ComboBuilder cb){
         Combo ca =  cb.build1(c);
         ca.setTotal();
         return ca;
    }
    
}
