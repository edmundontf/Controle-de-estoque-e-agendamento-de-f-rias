/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteForms;

import Classes.Estoque;
import conec.Conexao;
import java.sql.Connection;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class jFrameEstoque extends javax.swing.JFrame {

    
    Estoque est;
    /**
     * Creates new form jFrameEstoque
     */
    public jFrameEstoque() {
        initComponents();
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(jFrameEstoque.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        Conexao conexao = new Conexao();
        Connection C = conexao.getCon();
        System.out.println("conexao ok!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCbSelecione = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jCbQuantidade = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jId = new javax.swing.JTextField();
        jModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        jSalvarEstoque = new javax.swing.JButton();
        jSairEstoque = new javax.swing.JButton();
        jAtualizarEstoque = new javax.swing.JButton();
        jLimpartEstoque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrada de Materiais"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Quantidade");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, 20));

        jCbSelecione.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Teclado", "Mouse", "Impressora", "Peça", "Toner", "Fonte", "Outros" }));
        jPanel1.add(jCbSelecione, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 90, -1));

        jLabel2.setText("Id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 10, 20));

        jCbQuantidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", " " }));
        jPanel1.add(jCbQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, 30));

        jLabel3.setText("Modelo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 40, 20));
        jPanel1.add(jId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 30, -1));
        jPanel1.add(jModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 310, 20));

        jLabel4.setText("Nome");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 40, 20));
        jPanel1.add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 160, 20));

        jSalvarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PktImagens/Save-icon.png"))); // NOI18N
        jSalvarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalvarEstoqueActionPerformed(evt);
            }
        });
        jPanel1.add(jSalvarEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 30, 40));

        jSairEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PktImagens/Log Out.png"))); // NOI18N
        jSairEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairEstoqueActionPerformed(evt);
            }
        });
        jPanel1.add(jSairEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 30, 40));

        jAtualizarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PktImagens/atualizar.png"))); // NOI18N
        jAtualizarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAtualizarEstoqueActionPerformed(evt);
            }
        });
        jPanel1.add(jAtualizarEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 30, 40));

        jLimpartEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PktImagens/edit-clear.png"))); // NOI18N
        jPanel1.add(jLimpartEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 30, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalvarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalvarEstoqueActionPerformed
      /*est = new Estoque(Integer.parseInt(jId.getText()),
                jNome.getText(),
                Integer.parseInt(jModelo.getText()),
                (jCbSelecione.getSelectedItem()),
                (jCbQuantidade.getSelectedItem()));
                */
      
      
    }//GEN-LAST:event_jSalvarEstoqueActionPerformed

    private void jSairEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairEstoqueActionPerformed
      
    }//GEN-LAST:event_jSairEstoqueActionPerformed

    private void jAtualizarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAtualizarEstoqueActionPerformed

      
  

    }//GEN-LAST:event_jAtualizarEstoqueActionPerformed

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
            java.util.logging.Logger.getLogger(jFrameEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAtualizarEstoque;
    private javax.swing.JComboBox<String> jCbQuantidade;
    private javax.swing.JComboBox<String> jCbSelecione;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jLimpartEstoque;
    private javax.swing.JTextField jModelo;
    private javax.swing.JTextField jNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSairEstoque;
    private javax.swing.JButton jSalvarEstoque;
    // End of variables declaration//GEN-END:variables
}
