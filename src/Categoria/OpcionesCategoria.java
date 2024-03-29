/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Categoria;

import Autor.*;
import Pantallas.MenuOpciones;
import javax.swing.JOptionPane;

/**
 *
 * @author 20017181-0
 */
public class OpcionesCategoria extends javax.swing.JFrame {

    /**
     * Creates new form OpcionesAutor
     */
    public OpcionesCategoria() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jPanel1 = new javax.swing.JPanel();
        radioInsertar = new javax.swing.JRadioButton();
        radioModificar = new javax.swing.JRadioButton();
        radioEliminar = new javax.swing.JRadioButton();
        radioMostrarTodos = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        buttonGroup1.add(radioInsertar);
        radioInsertar.setText("Insertar Categoria");

        buttonGroup1.add(radioModificar);
        radioModificar.setText("Modificar Nombre Categoria");

        buttonGroup1.add(radioEliminar);
        radioEliminar.setText("Eliminar Categoria");

        buttonGroup1.add(radioMostrarTodos);
        radioMostrarTodos.setText("Mostrar Todas");
        radioMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMostrarTodosActionPerformed(evt);
            }
        });

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver al Menu Principal");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(495, Short.MAX_VALUE)
                        .addComponent(btnVolver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(radioModificar)
                                    .addComponent(radioEliminar, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioInsertar, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioMostrarTodos, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(radioInsertar)
                .addGap(18, 18, 18)
                .addComponent(radioModificar)
                .addGap(18, 18, 18)
                .addComponent(radioEliminar)
                .addGap(18, 18, 18)
                .addComponent(radioMostrarTodos)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(btnVolver)
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

    private void radioMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMostrarTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMostrarTodosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(radioInsertar.isSelected() || radioModificar.isSelected() || radioEliminar.isSelected() || radioMostrarTodos.isSelected())
        {
            if(radioInsertar.isSelected())
            {
                InsertarCategoria x=new InsertarCategoria();
                x.setVisible(true);
                dispose();
            }
            if(radioModificar.isSelected())
            {
                BuscarCategoriaModificar x=new BuscarCategoriaModificar();
                x.setVisible(true);
                dispose();
            }
            if(radioEliminar.isSelected())
            {
                EliminarCategoria x=new EliminarCategoria();
                x.setVisible(true);
                dispose();
            }
            if(radioMostrarTodos.isSelected())
            {
                MostrarTodasCategorias x=new MostrarTodasCategorias();
                x.setVisible(true);
                dispose();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No selecciono una opcion");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        MenuOpciones x=new MenuOpciones();
        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(OpcionesCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcionesCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcionesCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcionesCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcionesCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioEliminar;
    private javax.swing.JRadioButton radioInsertar;
    private javax.swing.JRadioButton radioModificar;
    private javax.swing.JRadioButton radioMostrarTodos;
    // End of variables declaration//GEN-END:variables
}
