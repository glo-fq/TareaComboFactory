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
import tareacombosfactory.SupremeFactory;

/**
 *
 * @author maryp
 */
public class ControladorVentanaAgregados implements ActionListener{
    public VentanaAgregados vista;
    public  ArrayList<Combo> combos;
    public  ArrayList<Producto> platos;
    public  ArrayList<Producto> bebidas;
    public  ArrayList<Producto> adicionales;
    public  ArrayList<Combo> compra;
    public Combo combo;
    public ComboBuilder comboBuilder;
    
    public ControladorVentanaAgregados(VentanaAgregados v, ArrayList<Combo> com, ArrayList<Producto> p,ArrayList<Producto> b, ArrayList<Producto> a, ArrayList<Combo> c, Combo combo1, ComboBuilder comboBuilder){
        this.vista=v;
        this.combos=com;
        this.bebidas=b;
        this.platos=p;
        this.adicionales=a;
        this.compra=c;
        this.combo=combo1;
        this.comboBuilder=comboBuilder;
        this.vista.jButton1.addActionListener(this);
        this.vista.jButton14.addActionListener(this);
        this.vista.jButton2.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       switch(e.getActionCommand()) {
            case "Agregar bebida":
                agregarBebidas();
                break;
            case "Agregar Adicional":
                agregarAdicional();
               break;
            case "Terminar":
                terminar();
                break;                   
            default:
                break;
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void agregarBebidas(){
            if (vista.jList1.isSelectionEmpty()){
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una bebida");
        } 
        else{
            
            Producto b= bebidas.get(vista.jList1.getSelectedIndex());
            this.comboBuilder.addBebida(b);
            JOptionPane.showMessageDialog(vista, "Bebida agregada con éxito");
        }
    }
    public void agregarAdicional(){
            if (vista.jList2.isSelectionEmpty()){
            JOptionPane.showMessageDialog(vista, "Debe seleccionar un adicional");
        } 
        else{
            Producto b= adicionales.get(vista.jList2.getSelectedIndex());
            this.comboBuilder.addAdicional(b);
            JOptionPane.showMessageDialog(vista, "Adicional agregado con éxito");
        }
    }
    public Combo agregarFactory(){
        SupremeFactory Sf = new SupremeFactory();
        if (combo!=null){
           int numCombo = this.combos.indexOf(combo);
        //   String tipo,Integer numCombo,Combo combo,ComboBuilder c, Integer newNumCombo, ArrayList<Producto> a, ArrayList<Producto> b, Producto p
           Combo c= Sf.crearCombo("cambio", numCombo,combo, comboBuilder,-1, null,null, null);
           return c;
        }
        else{
           Combo c= Sf.crearCombo("al gusto", 0, null,comboBuilder, -1, null,null,null); 
           System.out.println(c.getTotal());
           return c;
        }
    }
    public void terminar(){
        Combo c = agregarFactory();
        System.out.println(c.getPlato().getNombre());
        compra.add(c);
        llamarCombos();
    }
    public void llamarCombos(){
        VentanaCombos n =new VentanaCombos();
        ControladorVentanaCombos controladorCombos = new ControladorVentanaCombos(n,compra);
        controladorCombos.ventanaPrincipal.setVisible(true);
        controladorCombos.ventanaPrincipal.setLocationRelativeTo(null);
        vista.setVisible(false);
    }
    
}
