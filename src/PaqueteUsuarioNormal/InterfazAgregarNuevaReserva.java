/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteUsuarioNormal;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import PaqueteUsuarioAdministrador.Funcion;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jojann_2
 */
public class InterfazAgregarNuevaReserva extends javax.swing.JFrame {
    
    
    private Funcion InstanciaFuncion;
    private Usuario InstanciaUsuario;
    
    public String id_usuario;
    DefaultTableModel Modelo;
    /**
     * Creates new form InterfazAgregarNuevaReserva
    */

    /*
    public void setUsuario(Usuario Instancia)      
    {   
        Instancia= new Usuario();
        InstanciaUsuario=Instancia;
    }*/
    
    
    public InterfazAgregarNuevaReserva(Usuario Instancia) {

        initComponents();
        InstanciaUsuario= Instancia;
        
        InstanciaFuncion= new Funcion();
        
        Modelo=(DefaultTableModel) jTable1.getModel();
        Modelo.setColumnCount(0);
        
        Modelo.addColumn("Codigo");
        Modelo.addColumn("Pelicula");
        Modelo.addColumn("Director");
        Modelo.addColumn("Fecha");
        Modelo.addColumn("Hora Inicio");
        Modelo.addColumn("Hora Fin");
        Modelo.addColumn("Valor boleto");
        Modelo.addColumn("Numero Boletas");

        
        Modelo.setNumRows(0);
        
        ListarFuncionesActivas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Listado de Funciones ");

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar Funcion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(204, 204, 204))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(37, 37, 37)
                        .addComponent(jButton1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        AgregarFuncion();
   
    }//GEN-LAST:event_jButton1ActionPerformed

    public void AgregarFuncion()
    {   
        String id_funcion;
        int numero_tiquetes;
        int valor_tiquete;
        int valor_total;
        int respuesta_confirmar;
        
        if(jTable1.getSelectedRow() >= 0 )
        {
            id_funcion=String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),0));
            numero_tiquetes=Integer.parseInt(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),7)));
            
            if(numero_tiquetes<=0)
            {
                JOptionPane.showMessageDialog(null, "Ingrese un numero de tiquetes mayor que cero.");
                
            }else
            {   
                
                valor_tiquete=Integer.parseInt(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),6)).trim());
                valor_total=valor_tiquete*numero_tiquetes;
                   	
                respuesta_confirmar = JOptionPane.showConfirmDialog(null, "¿Añadir nueva reserva con "+numero_tiquetes+" boletos?", "Confirmar", JOptionPane.CANCEL_OPTION);
                if(respuesta_confirmar==0)
                {
                    InstanciaUsuario.AgregarReserva(id_funcion,numero_tiquetes,valor_total);
                    LimpiarTabla();
                    ListarFuncionesActivas();
                }
               

            }
   
        }else
        {
            JOptionPane.showMessageDialog(null, "Selecciona una fila.");
        }
    }
    
     public void LimpiarTabla(){
        
        int filas= jTable1.getRowCount();
        
        try {
            for (int i = 0;filas>i; i++) 
            {
                Modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }

    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void Mostrar(Usuario Instancia) {
        
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
            java.util.logging.Logger.getLogger(InterfazAgregarNuevaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAgregarNuevaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAgregarNuevaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAgregarNuevaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAgregarNuevaReserva(Instancia).setVisible(true);
            }
        });
    }
    
    public void ListarFuncionesActivas()
    {
   
        ResultSet Listado= InstanciaFuncion.ListarFunciones();

        try {
            if(Listado!=null)
            {   
                while(Listado.next())
                {   
                    Modelo.addRow(new Object[]{Listado.getString("id_funcion").trim(),Listado.getString("nombre").trim(),Listado.getString("director").trim(),Listado.getString("fecha").trim(),Listado.getString("hora_inicio").trim(),Listado.getString("hora_fin").trim(),Listado.getString("valor").trim(),"1"});
                }
                
            }else
            {
                JOptionPane.showMessageDialog(null,"CONSULTA EN BLANCO");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falla: "+ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
