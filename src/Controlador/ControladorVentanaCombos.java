/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import interfaz.VentanaCombos;
import interfaz.VentanaTipoCombo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import tareacombosfactory.Combo;
import tareacombosfactory.ProductFactory;
import tareacombosfactory.Producto;
import tareacombosfactory.SupremeFactory;

/**
 *
 * @author maryp
 */
public class ControladorVentanaCombos implements ActionListener
{
    public  ArrayList<Combo> combos;
    public  ArrayList<Producto> platos;
    public  ArrayList<Producto> bebidas;
    public  ArrayList<Producto> adicionales;
    public  ArrayList<Combo> compra;
    public VentanaCombos ventanaPrincipal;
    
    
    public ControladorVentanaCombos(VentanaCombos vc){
        this.ventanaPrincipal=vc;
        this.compra= new ArrayList<Combo>();
        rellenarCombos();
        this.ventanaPrincipal.btnAgregar.addActionListener(this);
        this.ventanaPrincipal.jButton2.addActionListener(this);
    }
    public ControladorVentanaCombos(VentanaCombos vc,ArrayList<Combo> compra){
        this.ventanaPrincipal=vc;
        this.compra=compra;
        rellenarCombos();
        this.ventanaPrincipal.btnAgregar.addActionListener(this);
        this.ventanaPrincipal.jButton2.addActionListener(this);
    }
    public void rellenarCombos(){
        ProductFactory factoryP = new ProductFactory();
        Producto p1 =factoryP.crearProducto(01, "hamburguesa",1200);
        Producto p2 =factoryP.crearProducto(02, "sandwich", 900);
        Producto p3 =factoryP.crearProducto(03, "pollo",1000);
        Producto p4 =factoryP.crearProducto(04, "wrap", 900);
        Producto p5 =factoryP.crearProducto(05, "pizza", 1100);
        Producto p6 =factoryP.crearProducto(06, "hot dog", 950);
        platos = new ArrayList<Producto>();
        platos.add(p1);platos.add(p2);platos.add(p3);platos.add(p4);platos.add(p5);platos.add(p6);
        Producto b1 =factoryP.crearProducto(11, "gaseosa",900);
        Producto b2 =factoryP.crearProducto(12, "té", 750);
        Producto b3 =factoryP.crearProducto(13, "frozen",1100);
        Producto b4 =factoryP.crearProducto(14, "café", 850);
        Producto b5 =factoryP.crearProducto(15, "natural", 750);
        Producto b6 =factoryP.crearProducto(16, "batido", 1000);
        bebidas = new ArrayList<Producto>();
        bebidas.add(b1);bebidas.add(b2);bebidas.add(b3);bebidas.add(b4);bebidas.add(b5);bebidas.add(b6);
        Producto a1 =factoryP.crearProducto(21, "papas",650);
        Producto a2 =factoryP.crearProducto(22, "patatas", 750);
        Producto a3 =factoryP.crearProducto(23, "tres leches",750);
        Producto a4 =factoryP.crearProducto(24, "puré", 700);
        Producto a5 =factoryP.crearProducto(25, "uvas", 600);
        Producto a6 =factoryP.crearProducto(26, "maíz", 700);
        Producto a7 =factoryP.crearProducto(27,"ensalada",650);
        adicionales = new ArrayList<Producto>();
        adicionales.add(a1);adicionales.add(a2);adicionales.add(a3);adicionales.add(a4);adicionales.add(a5);adicionales.add(a6);adicionales.add(a7);
        ArrayList<Producto> cb1 = new ArrayList<Producto>();
        cb1.add(b1);
        ArrayList<Producto> ca1 = new ArrayList<Producto>();
        ca1.add(a1);
        ArrayList<Producto> cb2 = new ArrayList<Producto>();
        cb2.add(b1);
        ArrayList<Producto> ca2 = new ArrayList<Producto>();
        ca2.add(a1);
        ArrayList<Producto> cb3 = new ArrayList<Producto>();
        cb3.add(b3);
        ArrayList<Producto> ca3 = new ArrayList<Producto>();
        ca3.add(a5);
        ArrayList<Producto> cb4 = new ArrayList<Producto>();
        cb2.add(b2);
        ArrayList<Producto> ca4 = new ArrayList<Producto>();
        ca2.add(a7);
        ca2.add(a3);
        ArrayList<Producto> cb5 = new ArrayList<Producto>();
        cb2.add(b5);
        ArrayList<Producto> ca5 = new ArrayList<Producto>();
        ca2.add(a2);
        SupremeFactory factoryS = new SupremeFactory();
        Combo c1= factoryS.crearCombo("predefinido", 0, p1, cb1, ca1, 0);
        Combo c2= factoryS.crearCombo("predefinido", 0, p2, cb2, ca2, 1);
        Combo c3= factoryS.crearCombo("predefinido", 0, p3, cb3, ca3, 2);
        Combo c4= factoryS.crearCombo("predefinido", 0, p4, cb4, ca4, 3);
        Combo c5= factoryS.crearCombo("predefinido", 0, p5, cb5, ca5, 4);
        Combo c6= factoryS.crearCombo("predefinido", 0, p6, cb2, ca1, 5);
        combos = new ArrayList<Combo>();
        combos.add(c1);
        combos.add(c2);
        combos.add(c3);
        combos.add(c4);
        combos.add(c5);
        combos.add(c6);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
           switch(e.getActionCommand()) {
            case "+":
                llamarTipoCombo();
                break;
            case "Cancelar":
                cancelar();
                break;
            default:
                System.out.println("No funciona agregar");
                break;
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void llamarTipoCombo(){
       VentanaTipoCombo ventana2 = new VentanaTipoCombo(combos,platos);
       ControladorVentanaTipoCombo controladorTipoCombo = new ControladorVentanaTipoCombo(ventana2,this.combos,this.platos,this.bebidas,this.adicionales, this.compra);
       
       controladorTipoCombo.vista.setVisible(true);
       controladorTipoCombo.vista.setLocationRelativeTo(null);
       ventanaPrincipal.setVisible(false);
       

    }
    
    public void cancelar(){
     //   System.out.println("Hola");
        this.compra=null;
    }
    
}
