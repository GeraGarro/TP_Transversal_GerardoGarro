
package Transversal_Vistas;

import java.util.HashSet;
import Transversal_Entidades.Alumno;
import Transversal_Entidades.Materia;
import Transversal_Data.Alumno_Data;
import Transversal_Data.Inscripcion_Data;
import Transversal_Data.Materia_Data;
import Transversal_Entidades.Inscripcion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import Transversal_Entidades.Inscripcion;

public final class Vista_Inscripcion extends javax.swing.JFrame {
    private Alumno_Data aD;
    private Materia_Data mD; 
    private Inscripcion_Data iD;
    
    private DefaultTableModel modeloTabla;
    
    public Vista_Inscripcion() {
        aD=new Alumno_Data();
        mD=new Materia_Data();
        iD=new Inscripcion_Data();
        initComponents();
        botonesSeleccionIns.add(RadioBotonInscripto);
        botonesSeleccionIns.add(RadioBotonNoIns);
        modeloTabla=new DefaultTableModel();
    
        LLenarComboAlumno(aD);
        LLenarComboMateria(mD);
        
        
        cabeceraInscripcion(); 
        limpiarFilasTabla();
        desactivarCampos();
        
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonesSeleccionIns = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jB_Inscribir = new javax.swing.JButton();
        jB_Salir = new javax.swing.JButton();
        jBox_Alumno = new javax.swing.JComboBox<>();
        jBox_Materia = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTNota = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTId_Inscripcion = new javax.swing.JTextField();
        jNuevaInscripcion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInscriciones = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jBoxConsulta = new javax.swing.JComboBox<>();
        RadioBotonInscripto = new javax.swing.JRadioButton();
        RadioBotonNoIns = new javax.swing.JRadioButton();
        BotonAnularIns = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema Inscripcion de Alumno a Materia");

        jLabel2.setText("Alumno");

        jLabel3.setText("Materia");

        jB_Inscribir.setText("INSCRIBIR");
        jB_Inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_InscribirActionPerformed(evt);
            }
        });

        jB_Salir.setText("SALIR");
        jB_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SalirActionPerformed(evt);
            }
        });

        jBox_Alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBox_AlumnoActionPerformed(evt);
            }
        });

        jBox_Materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBox_MateriaActionPerformed(evt);
            }
        });

        jLabel4.setText("Nota Final");

        jTNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNotaActionPerformed(evt);
            }
        });

        jLabel5.setText("id Inscripcion");

        jTId_Inscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTId_InscripcionActionPerformed(evt);
            }
        });

        jNuevaInscripcion.setText("Nueva Inscripcion");
        jNuevaInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevaInscripcionActionPerformed(evt);
            }
        });

        TablaInscriciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaInscriciones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TablaInscricionesFocusLost(evt);
            }
        });
        TablaInscriciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaInscricionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TablaInscricionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TablaInscricionesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaInscricionesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaInscriciones);

        jLabel6.setText("Alumno");

        jBoxConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBoxConsultaMouseClicked(evt);
            }
        });
        jBoxConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxConsultaActionPerformed(evt);
            }
        });

        RadioBotonInscripto.setText("Inscripto");
        RadioBotonInscripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBotonInscriptoActionPerformed(evt);
            }
        });

        RadioBotonNoIns.setText("No Inscripto");
        RadioBotonNoIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBotonNoInsActionPerformed(evt);
            }
        });

        BotonAnularIns.setText("Anular Inscripcion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jNuevaInscripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jB_Inscribir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBox_Materia, 0, 169, Short.MAX_VALUE)
                            .addComponent(jBox_Alumno, 0, 169, Short.MAX_VALUE)
                            .addComponent(jTNota)
                            .addComponent(jTId_Inscripcion))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(RadioBotonInscripto)
                                .addGap(38, 38, 38)
                                .addComponent(RadioBotonNoIns)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBoxConsulta, 0, 169, Short.MAX_VALUE)
                                .addGap(58, 58, 58))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BotonAnularIns)
                                .addGap(182, 182, 182))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jB_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(181, 181, 181))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTId_Inscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBoxConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBox_Materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jB_Inscribir)
                            .addComponent(jNuevaInscripcion))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBox_Alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(RadioBotonInscripto)
                                .addComponent(RadioBotonNoIns)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonAnularIns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jB_Salir))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_InscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_InscribirActionPerformed
       jTId_Inscripcion.setEnabled(false);
        Inscripcion ins=new Inscripcion();
        ins.setAlumno((Alumno) jBox_Alumno.getSelectedItem());
       ins.setMateria((Materia) jBox_Materia.getSelectedItem());
       ins.setNota(Float.parseFloat(jTNota.getText()));
       iD.guardarInscripcion(ins);
       desactivarCampos();
       jB_Salir.setEnabled(true);
       jNuevaInscripcion.setEnabled(true);
       limpiarFilasTabla();
     
    }//GEN-LAST:event_jB_InscribirActionPerformed

    private void jB_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SalirActionPerformed
      this.dispose();
    }//GEN-LAST:event_jB_SalirActionPerformed

    private void jBox_MateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBox_MateriaActionPerformed
         
    }//GEN-LAST:event_jBox_MateriaActionPerformed

    private void jTNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNotaActionPerformed

    private void jBox_AlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBox_AlumnoActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_jBox_AlumnoActionPerformed

    private void jTId_InscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTId_InscripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTId_InscripcionActionPerformed

    private void jNuevaInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevaInscripcionActionPerformed
       activarCampos();
       jTId_Inscripcion.setEnabled(false);
       jNuevaInscripcion.setEnabled(false);
    }//GEN-LAST:event_jNuevaInscripcionActionPerformed

    private void TablaInscricionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaInscricionesMouseClicked
        
        jB_Salir.setEnabled(true);
        jNuevaInscripcion.setEnabled(false);
    }//GEN-LAST:event_TablaInscricionesMouseClicked

    private void TablaInscricionesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TablaInscricionesFocusLost
        jNuevaInscripcion.setEnabled(true);
    }//GEN-LAST:event_TablaInscricionesFocusLost

    private void TablaInscricionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaInscricionesMouseExited
       
    }//GEN-LAST:event_TablaInscricionesMouseExited

    private void TablaInscricionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaInscricionesMousePressed
        
    }//GEN-LAST:event_TablaInscricionesMousePressed

    private void TablaInscricionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaInscricionesMouseEntered
       
    }//GEN-LAST:event_TablaInscricionesMouseEntered

    private void jBoxConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoxConsultaActionPerformed
      
    }//GEN-LAST:event_jBoxConsultaActionPerformed

    private void RadioBotonInscriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBotonInscriptoActionPerformed
        limpiarFilasTabla();
        Alumno al=new Alumno();
        al=(Alumno) jBoxConsulta.getSelectedItem();
        llenarTablaInscrpto(al);
    }//GEN-LAST:event_RadioBotonInscriptoActionPerformed

    private void RadioBotonNoInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBotonNoInsActionPerformed
        
        Alumno al=new Alumno();
        al=(Alumno) jBoxConsulta.getSelectedItem();
        limpiarFilasTabla();
        llenarTablaNoInscrpto(al);
        BotonAnularIns.setEnabled(true);
        
    }//GEN-LAST:event_RadioBotonNoInsActionPerformed

    private void jBoxConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBoxConsultaMouseClicked
        
    }//GEN-LAST:event_jBoxConsultaMouseClicked

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
            java.util.logging.Logger.getLogger(Inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Inscripcion().setVisible(true);
            }
        });
    }
    public void LLenarComboAlumno(Alumno_Data aD){
        for (Alumno alum : aD.listadoAlumnos()) {
            jBox_Alumno.addItem(alum);
            jBoxConsulta.addItem(alum);
        }
    }
    
     public void LLenarComboMateria(Materia_Data mD){
      
        for (Materia ob : mD.listarMaterias() ){
            jBox_Materia.addItem( ob);
      
    }}
     
     private void activarCampos(){
      jTId_Inscripcion.setEnabled(true);
      jBox_Alumno.setEnabled(true);
      jBox_Materia.setEnabled(true);
      jTNota.setEnabled(true);
      jB_Salir.setEnabled(true);
      jB_Inscribir.setEnabled(true);
    }
    
    private void desactivarCampos(){
     jTId_Inscripcion.setEnabled(false);
      jBox_Alumno.setEnabled(false);
      jBox_Materia.setEnabled(false);
      jTNota.setEnabled(false);
      jB_Salir.setEnabled(false);
      jB_Inscribir.setEnabled(false);
    }
    
    private void cabeceraInscripcion(){
     ArrayList<Object> columnasIns=new ArrayList<>();
     columnasIns.add("ID");
     columnasIns.add("Materia");
     columnasIns.add("Anio");
        for (Object c: columnasIns) {
            modeloTabla.addColumn( c);
        }
    TablaInscriciones.setModel(modeloTabla);
    }
    
  private void llenarTablaInscrpto(Alumno alum){
          Alumno a=  (Alumno) jBoxConsulta.getSelectedItem();
          
          
      
            for (Materia mat : iD.obtenerMateriasInscriptas(a)) {
             
                modeloTabla.addRow(new Object[]{mat.getIdMateria(),mat.getNombre(),mat.getAnio()});
            }   
     }
  private void llenarTablaNoInscrpto(Alumno alum){
            
        for (Materia mat : iD.obtenerMateriasNoInscriptas(alum)) {
            modeloTabla.addRow(new Object[]{mat.getIdMateria(),mat.getNombre(),mat.getAnio()});
        }
     }
    private void limpiarFilasTabla(){
        int numFilas=modeloTabla.getRowCount()-1;
        for (int i =numFilas; i >=0; i--) {
            modeloTabla.removeRow(i);
        }     
    }
    
    private void eliminarInscripcion(){
    int filaSeleccionada=TablaInscriciones.getSelectedRow();
    String fila=TablaInscriciones.getValueAt(filaSeleccionada, 0).toString();
    mD.eliminarMateria(Integer.parseInt(fila));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnularIns;
    private javax.swing.JRadioButton RadioBotonInscripto;
    private javax.swing.JRadioButton RadioBotonNoIns;
    private javax.swing.JTable TablaInscriciones;
    private javax.swing.ButtonGroup botonesSeleccionIns;
    private javax.swing.JButton jB_Inscribir;
    private javax.swing.JButton jB_Salir;
    private javax.swing.JComboBox<Alumno> jBoxConsulta;
    private javax.swing.JComboBox<Alumno> jBox_Alumno;
    private javax.swing.JComboBox<Materia> jBox_Materia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jNuevaInscripcion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTId_Inscripcion;
    private javax.swing.JTextField jTNota;
    // End of variables declaration//GEN-END:variables
}
