/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ControlSeccionPublica;
import Modelo.ModeloSeccionPublica;
import java.util.Observable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class VistaSeccionPublica extends javax.swing.JFrame {

    private ModeloSeccionPublica modelo;
    private ControlSeccionPublica controlador;

    public VistaSeccionPublica() {
        initComponents();
    }

    private void initLocal() {

        setTitle("Pagina principal");
        setLocationRelativeTo(null);

        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBReferente = new javax.swing.JButton();
        jBHistoria = new javax.swing.JButton();
        jBContactenos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBBuscador = new javax.swing.JButton();
        jMenuBar3 = new javax.swing.JMenuBar();
        jmOpciones2 = new javax.swing.JMenu();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jmregistrarse = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmlogueo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBReferente.setText("  Referente instucicional");

        jBHistoria.setText("Historia");

        jBContactenos.setText("Contactenos");
        jBContactenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContactenosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("   Aerolinea JD");

        jBBuscador.setText("Buscador de vuelos");

        jmOpciones2.setText("Acceder a mi cuenta");
        jmOpciones2.setName("catalogo"); // NOI18N
        jmOpciones2.add(jSeparator4);

        jmregistrarse.setText("Registrarse");
        jmregistrarse.setName("cambiar"); // NOI18N
        jmOpciones2.add(jmregistrarse);
        jmOpciones2.add(jSeparator1);

        jmlogueo.setText("Logueo");
        jmOpciones2.add(jmlogueo);

        jMenuBar3.add(jmOpciones2);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBBuscador, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jBContactenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBReferente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBHistoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBReferente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBContactenos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBContactenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContactenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBContactenosActionPerformed

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
            java.util.logging.Logger.getLogger(VistaSeccionPublica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaSeccionPublica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaSeccionPublica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaSeccionPublica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VistaSeccionPublica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscador;
    private javax.swing.JButton jBContactenos;
    private javax.swing.JButton jBHistoria;
    private javax.swing.JButton jBReferente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    public javax.swing.JMenu jmOpciones2;
    public javax.swing.JMenuItem jmlogueo;
    public javax.swing.JMenuItem jmregistrarse;
    // End of variables declaration//GEN-END:variables

    public void setModelo(ModeloSeccionPublica modelo) {
        this.modelo = modelo;

    }

    public void setControlador(ControlSeccionPublica controlador) {
        this.controlador = controlador;
        jmregistrarse.addActionListener(controlador);
        jmlogueo.addActionListener(controlador);
        jBReferente.addActionListener(controlador);
        jBHistoria.addActionListener(controlador);
        jBContactenos.addActionListener(controlador);
        jBBuscador.addActionListener(controlador);

    }

//   private ModeloLogin modelo;
//    private ControllerLogin controlador;
//    
//    public void setModelo(ModeloLogin modelo){
//        this.modelo = modelo;
//        modelo.addObserver(this);
//    }
//    
//    public void setControlador(ControllerLogin controlador){
//        this.controlador = controlador;
//        Ingresar.addActionListener(controlador);
//        salir.addActionListener(controlador);
//    }
//    
//    public void mostrarMensaje(String mensaje) {
//        JOptionPane.showMessageDialog(this, mensaje);
//    }
    public void update(Observable o, Object o1) {

    }
}
