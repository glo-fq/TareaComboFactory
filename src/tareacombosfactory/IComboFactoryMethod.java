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
    
    public Combo crearCombo(String tipo,Integer numCombo,Plato p, ArrayList<Bebida> b, ArrayList<Adicional> a, Integer newNumCombo);
}
