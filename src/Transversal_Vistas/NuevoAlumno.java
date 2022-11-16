
package Transversal_Vistas;

import javax.swing.JOptionPane;
import Transversal_Entidades.Alumno;
import Transversal_Data.Alumno_Data;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NuevoAlumno extends javax.swing.JFrame {

 private Alumno_Data aD;
 
    public NuevoAlumno() {
        aD=new Alumno_Data();
        initComponents();
        
        desactivarCampos();
        BotonGuardar.setEnabled(false);
        BotonActtualizar.setEnabled(false);
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jAPellido = new javax.swing.JTextField();
        jNombre = new javax.swing.JTextField();
        TDNI = new javax.swing.JTextField();
        BotonGuardar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        BotonNuevo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTLegajo = new javax.swing.JTextField();
        jCActivo = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jDCfecha = new com.toedter.calendar.JDateChooser();
        BotonActtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario Incorporacion Alumno");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel2.setText("DNI");

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel5.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel6.setText("N°LEgajo");

        jAPellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jAPellidoFocusLost(evt);
            }
        });
        jAPellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAPellidoActionPerformed(evt);
            }
        });

        jNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jNombreFocusLost(evt);
            }
        });
        jNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreActionPerformed(evt);
            }
        });

        TDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TDNIFocusLost(evt);
            }
        });
        TDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TDNIActionPerformed(evt);
            }
        });

        BotonGuardar.setText("GUARDAR");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonSalir.setText("SALIR");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonNuevo.setText("NUEVO");
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel3.setText("Apellido");

        jTLegajo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTLegajoFocusLost(evt);
            }
        });
        jTLegajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTLegajoActionPerformed(evt);
            }
        });

        jCActivo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jCActivo.setText("Activo");
        jCActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCActivoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel7.setText("Fecha Nacimiento");

        jDCfecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCfechaPropertyChange(evt);
            }
        });

        BotonActtualizar.setText("Actualizar");
        BotonActtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDCfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(TDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jAPellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTLegajo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonNuevo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonActtualizar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonSalir)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jCActivo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAPellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGuardar)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDCfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonActtualizar))
                .addGap(9, 9, 9)
                .addComponent(jCActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(BotonSalir)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAPellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAPellidoActionPerformed

    }//GEN-LAST:event_jAPellidoActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void jNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreActionPerformed
      
    }//GEN-LAST:event_jNombreActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
      Alumno a1=new Alumno();
      a1.setApellido(jAPellido.getText());
      a1.setNombre(jNombre.getText());
      a1.setDni(TDNI.getText());
      SimpleDateFormat formatoFecha= new SimpleDateFormat("dd-MM-yyyy");
      String fecha=formatoFecha.format(jDCfecha.getDate());
      LocalDate fN=LocalDate.parse(fecha,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
      a1.setFechaNacimiento(fN);
      if(jCActivo.isSelected()){
         a1.setActivo(true);
      }
      else{
       a1.setActivo(false);
      }
      aD.guardarAlumno(a1);
      limpiarCampos();
      desactivarCampos();
      BotonGuardar.setEnabled(false);
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed
        activarCampos();
        jTLegajo.setEnabled(false);
        limpiarCampos();
        
        BotonGuardar.setEnabled(true);
    }//GEN-LAST:event_BotonNuevoActionPerformed

    private void jAPellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jAPellidoFocusLost
       if(jAPellido.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Campo Vacio ¡COMPLETAR!");
        jAPellido.requestFocus();
        }
    }//GEN-LAST:event_jAPellidoFocusLost

    private void jNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jNombreFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreFocusLost

    private void jTLegajoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTLegajoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTLegajoFocusLost

    private void jTLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTLegajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTLegajoActionPerformed

    private void jCActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCActivoActionPerformed

    private void TDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TDNIActionPerformed

    }//GEN-LAST:event_TDNIActionPerformed

    private void TDNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TDNIFocusLost
        try{
            String num=  TDNI.getText();
            int v=Integer.parseInt(num);
        }
        catch(NumberFormatException a){
            JOptionPane.showMessageDialog(this, "Ingrese Numero");
            TDNI.requestFocus();
        }

    }//GEN-LAST:event_TDNIFocusLost

    private void jDCfechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDCfechaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDCfechaPropertyChange

    private void BotonActtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActtualizarActionPerformed
        Alumno a=new Alumno();
        a.setIdAlumno(Integer.parseInt(jTLegajo.getText()));
        a.setApellido(jAPellido.getText());
        a.setNombre(jNombre.getText());
       
        SimpleDateFormat formatoFecha= new SimpleDateFormat("dd-MM-yyyy");
      String fecha=formatoFecha.format(jDCfecha.getDate());
      LocalDate fN=LocalDate.parse(fecha,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
      
      a.setFechaNacimiento(fN);
      a.setDni(TDNI.getText());
      if(jCActivo.isSelected()){
         a.setActivo(true);
      }
      else{
       a.setActivo(false);
      }
       aD.modificarAlumno(a);
       limpiarCampos();
       desactivarCampos();
       BotonActtualizar.setEnabled(false);
    }//GEN-LAST:event_BotonActtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoAlumno().setVisible(true);
            }
        });
    }
private void limpiarCampos(){
    jAPellido.setText("");
    TDNI.setText("");
    jNombre.setText("");
    jTLegajo.setText("");
    
}

private void activarCampos(){
    jAPellido.setEnabled(true);
    jNombre.setEnabled(true);
    jTLegajo.setEnabled(true);
    TDNI.setEnabled(true);
    jCActivo.setEnabled(true);
    jDCfecha.setEnabled(true);
}

private void desactivarCampos(){
    jAPellido.setEnabled(false);
    jNombre.setEnabled(false);
    jTLegajo.setEnabled(false);
    TDNI.setEnabled(false);
    jCActivo.setEnabled(false);
    jDCfecha.setEnabled(false);
}

public void setAlumno(Alumno a){
    jTLegajo.setEnabled(false);
    BotonGuardar.setEnabled(false);
    BotonNuevo.setEnabled(false);
    BotonActtualizar.setEnabled(true);
    jAPellido.setEnabled(true);
    jNombre.setEnabled(true);
    jDCfecha.setEnabled(true);
    TDNI.setEnabled(true);
    jCActivo.setEnabled(true);
    jTLegajo.setText((a.getIdAlumno())+"");
    jAPellido.setText(a.getApellido()+"");
    jNombre.setText(a.getNombre()+"");
    TDNI.setText(a.getDni()+"");
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActtualizar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTextField TDNI;
    private javax.swing.JTextField jAPellido;
    private javax.swing.JCheckBox jCActivo;
    private com.toedter.calendar.JDateChooser jDCfecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jTLegajo;
    // End of variables declaration//GEN-END:variables
}
