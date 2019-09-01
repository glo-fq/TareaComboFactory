/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacombosfactory;

import java.util.HashMap;

/**
 *
 * @author Gloriana
 */
public class ComboFactory {
    private static HashMap<Integer, ICombo> prototypes = new HashMap<>();
    
    public static ICombo getPrototype(Integer prototypeName){
        return prototypes.get(prototypeName).deepClone();
    }
    public static void addPrototype (Integer prototypeName, ICombo prototype){
        prototypes.put(prototypeName, prototype);
    }
    
}
