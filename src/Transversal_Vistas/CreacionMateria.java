package Transversal_Vistas;

import Transversal_Data.Materia_Data;
import Transversal_Entidades.Materia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class CreacionMateria extends javax.swing.JFrame {
 private Materia_Data mD;
    
    public CreacionMateria() {
        initComponents();
        mD=new Materia_Data();
        desactivarCampos();
        jBotonGuardar.setEnabled(false);
        BotonActualizar.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTNombre = new javax.swing.JTextField();
        jT_IDMateria = new javax.swing.JTextField();
        jTAnio = new javax.swing.JTextField();
        BotonCerrar = new javax.swing.JButton();
        jBotonGuardar = new javax.swing.JButton();
        jBotonNuevo = new javax.swing.JButton();
        jcActivo = new javax.swing.JCheckBox();
        BotonActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Incorporacion de Materia al Sistema ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID Materia");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre de la Asignatura");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Año ");

        JTNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTNombreFocusLost(evt);
            }
        });

        jT_IDMateria.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jT_IDMateriaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jT_IDMateria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jT_IDMateriaFocusLost(evt);
            }
        });
        jT_IDMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_IDMateriaActionPerformed(evt);
            }
        });
        jT_IDMateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jT_IDMateriaKeyTyped(evt);
            }
        });

        jTAnio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTAnioFocusLost(evt);
            }
        });

        BotonCerrar.setText("Cerrar");
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });

        jBotonGuardar.setText("Guardar");
        jBotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonGuardarActionPerformed(evt);
            }
        });

        jBotonNuevo.setText("Nuevo");
        jBotonNuevo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jBotonNuevoFocusLost(evt);
            }
        });
        jBotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonNuevoActionPerformed(evt);
            }
        });

        jcActivo.setText("Activo");

        BotonActualizar.setText("Actualizar");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jBotonNuevo)
                                .addGap(27, 27, 27)
                                .addComponent(jBotonGuardar)
                                .addGap(52, 52, 52)
                                .addComponent(BotonActualizar)))
                        .addGap(0, 144, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_IDMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jcActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_IDMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jcActivo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotonGuardar)
                    .addComponent(BotonActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCerrar)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
       this.dispose();
    }//GEN-LAST:event_BotonCerrarActionPerformed

    private void jBotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonNuevoActionPerformed
        activarCampos();
        jT_IDMateria.setEnabled(false);
        limpiarCampos();
        jBotonGuardar.setEnabled(true);
        
        
     
        
    }//GEN-LAST:event_jBotonNuevoActionPerformed

    private void jT_IDMateriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jT_IDMateriaFocusLost
       int v=0;
        try{
         String num=  jT_IDMateria.getText();
         v=Integer.parseInt(num);
       }
        catch(NumberFormatException a){
           JOptionPane.showMessageDialog(this, "Ingrese Numero");
           jT_IDMateria.requestFocus();
       }
   
      JTNombre.setEnabled(true);
       
       
       
    }//GEN-LAST:event_jT_IDMateriaFocusLost

    private void jTAnioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTAnioFocusLost
       String valor="[0-9]*";
        if(!jT_IDMateria.getText().matches(valor))
            JOptionPane.showMessageDialog(this, "Ingrese Solo Numeros");
        jTAnio.requestFocus();
    }//GEN-LAST:event_jTAnioFocusLost

    private void JTNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTNombreFocusLost
        if(JTNombre.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Campo Vacio ¡COMPLETAR!");
        JTNombre.requestFocus();
        }
        jTAnio.setEnabled(true);
    
    }//GEN-LAST:event_JTNombreFocusLost

    private void jBotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonGuardarActionPerformed
        Materia ma=new Materia();
        ma.setNombre(JTNombre.getText());
        ma.setAnio((jTAnio.getText()));
        if(jcActivo.isSelected()){
           ma.setActivo(true);
        }
        else{
            ma.setActivo(false);
        }
        mD.guardarMateria(ma);
        limpiarCampos();
        desactivarCampos();
        jBotonGuardar.setEnabled(false);
        
        
    }//GEN-LAST:event_jBotonGuardarActionPerformed

    private void jBotonNuevoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBotonNuevoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jBotonNuevoFocusLost

    private void jT_IDMateriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_IDMateriaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_IDMateriaKeyTyped

    private void jT_IDMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_IDMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_IDMateriaActionPerformed

    private void jT_IDMateriaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jT_IDMateriaAncestorAdded
     
    }//GEN-LAST:event_jT_IDMateriaAncestorAdded

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        Materia mat=new Materia();
        mat.setIdMateria(Integer.parseInt(jT_IDMateria.getText()));
        mat.setNombre(JTNombre.getText());
        mat.setAnio((jTAnio.getText()));
        if(jcActivo.isSelected()){
           mat.setActivo(true);
        }
        else{
            mat.setActivo(false);
        }
        mD.actualizarMateria(mat);
        limpiarCampos();
        desactivarCampos();
        BotonActualizar.setEnabled(false);
        
    }//GEN-LAST:event_BotonActualizarActionPerformed
    
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreacionMateria().setVisible(true);
            }
        });
    }
    private void limpiarCampos(){
        JTNombre.setText("");
        jTAnio.setText("");
        jT_IDMateria.setText("");
        
    }
    
    private void activarCampos(){
        JTNombre.setEnabled(true);
        jT_IDMateria.setEnabled(true);
        jTAnio.setEnabled(true);
        
    }
    
    private void desactivarCampos(){
       JTNombre.setEnabled(false);
        jT_IDMateria.setEnabled(false);
        jTAnio.setEnabled(false); 
        
    }
    public void setMateria(Materia ma){
        jBotonNuevo.setEnabled(false);
        jBotonGuardar.setEnabled(false);
        BotonActualizar.setEnabled(true);
        JTNombre.setEnabled(true);
        jTAnio.setEnabled(true);
        jT_IDMateria.setEnabled(false);
        jT_IDMateria.setText(ma.getIdMateria()+"");
        JTNombre.setText(ma.getNombre()+"");
        jTAnio.setText(ma.getAnio()+"");
          
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JTextField JTNombre;
    private javax.swing.JButton jBotonGuardar;
    private javax.swing.JButton jBotonNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTAnio;
    private javax.swing.JTextField jT_IDMateria;
    private javax.swing.JCheckBox jcActivo;
    // End of variables declaration//GEN-END:variables
}
