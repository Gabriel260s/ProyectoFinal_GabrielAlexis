/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinalp1;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyectofinalp1.Tienda;

/**
 *
 * @author gabri
 */
public class GestorGui extends javax.swing.JFrame {

    static Tienda items = new Tienda();
    static ArrayList<Tienda> Inventario = new ArrayList<Tienda>();
    private int id = 0;

    public GestorGui() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Eliminar = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        Nombre = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        Cantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Eliminar.setBackground(new java.awt.Color(255, 0, 51));
        Eliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Agregar.setBackground(new java.awt.Color(51, 51, 255));
        Agregar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Nombre.setBackground(new java.awt.Color(153, 153, 153));
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        Precio.setBackground(new java.awt.Color(153, 153, 153));
        Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioActionPerformed(evt);
            }
        });

        Cantidad.setBackground(new java.awt.Color(153, 153, 153));
        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Ingrese el nombre");

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Ingrese cantidad: ");

        jLabel3.setBackground(new java.awt.Color(255, 51, 51));
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Ingrese precio:");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(Cantidad)
                                                        .addComponent(Agregar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                130, Short.MAX_VALUE))
                                                .addGap(51, 51, 51)
                                                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(15, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EliminarActionPerformed
        String idStr = JOptionPane.showInputDialog("Por favor, ingresa el ID del item que deseas eliminar:");
        if (idStr != null && !idStr.isEmpty()) {
            int id = Integer.parseInt(idStr);
            for (int i = 0; i < Inventario.size(); i++) {
                if (Inventario.get(i).getId() == id) {
                    Inventario.remove(i);
                    break;
                }
            }
            for (int i = 0; i < Inventario.size(); i++) {
                Inventario.get(i).setId(i + 1);
            }
            jTextArea1.setText("");
            for (int i = 0; i < Inventario.size(); i++) {
                jTextArea1.append(Inventario.get(i).toString() + "\n");
            }
        }
    }// GEN-LAST:event_EliminarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_AgregarActionPerformed
        String nombre = Nombre.getText();
        String precioStr = Precio.getText();
        String cantidadStr = Cantidad.getText();

        id++;

        if (nombre.isEmpty() || precioStr.isEmpty() || cantidadStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor llene todos los campos");
            return;
        }

        int precio = Integer.parseInt(precioStr);
        int cantidad = Integer.parseInt(cantidadStr);

        Tienda nuevoItem = new Tienda(nombre, id, precio, cantidad);
        Inventario.add(nuevoItem);
        jTextArea1.setText("");
        Nombre.setText("");
        Precio.setText("");
        Cantidad.setText("");
        for (int i = 0; i < Inventario.size(); i++) {
            jTextArea1.append(Inventario.get(i).toString() + "\n");
        }
    }// GEN-LAST:event_AgregarActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_NombreActionPerformed
        String texto = Nombre.getText();

    }// GEN-LAST:event_NombreActionPerformed

    private void PrecioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PrecioActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_PrecioActionPerformed

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CantidadActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_CantidadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Precio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}