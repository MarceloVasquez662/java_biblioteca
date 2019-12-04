/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boleta;

import Factura.*;
import Pantallas.MenuOpciones;
import Pantallas.Nuevo_Usuario;
import Pantallas.Principal;
import Pantallas.conexion;
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
public class MostrarModificar extends javax.swing.JFrame {

    /**
     * Creates new form InsertarLibro
     */
    conexion x;
    public MostrarModificar() {
        initComponents();
        this.setLocationRelativeTo(null);
        Date now = new Date(System.currentTimeMillis());
        calendarioBoleta.setMaxSelectableDate(now);
        
        ArrayList <String> listaCliente=new ArrayList <String>();
        ArrayList <String> listaLibro=new ArrayList <String>();
        listaCliente=llenarListaCliente();
        listaLibro=llenarListaLibro();
        ArrayList <String> listaTrabajador=new ArrayList <String>();
        listaTrabajador=llenarListaTrabajador();
        
        for(int i=0; i<listaCliente.size(); i++)
        {
            ComboBoxCliente.addItem(listaCliente.get(i));
        }
        for(int i=0; i<listaLibro.size(); i++)
        {
            ComboBoxLibro.addItem(listaLibro.get(i));
        }
        for(int i=0; i<listaTrabajador.size(); i++)
        {
            BoxTrabajador.addItem(listaTrabajador.get(i));
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNeto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ComboBoxCliente = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        ComboBoxMetodoPago = new javax.swing.JComboBox<>();
        calendarioBoleta = new com.toedter.calendar.JDateChooser();
        ComboBoxLibro = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BoxTrabajador = new javax.swing.JComboBox<>();
        txtLibro = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtTrabajador = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Folio");

        txtFolio.setEnabled(false);

        jLabel2.setText("Precio Neto");

        txtNeto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNetoKeyTyped(evt);
            }
        });

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha Venta");

        jLabel7.setText("Cliente involucrado");

        ComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente" }));
        ComboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxClienteActionPerformed(evt);
            }
        });

        jLabel8.setText("Metodo de Pago");

        ComboBoxMetodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metodo de Pago", "Efectivo", "Tarjeta de Credito", "Tarjeta de Debito" }));
        ComboBoxMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxMetodoPagoActionPerformed(evt);
            }
        });

        ComboBoxLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro" }));
        ComboBoxLibro.setEnabled(false);

        jLabel5.setText("Libro Vendido");

        jLabel3.setText("Trabajador involucrado");

        BoxTrabajador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trabajador" }));

        txtLibro.setEnabled(false);

        txtCliente.setEnabled(false);

        txtTrabajador.setEnabled(false);

        jButton5.setText("Mostrar Datos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFolio)
                                    .addComponent(txtNeto)
                                    .addComponent(calendarioBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2)
                                    .addComponent(ComboBoxMetodoPago, 0, 139, Short.MAX_VALUE)
                                    .addComponent(BoxTrabajador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(txtCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTrabajador, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(21, 21, 21)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calendarioBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(BoxTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addGap(10, 10, 10)
                        .addComponent(txtTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(113, 113, 113)
                .addComponent(btnVolver)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        public ArrayList llenarListaCliente()
    {
        ArrayList <String> lista=new ArrayList <String>();
        x=new conexion();
        Connection cn=x.getConnection();
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs;
            rs=st.executeQuery("select rut_cliente from mydb.cliente");
            
            while(rs.next())
            {
                lista.add(rs.getString(1));
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Nuevo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
        
     public ArrayList llenarListaLibro()
    {
        ArrayList <String> lista=new ArrayList <String>();
        x=new conexion();
        Connection cn=x.getConnection();
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs;
            rs=st.executeQuery("select numero_serie from mydb.libro");
            
            while(rs.next())
            {
                lista.add(rs.getString(1));
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Nuevo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
     
          public ArrayList llenarListaTrabajador()
    {
        ArrayList <String> lista=new ArrayList <String>();
        x=new conexion();
        Connection cn=x.getConnection();
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs;
            rs=st.executeQuery("select rut_trabajador from mydb.trabajador");
            
            while(rs.next())
            {
                lista.add(rs.getString(1));
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Nuevo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        MenuOpciones x=new MenuOpciones();
        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtFolio.setText("");
        txtNeto.setText("");
        calendarioBoleta.setCalendar(null);
        ComboBoxCliente.setSelectedIndex(0);
        ComboBoxMetodoPago.setSelectedIndex(0);
        txtFolio.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ComboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxClienteActionPerformed

    private void ComboBoxMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxMetodoPagoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ComboBoxMetodoPagoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int folio=0, precioNeto=0, precioBruto, iva;
        String fecha="";
        int dia, mes, anio, idLibro;
        
        boolean sw=true;
        
        try
        {
            folio=Integer.parseInt(txtFolio.getText());
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null, "Folio ingresado no es numerico entero.");
            sw=false;
        }
        
        try
        {
            precioNeto=Integer.parseInt(txtNeto.getText());
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null, "Precio neto ingresado no es numerico entero.");
            sw=false;
        }
        
        try
        {
            dia=calendarioBoleta.getCalendar().get(Calendar.DAY_OF_MONTH);
            mes=calendarioBoleta.getCalendar().get(Calendar.MONTH)+1;
            anio=calendarioBoleta.getCalendar().get(Calendar.YEAR);
            fecha=(dia+"-"+mes+"-"+anio);
        }
        catch(NullPointerException ex)
        {
            JOptionPane.showMessageDialog(null, "Fecha no valida");
            sw=false;
        }
        
        if(ComboBoxLibro.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null, "No selecciono un libro para la boleta");
            sw=false;
        }
        else
        {
            String id=String.valueOf(ComboBoxLibro.getSelectedItem());
        
            idLibro=Integer.parseInt(id);
        }
        
        if(ComboBoxMetodoPago.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null, "No selecciono un metodo de pago");
            sw=false;
        }
        if(ComboBoxCliente.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null, "No se selecciono un cliente.");
            sw=false;
        }
        if(BoxTrabajador.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null, "No se selecciono un trabajador.");
            sw=false;
        }
        
        if(sw==true)
        {
            Connection cn=x.getConnection();
            try 
            {
                Statement st=cn.createStatement();
                int i;
                precioNeto=Integer.parseInt(txtNeto.getText());
                iva=precioNeto*19/100;
                precioBruto=precioNeto+iva;
                i=st.executeUpdate("update documento set precio_bruto="+precioBruto+", precio_neto="+precioNeto+", iva="+iva+" where Boleta_folio_boleta="+folio+"");
                if(i!=0)
                {
                    st.executeUpdate("update boleta set fecha_venta='"+fecha+"', Metodo_pago='"+ComboBoxMetodoPago.getSelectedItem()+"', Trabajador='"+BoxTrabajador.getSelectedItem()+"', Cliente='"+ComboBoxCliente.getSelectedItem()+"' where folio_boleta="+folio+"");
                    JOptionPane.showMessageDialog(null, "Boleta actualizada!");
                    MenuOpciones x=new MenuOpciones();
                    x.setVisible(true);
                    dispose();
                }
                
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Boleta que intenta ingresar ya se encuentra en la BD");
                System.out.println(ex.getMessage());
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int idLibro;
        String rutCliente, rutTrabajador, id;

        if(ComboBoxCliente.getSelectedIndex()==0 || ComboBoxLibro.getSelectedIndex()==0 || BoxTrabajador.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null, "No ha escogido un libro, cliente o trabajador");
        }
        else
        {
            id=(String)ComboBoxLibro.getSelectedItem();
            idLibro=Integer.parseInt(id);
            rutCliente=(String)ComboBoxCliente.getSelectedItem();
            rutTrabajador=(String)BoxTrabajador.getSelectedItem();
            try
            {
                Connection cn=x.getConnection();
                Statement st=cn.createStatement();
                ResultSet rs;
                rs=st.executeQuery("select titutlo from libro where numero_serie="+idLibro+"");
                if(rs.next())
                {
                    txtLibro.setText(rs.getString(1));
                }
                rs=st.executeQuery("select nombre_persona, apellido_paterno, apellido_materno from persona join cliente on cliente.rut_cliente=persona.Cliente_rut_cliente where persona.Cliente_rut_cliente='"+rutCliente+"'");
                if(rs.next())
                {
                    txtCliente.setText(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
                }
                rs=st.executeQuery("select nombre_persona, apellido_paterno, apellido_materno from persona join trabajador on trabajador.rut_trabajador=persona.Trabajador_rut_trabajador where persona.Trabajador_rut_trabajador='"+rutTrabajador+"'");
                if(rs.next())
                {
                    txtTrabajador.setText(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
                }
            }
            catch(SQLException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtNetoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNetoKeyTyped
        // TODO add your handling code here:
        if(txtNeto.getText().length()==9)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtNetoKeyTyped

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
            java.util.logging.Logger.getLogger(MostrarModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new MostrarModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> BoxTrabajador;
    public javax.swing.JComboBox<String> ComboBoxCliente;
    public javax.swing.JComboBox<String> ComboBoxLibro;
    public javax.swing.JComboBox<String> ComboBoxMetodoPago;
    private javax.swing.JButton btnVolver;
    private com.toedter.calendar.JDateChooser calendarioBoleta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCliente;
    public javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtLibro;
    public javax.swing.JTextField txtNeto;
    private javax.swing.JTextField txtTrabajador;
    // End of variables declaration//GEN-END:variables
}
