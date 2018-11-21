/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ControlSeccionPublica;
import Modelo.ModeloSeccionPublica;
import Modelo.ModeloVuelo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class VistaSeccionPublica extends javax.swing.JFrame implements Observer {

    private DefaultTableModel model;
    private ModeloSeccionPublica modelo;
    private ControlSeccionPublica controlador;

    public VistaSeccionPublica() {
        initComponents();
        initLocal();
    }

    private void initLocal() {
        model = (DefaultTableModel) jTDescuentos.getModel();
        setTitle("Principal");
        setLocationRelativeTo(null);
       
        this.setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBBuscador = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTA1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTDescuentos = new javax.swing.JTable();
        jMenuBar3 = new javax.swing.JMenuBar();
        jmOpciones2 = new javax.swing.JMenu();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jmregistrarse = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmlogueo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("   Aerolinea JD");

        jBBuscador.setText("Buscador de vuelos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("¡Descuentos!");

        jTA1.setColumns(20);
        jTA1.setRows(5);
        jTA1.setText("\n                                                 Referente institucional\n\nAerolíneas JD se dedicada al transporte comercial de pasajeros y carga. \nRealiza vuelos a más de 60 destinos nacionales e internacionales. Centra\nsus operaciones comerciales desde dos aeropuertos de la Ciudad de Buenos\nAires: Aeroparque Jorge Newbery y el Aeropuerto Internacional de\nEzeiza. La empresa también administra la aerolínea Austral Líneas \nAéreas, las empresas de cargas Aerolíneas Cargo y Jet Paq, la empresa de\nservicios de rampa Aerohandling, y la empresa de servicios turísticos \nOhptar. \nLa empresa fue privatizada en 1999 y vuelta a la gestión estatal en 2008.\nDesde 2009, se modernizó la flota, adquirió simuladores de vuelo y creó\nnuevas rutas de vuelo intercontinentales, nacionales y regionales.\nEn 2017, la empresa logró un récord transportando a más de 14 millones \nde pasajeros. Es considerada una de las aerolíneas más seguras del mundo.\n\n \n\n                                                        Historia\n\nAerolíneas JD nació en 1970 por un decreto del presidente José David, \nmediante la unión de cuatro aerolíneas.  En el año 1979, la compañía se \ntransformó en Sociedad del Estado, pero 11 años después, en 1990, el \nconsorcio español Iberia se hizo cargo de la empresa, que cambió su \nrazón social a Aerolíneas Argentinas S.A. En 2001, la nueva gestión \nincrementó la participación de funcionarios españoles, lo que terminó \ncon el traspaso de la aerolínea al Grupo Marsans. Finalmente, en 2009, la\n empresa fue nacionalizada y regresó a manos del Estado argentino. \n\n\n                                                  Contactenos\n\nNos puedes contactar de lunes a sabado las 24 horas, por los siguientes\nmedios:\n-Correo:fakemail@gmail.com\n-Telefono:2222-2222\n");
        jScrollPane1.setViewportView(jTA1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Informacion");

        jTDescuentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Origen", "Destino", "Fecha de ida", "Fecha de regreso", "Cantidad de pasajeros", "Descuento"
            }
        ));
        jScrollPane2.setViewportView(jTDescuentos);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(314, 314, 314))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTextArea jTA1;
    private javax.swing.JTable jTDescuentos;
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
        jBBuscador.addActionListener(controlador);
        jTA1.setEditable(false);

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
    @Override
    public void update(Observable o, Object o1) {
        if (o1 != null) {
            if (o1.getClass() == ArrayList.class) {
                ArrayList aux = (ArrayList) o1;
                int filas = model.getRowCount();
                for (int i = 0; i < filas; i++) {
                    model.removeRow(0);
                }
                Iterator<Object[]> ite = aux.iterator();
                while (ite.hasNext()) {
                    model.addRow(ite.next());
                }
            }
        }
    }
}
