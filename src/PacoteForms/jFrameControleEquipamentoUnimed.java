/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteForms;

import Classes.ControlEquiUnimed;
import conec.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;

//**
//*
//* @author Edmundo Faria de Oliveira Neto <netofaria18@gmail.com>
//*/
public class jFrameControleEquipamentoUnimed extends javax.swing.JFrame {

    ControlEquiUnimed equipunimed;

    /**
     * Creates new form jFrameControleEquipamentoUnimed
     */
    public jFrameControleEquipamentoUnimed() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(jFrameControleEquipamentoUnimed.DO_NOTHING_ON_CLOSE);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCodigo = new javax.swing.JTextField();
        jTxtEquipamento = new javax.swing.JTextField();
        jTxtModelo = new javax.swing.JTextField();
        jTxtDepartamento = new javax.swing.JTextField();
        jCbSelecionar = new javax.swing.JComboBox<>();
        jTxtPatrimonio = new javax.swing.JTextField();
        jTxtValor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTxtCentroCusto = new javax.swing.JTextField();
        jBtnSairControEquipUnimed = new javax.swing.JButton();
        jBtnSalvarControEquipUnimed = new javax.swing.JButton();
        jBtnAtualizarControEquipUnimed = new javax.swing.JButton();
        jBtnLimparControEquipUnimed = new javax.swing.JButton();
        jTxtDataEnvio = new javax.swing.JFormattedTextField();
        jTxtDataRetorno = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Equipamentos Unimed");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle de Envio de Equipamentos - Bios"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Patrimônio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, -1));

        jLabel2.setText("Departamento");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 90, 121, 20));

        jLabel3.setText("Código");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel4.setText("Equipamento");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 80, 20));

        jLabel5.setText("Modelo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 90, 60, 20));

        jLabel6.setText("Data de Envio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 160, 90, -1));

        jLabel7.setText("Data Retorno");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 70, -1));

        jLabel8.setText("Entregue?");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 72, -1));

        jLabel9.setText("Valor Orçamento");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 97, -1));

        jCodigo.setEditable(false);
        jCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCodigoActionPerformed(evt);
            }
        });
        jCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCodigoKeyReleased(evt);
            }
        });
        jPanel1.add(jCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, -1));
        jPanel1.add(jTxtEquipamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 90, -1));
        jPanel1.add(jTxtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 55, -1));
        jPanel1.add(jTxtDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 55, -1));

        jCbSelecionar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Sim", "Não" }));
        jPanel1.add(jCbSelecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));
        jPanel1.add(jTxtPatrimonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, 20));
        jPanel1.add(jTxtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 70, -1));

        jLabel11.setText("Centro de Custo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 121, -1));
        jPanel1.add(jTxtCentroCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 70, -1));

        jBtnSairControEquipUnimed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PktImagens/Log Out.png"))); // NOI18N
        jBtnSairControEquipUnimed.setToolTipText("Salvar");
        jBtnSairControEquipUnimed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairControEquipUnimedActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnSairControEquipUnimed, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 34, 40));

        jBtnSalvarControEquipUnimed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PktImagens/Save-icon.png"))); // NOI18N
        jBtnSalvarControEquipUnimed.setToolTipText("Salvar");
        jBtnSalvarControEquipUnimed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarControEquipUnimedActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnSalvarControEquipUnimed, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 34, 40));

        jBtnAtualizarControEquipUnimed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PktImagens/atualizar.png"))); // NOI18N
        jBtnAtualizarControEquipUnimed.setToolTipText("Atualizar");
        jBtnAtualizarControEquipUnimed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAtualizarControEquipUnimedActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAtualizarControEquipUnimed, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 34, 40));

        jBtnLimparControEquipUnimed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PktImagens/edit-clear.png"))); // NOI18N
        jBtnLimparControEquipUnimed.setToolTipText("Limpar");
        jPanel1.add(jBtnLimparControEquipUnimed, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 34, 40));

        jTxtDataEnvio.setBackground(new java.awt.Color(204, 204, 204));
        jTxtDataEnvio.setForeground(new java.awt.Color(0, 0, 0));
        try {
            jTxtDataEnvio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtDataEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDataEnvioActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtDataEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, 20));

        jTxtDataRetorno.setBackground(new java.awt.Color(204, 204, 204));
        jTxtDataRetorno.setForeground(new java.awt.Color(0, 0, 0));
        try {
            jTxtDataRetorno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jTxtDataRetorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 60, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSairControEquipUnimedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairControEquipUnimedActionPerformed
        jFrameControleEquipamentoUnimed.this.dispose();
    }//GEN-LAST:event_jBtnSairControEquipUnimedActionPerformed

    private void jBtnSalvarControEquipUnimedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarControEquipUnimedActionPerformed
        equipunimed = new ControlEquiUnimed(Integer.parseInt(jCodigo.getText()),
                (Integer.parseInt(jTxtPatrimonio.getText())),
                jTxtEquipamento.getText(),
                jTxtModelo.getText(),
                jTxtDepartamento.getText(),
                jTxtDataEnvio.getText(),
                jTxtDataRetorno.getText(),
                jCbSelecionar.getSelectedItem().toString(),
                Float.parseFloat(jTxtValor.getText()),
                Integer.parseInt(jTxtCentroCusto.getText()));
        JOptionPane.showMessageDialog(this, "salvo com sucesso!");
        equipunimed.Save();
    }//GEN-LAST:event_jBtnSalvarControEquipUnimedActionPerformed

    private void jBtnAtualizarControEquipUnimedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAtualizarControEquipUnimedActionPerformed

    }//GEN-LAST:event_jBtnAtualizarControEquipUnimedActionPerformed

    private void jTxtDataEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDataEnvioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDataEnvioActionPerformed

    private void jCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCodigoActionPerformed

    }//GEN-LAST:event_jCodigoActionPerformed

    private void jCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCodigoKeyReleased
        /* Random gerador = new Random();

        //pega numeros randomicos até 100, passa para uma variavel String
        String numero = String.valueOf((gerador.nextInt(10000)));
        //seta o jTextField
        jCodigo.setText(numero);*/
    }//GEN-LAST:event_jCodigoKeyReleased

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
            java.util.logging.Logger.getLogger(jFrameControleEquipamentoUnimed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameControleEquipamentoUnimed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameControleEquipamentoUnimed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameControleEquipamentoUnimed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameControleEquipamentoUnimed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAtualizarControEquipUnimed;
    private javax.swing.JButton jBtnLimparControEquipUnimed;
    private javax.swing.JButton jBtnSairControEquipUnimed;
    private javax.swing.JButton jBtnSalvarControEquipUnimed;
    private javax.swing.JComboBox<String> jCbSelecionar;
    private javax.swing.JTextField jCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtCentroCusto;
    private javax.swing.JFormattedTextField jTxtDataEnvio;
    private javax.swing.JFormattedTextField jTxtDataRetorno;
    private javax.swing.JTextField jTxtDepartamento;
    private javax.swing.JTextField jTxtEquipamento;
    private javax.swing.JTextField jTxtModelo;
    private javax.swing.JTextField jTxtPatrimonio;
    private javax.swing.JTextField jTxtValor;
    // End of variables declaration//GEN-END:variables
}