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
public class Bebida extends Producto implements ICombo<Bebida>{
    
    /**
     *
     * @param codigo
     * @param nombre
     * @param precio
     */
    public Bebida(int codigo, String nombre, float precio){
        super (codigo,nombre,precio);
    }

    @Override
    public Bebida clone() {
        return new Bebida(this.getCodigo(),this.getNombre(),this.getPrecio());
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Bebida deepClone() {
        return clone();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
