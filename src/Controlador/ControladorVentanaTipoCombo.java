/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import interfaz.VentanaAgregados;
import interfaz.VentanaCombos;
import interfaz.VentanaTipoCombo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import tareacombosfactory.Combo;
import tareacombosfactory.ComboBuilder;
import tareacombosfactory.Producto;

/**
 *
 * @author maryp
 */
public class ControladorVentanaTipoCombo implements ActionListener {
     public  ArrayList<Combo> combos;
    public  ArrayList<Producto> platos;
    public  ArrayList<Producto> bebidas;
    public  ArrayList<Producto> adicionales;
    public  ArrayList<Combo> compra;
    public VentanaTipoCombo vista;
    public Combo combo;
   // public Producto plato;
    public ComboBuilder ComboBuilder;
    
    public ControladorVentanaTipoCombo(VentanaTipoCombo ventana2, ArrayList<Combo> com,ArrayList<Producto> p, ArrayList<Producto> b, ArrayList<Producto> a, ArrayList<Combo> c){
        this.combos=com;
        this.platos=p;
        this.bebidas=b;
        this.adicionales=a;
        this.compra=c;
        this.vista=ventana2;
        this.vista.btnSiguiente.addActionListener(this);
        this.ComboBuilder = new ComboBuilder();
    }
    @Override
    public void actionPerformed(ActionEvent e) {          
        switch(e.getActionCommand()) {
            case "Siguiente":
                actualizarDatos();
                break;
            default:
                break;
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void actualizarDatos(){
        if (!vista.jList2.isSelectionEmpty()){
           int index = vista.jList2.getSelectedIndex();
           Producto plato= platos.get(index);
            this.ComboBuilder.setPlato(plato);
     //       System.out.println(plato.getNombre());
            llamarAgregados(index);

        }
        else if(!vista.jList1.isSelectionEmpty()){
            
            int index = vista.jList1.getSelectedIndex();
            combo = combos.get(index);
             llamarAgregados(index);
        }
        else{
           JOptionPane.showMessageDialog(vista, "Debe escoger un combo o un plato principal");

        }
    }
    public void llamarAgregados(int index){
       VentanaAgregados va = new VentanaAgregados(bebidas,adicionales);
       ControladorVentanaAgregados controladorAgregados = new ControladorVentanaAgregados(va,combos,platos,bebidas,adicionales,compra,combo,ComboBuilder);
       controladorAgregados.vista.setVisible(true);
       controladorAgregados.vista.setLocationRelativeTo(null);
       this.vista.setVisible(false);

    }
    
}
