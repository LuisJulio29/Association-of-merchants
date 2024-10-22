/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.udc.asociacioncomercios.GUI.Frames;


import com.udc.asociacioncomercios.app.Datos;
import com.udc.asociacioncomercios.elementos.Proveedor;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author cpala
 */
public class FormEditarProveedor extends javax.swing.JFrame {

    /**
     * Creates new form CrearComercio
     */
    Datos d = Datos.getD();
    private int posicion;
    public FormEditarProveedor() {
        initComponents();
    }
    
    public FormEditarProveedor(int posicion){
        this.posicion = posicion;
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreProveedor = new javax.swing.JTextField();
        telefonoProveedor = new javax.swing.JTextField();
        emailProveedor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        nitProveedor = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setText("Editar Proveedor");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Nit");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("Email");

        nombreProveedor.setText(d.getListaProveedores().get(posicion).getNombre());
        nombreProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProveedorActionPerformed(evt);
            }
        });

        telefonoProveedor.setText(d.getListaProveedores().get(posicion).getTelefono());
        telefonoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoProveedorActionPerformed(evt);
            }
        });

        emailProveedor.setText(d.getListaProveedores().get(posicion).getEmail());

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nitProveedor.setEditable(false);
        nitProveedor.setText(d.getListaProveedores().get(posicion).getNit()
        );
        nitProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitProveedorActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nitProveedor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombreProveedor)
                            .addComponent(telefonoProveedor)
                            .addComponent(emailProveedor)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 38, Short.MAX_VALUE)))))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(telefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cancelar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void nombreProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProveedorActionPerformed

    private void telefonoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoProveedorActionPerformed

    @SuppressWarnings("empty-statement")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 if (validarCampos(nombreProveedor,nitProveedor,telefonoProveedor,emailProveedor)) {
                // Obtener valores de los campos
                String nuevoNombre = nombreProveedor.getText();
                String nuevoNit = nitProveedor.getText();
                String nuevoTelefono = telefonoProveedor.getText();
                String nuevoEmail = emailProveedor.getText();
                
                d.getListaProveedores().get(posicion).setNombre(nuevoNombre);
                d.getListaProveedores().get(posicion).setTelefono(nuevoTelefono);
                d.getListaProveedores().get(posicion).setEmail(nuevoEmail);
                actualizarTabla();
                JOptionPane.showMessageDialog(null, "Proveedor editado exitosamente.", "COMERSCA", JOptionPane.DEFAULT_OPTION); 
                dispose();

    } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nitProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nitProveedorActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FormEditarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FormEditarProveedor().setVisible(true);
            }
        });
    }
    
    private boolean validarCampos(JTextField campoNombre,JTextField campoNit,JTextField campoTelefono,JTextField campoEmail){
            // Validar que los campos no estén vacíos
     if (campoNombre.getText().isEmpty() || campoNit.getText().isEmpty() || campoTelefono.getText().isEmpty() || campoEmail.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validar que el campo de correo electrónico contenga al menos un '@'
    if (!campoEmail.getText().contains("@")) {
        JOptionPane.showMessageDialog(null, "El campo de correo electrónico debe contener al menos un '@'.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    return true;
    } 
    
    public void actualizarTabla() {

        // Limpiar la tabla antes de agregar nuevos datos
        d.getModProveedor().setRowCount(0);

        // Agregar los nuevos datos
        for (Proveedor p : d.getListaProveedores()) {
            
            d.agregarFilaProveedor(p.getNombre(),p.getNit(),p.getTelefono(),p.getEmail(),"Editar");
        }

        // Notificar a la tabla que los datos han cambiado
        d.getModProveedor().fireTableDataChanged();
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField emailProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nitProveedor;
    private javax.swing.JTextField nombreProveedor;
    private javax.swing.JTextField telefonoProveedor;
    // End of variables declaration//GEN-END:variables
}
