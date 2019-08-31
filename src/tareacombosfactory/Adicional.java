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
public class Adicional extends Producto implements ICombo {
    
    public Adicional(int codigo, String nombre, float precio){
        super(codigo,nombre,precio);
    }

    @Override
    public Adicional clone() {
        return new Adicional(this.getCodigo(),this.getNombre(),this.getPrecio());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Adicional deepClone() {
        return clone();
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
