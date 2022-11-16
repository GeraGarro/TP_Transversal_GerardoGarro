package Transversal_Vistas;

import Transversal_Data.Alumno_Data;
import Transversal_Entidades.Alumno;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ListaAlumnos extends javax.swing.JFrame {
    private NuevoAlumno nA;
    private DefaultTableModel tabla;
    private Alumno_Data aD;
   
    public ListaAlumnos() {
        
        initComponents();
        aD=new Alumno_Data();
        tabla=new DefaultTableModel();
        BotonEliminar.setEnabled(false);
        BotonModificar.setEnabled(false);
        cabecera();
        limpiarFilas();
        llenarTabla();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaAlumnos = new javax.swing.JTable();
        BotonModificar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BotonCerrar.setText("Cerrar");
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALUMNOS");

        jTablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablaAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaAlumnos);

        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(BotonCerrar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(BotonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(BotonCerrar)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
     this.dispose();
    }//GEN-LAST:event_BotonCerrarActionPerformed

    private void jTablaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaAlumnosMouseClicked
        BotonModificar.setEnabled(true);
        BotonEliminar.setEnabled(true);
    }//GEN-LAST:event_jTablaAlumnosMouseClicked

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        eliminarAlumno();
        limpiarFilas();
        llenarTabla();

    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        int filaSelecionada=jTablaAlumnos.getSelectedRow();
        nA=new NuevoAlumno();
        if(filaSelecionada!=1){
            int idAlumno=(Integer)jTablaAlumnos.getValueAt(filaSelecionada, 0);
            String nombre=(String)jTablaAlumnos.getValueAt(filaSelecionada, 1);
            String apellido=(String)jTablaAlumnos.getValueAt(filaSelecionada, 2);
            LocalDate fecha=(LocalDate)jTablaAlumnos.getValueAt(filaSelecionada, 3);
            String dni=(String)jTablaAlumnos.getValueAt(filaSelecionada, 4);
            boolean activo=(Boolean)jTablaAlumnos.getValueAt(filaSelecionada, 5);
          
            Alumno a1=new Alumno(idAlumno, nombre, apellido, fecha, dni, activo);
            nA.setAlumno(a1);
            nA.setVisible(true);
                      
        }
    }//GEN-LAST:event_BotonModificarActionPerformed

 
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListaAlumnos().setVisible(true);
            }
        });
     }
   private void cabecera(){
       
  ArrayList<Object> columnas=new ArrayList<>();
     columnas.add("ID");
     columnas.add("Nombre");
     columnas.add("Apellido");
     columnas.add("Fecha Nacimiento");
     columnas.add("DNI");
     columnas.add("Activo");
     
        for (Object c : columnas) {
            tabla.addColumn(c);
            
        }
        jTablaAlumnos.setModel(tabla);
    }
     private void llenarTabla(){
            
        for (Alumno a1 : aD.listadoAlumnos()) {
            tabla.addRow(new Object[]{a1.getIdAlumno(),a1.getNombre(),a1.getApellido(),a1.getFechaNacimiento(),a1.getDni(),a1.isActivo()});
        }
     }
      private void limpiarFilas(){
     int indFilas=tabla.getRowCount()-1;
        for (int i = indFilas; i>=0; i--) {
          tabla.removeRow(i);
        }
    
    }  
      private void eliminarAlumno(){
           int filaSelecionada= jTablaAlumnos.getSelectedRow();
        String valor= jTablaAlumnos.getValueAt(filaSelecionada, 0).toString();
        aD.eliminarAlumno(Integer.parseInt(valor));
       }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaAlumnos;
    // End of variables declaration//GEN-END:variables
}
