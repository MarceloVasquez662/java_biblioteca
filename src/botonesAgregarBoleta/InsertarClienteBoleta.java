/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botonesAgregarBoleta;

import Cliente.*;
import Trabajador.*;
import Pantallas.*;
import botonesAgregar.btnAgregarCorreo;
import botonesAgregar.btnAgregarDireccion;
import botonesAgregar.btnAgregarTelefono;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 20017181-0
 */
public class InsertarClienteBoleta extends javax.swing.JFrame {

    /**
     * Creates new form Nuevo_Usuario
     */
    conexion x;
    public InsertarClienteBoleta() {
        initComponents();
        this.setLocationRelativeTo(null);
        Date now = new Date(System.currentTimeMillis());
        calendarioNacimiento.setMaxSelectableDate(now);
        
        ArrayList <String> listaTelefono=new ArrayList <String>();
        ArrayList <String> listaCorreo=new ArrayList <String>();
        ArrayList <String> listaDireccion=new ArrayList <String>();
        listaTelefono=llenarListaTelefono();
        listaCorreo=llenarListaCorreo();
        listaDireccion=llenarListaDireccion();
        
        for(int i=0; i<listaTelefono.size(); i++)
        {
            boxTelefono.addItem(listaTelefono.get(i));
        }
        for(int i=0; i<listaDireccion.size(); i++)
        {
            boxDireccion.addItem(listaDireccion.get(i));
        }
        for(int i=0; i<listaCorreo.size(); i++)
        {
            boxCorreo.addItem(listaCorreo.get(i));
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApPaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApMaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        calendarioNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        boxDireccion = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        boxCorreo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        boxTelefono = new javax.swing.JComboBox<>();
        btnAgregarTelefono = new javax.swing.JButton();
        btnAgregarCorreo = new javax.swing.JButton();
        btnAgregarDireccion = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setResizable(false);

        jLabel1.setText("RUT (sin punto, ni guion)");

        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });
        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRutKeyTyped(evt);
            }
        });

        jLabel3.setText("Nombre");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApPaternoKeyTyped(evt);
            }
        });

        jLabel4.setText("Apellido Paterno");

        txtApMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApMaternoKeyTyped(evt);
            }
        });

        jLabel5.setText("Apellido Materno");

        btnAgregar.setText("Agregar Cliente");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnVolver.setText("Cerrar");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha Nacimiento");

        jLabel7.setText("Direccion");

        boxDireccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Direccion" }));

        jLabel8.setText("Correo");

        boxCorreo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Correo" }));
        boxCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCorreoActionPerformed(evt);
            }
        });

        jLabel9.setText("Numero de Telefono");

        boxTelefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Telefono" }));

        btnAgregarTelefono.setText("Agregar");
        btnAgregarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTelefonoActionPerformed(evt);
            }
        });

        btnAgregarCorreo.setText("Agregar");
        btnAgregarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCorreoActionPerformed(evt);
            }
        });

        btnAgregarDireccion.setText("Agregar");
        btnAgregarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDireccionActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar Box");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boxDireccion, 0, 124, Short.MAX_VALUE)
                            .addComponent(boxCorreo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxTelefono, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarTelefono)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregarCorreo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar))
                            .addComponent(btnAgregarDireccion))
                        .addGap(121, 121, 121))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(txtApPaterno)
                            .addComponent(txtNombre)
                            .addComponent(txtRut)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel6))
                            .addComponent(calendarioNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btnAgregar)
                        .addGap(52, 52, 52)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(boxDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarDireccion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(boxCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarCorreo)
                    .addComponent(btnActualizar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boxTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregarTelefono)))
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calendarioNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList llenarListaTelefono()
    {
        ArrayList <String> lista=new ArrayList <String>();
        x=new conexion();
        Connection cn=x.getConnection();
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs;
            rs=st.executeQuery("select numero_telefono from mydb.telefono");
            
            while(rs.next())
            {
                lista.add(rs.getString(1));
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(InsertarClienteBoleta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public ArrayList llenarListaDireccion()
    {
        ArrayList <String> lista=new ArrayList <String>();
        x=new conexion();
        Connection cn=x.getConnection();
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs;
            rs=st.executeQuery("select direccion from mydb.direccion");
            
            while(rs.next())
            {
                lista.add(rs.getString(1));
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(InsertarClienteBoleta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public ArrayList llenarListaCorreo()
    {
        ArrayList <String> lista=new ArrayList <String>();
        x=new conexion();
        Connection cn=x.getConnection();
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs;
            rs=st.executeQuery("select correo from mydb.correos");
            
            while(rs.next())
            {
                lista.add(rs.getString(1));
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(InsertarClienteBoleta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutActionPerformed

    
    private void txtRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyTyped
        // TODO add your handling code here:
        if(txtRut.getText().length()==9)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtRutKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        String rut="", nombre, apellidoP, apellidoM, contraseña, fecha=""; 
        int dia, mes, anio, rutL;
        boolean sw=true;
        
        try
        {
            dia=calendarioNacimiento.getCalendar().get(Calendar.DAY_OF_MONTH);
            mes=calendarioNacimiento.getCalendar().get(Calendar.MONTH)+1;
            anio=calendarioNacimiento.getCalendar().get(Calendar.YEAR);
            fecha=(dia+"-"+mes+"-"+anio);
        }
        catch(NullPointerException ex)
        {
            JOptionPane.showMessageDialog(null, "La fecha ingresada no es valida");
            sw=false;
        }

        nombre=txtNombre.getText();
        apellidoP=txtApPaterno.getText();
        apellidoM=txtApMaterno.getText();
        
        try
        {
            rutL=Integer.parseInt(txtRut.getText());
            rut=Integer.toString(rutL);
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null, "Rut ingresado es alfanumerico o esta vacio. Solo ingrese el rut sin punto ni guion");
            sw=false;
        }
        
        if(nombre.equals("") || apellidoP.equals("") || apellidoM.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Algunos de los campos esta vacio, intentelo nuevamente");
            sw=false;
        }
        if(rut.length()<8 || rut.length()>9)
        {
            JOptionPane.showMessageDialog(null, "El campo rut no tiene los caracteres suficientes (8 a 9)");
            sw=false;
        }
        
        if(boxCorreo.getSelectedIndex()==0 || boxDireccion.getSelectedIndex()==0 || boxTelefono.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null, "No ha seleccionado correo, telefono o direccion");
            sw=false;
        }
        
        if(sw==true)
        {
            x=new conexion();
            Connection cn=x.getConnection();
            try 
            {
                Statement st=cn.createStatement();
                ResultSet rs;
                
                rs=st.executeQuery("select id_correo from mydb.correos where correo='"+boxCorreo.getSelectedItem()+"'");
                int idcorreo=0;
                if(rs.next())
                {
                    idcorreo=Integer.parseInt(rs.getString(1));
                }
                rs=st.executeQuery("select id_direccion from mydb.direccion where direccion='"+boxDireccion.getSelectedItem()+"'");
                int iddireccion=0;
                if(rs.next())
                {
                    iddireccion=Integer.parseInt(rs.getString(1));
                }
                rs=st.executeQuery("select id_telefono from mydb.telefono where numero_telefono="+boxTelefono.getSelectedItem()+" ");
                int idtelefono=0;
                if(rs.next())
                {
                    idtelefono=Integer.parseInt(rs.getString(1));
                }
                
                int i, m;
                i=st.executeUpdate("insert into mydb.cliente values ('"+rut+"', '"+fecha+"', "+iddireccion+", "+idcorreo+", "+idtelefono+")");
                m=st.executeUpdate("insert into mydb.persona values ('"+nombre+"', '"+apellidoP+"', '"+apellidoM+"', '"+rut+"', null, null )");
                
                if(i!=0 && m!=0)
                {
                    JOptionPane.showMessageDialog(null, "Cliente agregado con exito!");
                    MenuOpciones x=new MenuOpciones();
                    x.setVisible(true);
                    dispose();
                            
                }
            }
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Rut ingresado ya se encuentra en la BD");
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        txtApMaterno.setText("");
        txtApPaterno.setText("");
        txtNombre.setText("");
        txtRut.setText("");
        boxCorreo.setSelectedIndex(0);
        boxDireccion.setSelectedIndex(0);
        boxTelefono.setSelectedIndex(0);
        calendarioNacimiento.setCalendar(null);
        txtRut.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void boxCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCorreoActionPerformed

    private void btnAgregarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDireccionActionPerformed
        // TODO add your handling code here:
        btnAgregarDireccion x=new btnAgregarDireccion();
        x.setVisible(true);
    }//GEN-LAST:event_btnAgregarDireccionActionPerformed

    private void btnAgregarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCorreoActionPerformed
        // TODO add your handling code here:
        btnAgregarCorreo x=new btnAgregarCorreo();
        x.setVisible(true);
    }//GEN-LAST:event_btnAgregarCorreoActionPerformed

    private void btnAgregarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTelefonoActionPerformed
        // TODO add your handling code here:
        btnAgregarTelefono x=new btnAgregarTelefono();
        x.setVisible(true);
    }//GEN-LAST:event_btnAgregarTelefonoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        boxCorreo.removeAllItems();
        boxDireccion.removeAllItems();
        boxTelefono.removeAllItems();
        boxCorreo.addItem("Correo");
        boxDireccion.addItem("Direccion");
        boxTelefono.addItem("Telefono");
        
        ArrayList <String> listaTelefono=new ArrayList <String>();
        ArrayList <String> listaCorreo=new ArrayList <String>();
        ArrayList <String> listaDireccion=new ArrayList <String>();
        listaTelefono=llenarListaTelefono();
        listaCorreo=llenarListaCorreo();
        listaDireccion=llenarListaDireccion();
        
        for(int i=0; i<listaTelefono.size(); i++)
        {
            boxTelefono.addItem(listaTelefono.get(i));
        }
        for(int i=0; i<listaDireccion.size(); i++)
        {
            boxDireccion.addItem(listaDireccion.get(i));
        }
        for(int i=0; i<listaCorreo.size(); i++)
        {
            boxCorreo.addItem(listaCorreo.get(i));
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        if(txtNombre.getText().length()==45)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApPaternoKeyTyped
        // TODO add your handling code here:
        if(txtApPaterno.getText().length()==45)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtApPaternoKeyTyped

    private void txtApMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApMaternoKeyTyped
        // TODO add your handling code here:
        if(txtApMaterno.getText().length()==45)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtApMaternoKeyTyped

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
            java.util.logging.Logger.getLogger(InsertarClienteBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarClienteBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarClienteBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarClienteBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarClienteBoleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCorreo;
    private javax.swing.JComboBox<String> boxDireccion;
    private javax.swing.JComboBox<String> boxTelefono;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarCorreo;
    private javax.swing.JButton btnAgregarDireccion;
    private javax.swing.JButton btnAgregarTelefono;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnVolver;
    private com.toedter.calendar.JDateChooser calendarioNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApMaterno;
    private javax.swing.JTextField txtApPaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
