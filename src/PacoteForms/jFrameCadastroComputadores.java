/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteForms;

import Classes.cadcomp;
import conec.Conexao;
import java.awt.Component;
import java.sql.Connection;
import java.util.Random;
import javax.swing.JOptionPane;

//**
//* @author Edmundo Faria de Oliveira Neto <netofaria18@gmail.com>
//*/
public class jFrameCadastroComputadores extends javax.swing.JFrame {

    cadcomp comp;

    /**
     * Creates new form jFrameCadastroComputadores
     */
    public jFrameCadastroComputadores() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(jFrameCadastroComputadores.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        //----------------- conexao
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

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("manutencao?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        cadastrocomputadorQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cadastrocomputador c");
        cadastrocomputadorList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cadastrocomputadorQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jTxtProcessador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtCod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtHd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtNomeComp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtMemoria = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtWindows = new javax.swing.JTextField();
        jBtnCadastrar = new javax.swing.JButton();
        jBtnAtualizar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jBtnSairCadComp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Computadores");

        jLabel1.setText("HD");

        jLabel2.setText("Codigo");

        jTxtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodActionPerformed(evt);
            }
        });
        jTxtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtCodKeyReleased(evt);
            }
        });

        jLabel3.setText("Serial Windows");

        jLabel4.setText("Nome Computador");

        jLabel5.setText("Memoria");

        jLabel6.setText("Processador");

        jBtnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PktImagens/Save-icon.png"))); // NOI18N
        jBtnCadastrar.setToolTipText("Salvar");
        jBtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarActionPerformed(evt);
            }
        });

        jBtnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PktImagens/atualizar.png"))); // NOI18N
        jBtnAtualizar.setToolTipText("Atualizar");

        jBtnSairCadComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PktImagens/Log Out.png"))); // NOI18N
        jBtnSairCadComp.setToolTipText("Sair");
        jBtnSairCadComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairCadCompActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jTxtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(270, 270, 270)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jBtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jBtnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jBtnSairCadComp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTxtProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jTxtMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jTxtHd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtNomeComp, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtWindows, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSairCadComp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTxtNomeComp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTxtWindows, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTxtProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTxtMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTxtHd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarActionPerformed
        comp = new cadcomp(Integer.parseInt(jTxtCod.getText()),
                jTxtNomeComp.getText(),
                Integer.parseInt(jTxtMemoria.getText()),
                Integer.parseInt(jTxtHd.getText()),
                jTxtWindows.getText(),
                jTxtProcessador.getText());
        JOptionPane.showMessageDialog(this, "salvo com sucesso!");

        // metodo para limpar logo após salvar
        jTxtCod.setText(null);
        jTxtNomeComp.setText(null);
        jTxtMemoria.setText(null);
        jTxtHd.setText(null);
        jTxtWindows.setText(null);
        jTxtProcessador.setText(null);

        comp.Save();

        //---------

    }//GEN-LAST:event_jBtnCadastrarActionPerformed

    private void jBtnSairCadCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairCadCompActionPerformed
        jFrameCadastroComputadores.this.dispose();
    }//GEN-LAST:event_jBtnSairCadCompActionPerformed

    private void jTxtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodActionPerformed

    }//GEN-LAST:event_jTxtCodActionPerformed

    private void jTxtCodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCodKeyReleased
        Random gerador = new Random();

        //pega numeros randomicos até 100000, passa para uma variavel String
        String numero = String.valueOf((gerador.nextInt(10000)));
        //seta o jTextField
        jTxtCod.setText(numero);
    }//GEN-LAST:event_jTxtCodKeyReleased

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
            java.util.logging.Logger.getLogger(jFrameCadastroComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameCadastroComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameCadastroComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameCadastroComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameCadastroComputadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<PktClassesCriadasAutomatico.Cadastrocomputador> cadastrocomputadorList;
    private javax.persistence.Query cadastrocomputadorQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jBtnAtualizar;
    private javax.swing.JButton jBtnCadastrar;
    private javax.swing.JButton jBtnSairCadComp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTxtCod;
    private javax.swing.JTextField jTxtHd;
    private javax.swing.JTextField jTxtMemoria;
    private javax.swing.JTextField jTxtNomeComp;
    private javax.swing.JTextField jTxtProcessador;
    private javax.swing.JTextField jTxtWindows;
    // End of variables declaration//GEN-END:variables
}