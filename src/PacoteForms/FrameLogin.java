/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteForms;

import conec.Conexao;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.security.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.SQLException;

///**
 //*
// * @author Edmundo Faria de Oliveira Neto <netofaria18@gmail.com>
// */
public class FrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrameLogin
     */
    public FrameLogin() {
        initComponents();
        getRootPane().setDefaultButton(entrar);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(FrameLogin.DISPOSE_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);
        Conexao conexao = new Conexao();
        Connection C = conexao.getCon();
        System.out.println("conexao ok!");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        entrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PktImagens/key.png"))); // NOI18N
        entrar.setText("Entrar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        jPanel1.add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 110, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Senha:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 50, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 70, -1));
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 210, -1));
        jPanel1.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PktImagens/login_icon.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 200, 190));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PktImagens/logo_unimed.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed

        if (usuario.getText().equals("") && (senha.getText().equals(""))) {
            FramePrincipal Principal = new FramePrincipal();
            Principal.setVisible(true);
            dispose();
    }//GEN-LAST:event_entrarActionPerformed
        else if (usuario.getText().equals("rodrigo.betussi") && (senha.getText().equals("unimed031"))) {
            FramePrincipal Principal = new FramePrincipal();
            Principal.setVisible(true);
            dispose();
    }   
     
        else  if (usuario.getText().equals("igor.dardani") && (senha.getText().equals("unimed031"))) {
            FramePrincipal Principal = new FramePrincipal();
            Principal.setVisible(true);
            dispose();
    }   
        else  if (usuario.getText().equals("dhone.ancioto") && (senha.getText().equals("unimed031"))) {
            FramePrincipal Principal = new FramePrincipal();
            Principal.setVisible(true);
            dispose();
    }   
        else  if (usuario.getText().equals("sergio.lebrao") && (senha.getText().equals("unimed031"))) {
            FramePrincipal Principal = new FramePrincipal();
            Principal.setVisible(true);
            dispose();
            
    }   
         else  if (usuario.getText().equals("fabio.marcaro") && (senha.getText().equals("123"))) {
            FramePrincipal Principal = new FramePrincipal();
            Principal.setVisible(true);
            dispose();
            
    }   
        else {
            JOptionPane.showMessageDialog(null, "acesso Negado");
           FrameLogin Login = new FrameLogin();
            Login.setVisible(true);
            dispose();
        }

    }

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
