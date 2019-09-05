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
public interface IComboFactoryMethod {
    
   public  Combo crearCombo(String tipo,Integer numCombo,Producto p, ArrayList<Producto> b, ArrayList<Producto> a, Integer newNumCombo);
}
