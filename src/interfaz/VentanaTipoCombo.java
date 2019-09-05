/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import tareacombosfactory.Combo;
import tareacombosfactory.ComboFactory;
import tareacombosfactory.ICombo;
import tareacombosfactory.Producto;

/**
 *
 * @author Gloriana
 */
public class VentanaTipoCombo extends javax.swing.JFrame {
   // ArrayList<Combo> compra;
    /**
     * Creates new form VentanaTipoCombo
     */
    private static ArrayList<Combo> combos;
    private static ArrayList<Producto> platos;
    public VentanaTipoCombo(ArrayList<Combo> combos,ArrayList<Producto> platos) {
        this.combos=combos;
        this.platos=platos;
        initComponents();
        añadirCombos();
        añadirPlatos();
       // this.add(jScrollPane1);
       // this.add(jScrollPane2);
       // this.revalidate();
       // this.repaint();
        
    }
    public void añadirCombos(){
        DefaultListModel model = new DefaultListModel<>();
        for (Combo item: combos){
        String texto = item.getPlato().getNombre();
                for (Producto b: item.getBebidas()){
                   texto+=", "+b.getNombre();
                }
                for (Producto a: item.getAdicionales()){
                    texto+=", "+a.getNombre();
                }
         texto+=", "+item.getTotal();  
         model.addElement(texto);
     
        }
        jList1.setModel(model);

    }
    public void añadirPlatos(){
        DefaultListModel model = new DefaultListModel<>();
        for (Producto item: platos){
            String texto = item.getNombre()+", "+item.getPrecio();
            System.out.println(texto);
            model.addElement(texto);
 
       }
       jList2.setModel(model);
       }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblSeleccionarTipoCombo = new javax.swing.JLabel();
        lblComboPredeterminado = new javax.swing.JLabel();
        lblComboAlGusto = new javax.swing.JLabel();
        lblSeleccionarPlatoPrincipal = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSeleccionarTipoCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSeleccionarTipoCombo.setText("Por favor seleccione el tipo de combo:");

        lblComboPredeterminado.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblComboPredeterminado.setText("Combo predeterminado:");

        lblComboAlGusto.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblComboAlGusto.setText("Combo al gusto:");

        lblSeleccionarPlatoPrincipal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSeleccionarPlatoPrincipal.setText("Seleccione un plato principal");

        btnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSeleccionarPlatoPrincipal)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSiguiente)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblComboPredeterminado)
                                        .addComponent(lblComboAlGusto)
                                        .addComponent(lblSeleccionarTipoCombo))
                                    .addGap(271, 271, 271)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblSeleccionarTipoCombo)
                .addGap(29, 29, 29)
                .addComponent(lblComboPredeterminado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblComboAlGusto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSeleccionarPlatoPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
     /*   if (!jList1.isSelectionEmpty() && !jList2.isSelectionEmpty()){
            JOptionPane.showMessageDialog(this, "Debe escoger un combo o un plato principal");
        }
        else if(!jList1.isSelectionEmpty()){
            VentanaAgregados va = new VentanaAgregados();
            int index = jList1.getSelectedIndex();
            va.combo = VentanaCombos.combos.get(index);
            va.compra=compra;
            va.setVisible(true);
            this.setVisible(false);
        }
        else{
           VentanaAgregados va = new VentanaAgregados();
            int index = jList1.getSelectedIndex();
            va.plato = VentanaCombos.platos.get(index);
            va.compra= compra;
            va.setVisible(true);
            this.setVisible(false); 
        }*/
    }//GEN-LAST:event_btnSiguienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaTipoCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTipoCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTipoCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTipoCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaTipoCombo(combos,platos).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSiguiente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public javax.swing.JList<String> jList1;
    public javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblComboAlGusto;
    private javax.swing.JLabel lblComboPredeterminado;
    private javax.swing.JLabel lblSeleccionarPlatoPrincipal;
    private javax.swing.JLabel lblSeleccionarTipoCombo;
    // End of variables declaration//GEN-END:variables
}
