/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        
        USUARIO_INGRESO.setBackground(new java.awt.Color(0,0,0,1));
        CONTRASENA_INGRESO.setBackground(new java.awt.Color(0,0,0,1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CONTRASENA_INGRESO = new javax.swing.JPasswordField();
        USUARIO_INGRESO = new javax.swing.JTextField();
        btb_ACCEDER = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btb_SALIR = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CONTRASENA_INGRESO.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        CONTRASENA_INGRESO.setForeground(new java.awt.Color(204, 204, 204));
        CONTRASENA_INGRESO.setBorder(null);
        getContentPane().add(CONTRASENA_INGRESO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 356, 330, 30));

        USUARIO_INGRESO.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        USUARIO_INGRESO.setForeground(new java.awt.Color(204, 204, 204));
        USUARIO_INGRESO.setBorder(null);
        getContentPane().add(USUARIO_INGRESO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 330, 30));

        btb_ACCEDER.setBackground(new java.awt.Color(72, 137, 173));
        btb_ACCEDER.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btb_ACCEDER.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btb_ACCEDERMouseMoved(evt);
            }
        });
        btb_ACCEDER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btb_ACCEDERMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btb_ACCEDERMouseExited(evt);
            }
        });
        btb_ACCEDER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("        ACCEDER");
        btb_ACCEDER.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 50));

        getContentPane().add(btb_ACCEDER, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 190, 50));

        btb_SALIR.setBackground(new java.awt.Color(72, 137, 173));
        btb_SALIR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btb_SALIR.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btb_SALIRMouseMoved(evt);
            }
        });
        btb_SALIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btb_SALIRMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btb_SALIRMouseExited(evt);
            }
        });
        btb_SALIR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("           SALIR");
        btb_SALIR.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 50));

        getContentPane().add(btb_SALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 190, 50));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login-1.jpeg"))); // NOI18N
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btb_ACCEDERMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btb_ACCEDERMouseMoved
        btb_ACCEDER.setBackground(new Color(36,83,115));
    }//GEN-LAST:event_btb_ACCEDERMouseMoved

    private void btb_ACCEDERMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btb_ACCEDERMouseExited
        btb_ACCEDER.setBackground(new Color(72,137,173));
    }//GEN-LAST:event_btb_ACCEDERMouseExited

    private void btb_SALIRMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btb_SALIRMouseMoved
        btb_SALIR.setBackground(new Color(36,83,115));
    }//GEN-LAST:event_btb_SALIRMouseMoved

    private void btb_SALIRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btb_SALIRMouseExited
        btb_SALIR.setBackground(new Color(72,137,173));
    }//GEN-LAST:event_btb_SALIRMouseExited

    private void btb_ACCEDERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btb_ACCEDERMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btb_ACCEDERMouseClicked

    private void btb_SALIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btb_SALIRMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btb_SALIRMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CONTRASENA_INGRESO;
    private javax.swing.JTextField USUARIO_INGRESO;
    private javax.swing.JPanel btb_ACCEDER;
    private javax.swing.JPanel btb_SALIR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_fondo;
    // End of variables declaration//GEN-END:variables
}
