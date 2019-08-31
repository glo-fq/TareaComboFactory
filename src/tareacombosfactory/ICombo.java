/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacombosfactory;

/**
 *
 * @author Gloriana
 */
public interface ICombo<T extends ICombo> extends Cloneable {
    public T clone();
    public T deepClone();
}
