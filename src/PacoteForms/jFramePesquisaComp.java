/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteForms;

import Classes.cadcomp;
import conec.Conexao;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

//**
////*
//* @author Sammy Guergachi <sguergachi at gmail.com>
//*/
public class jFramePesquisaComp extends javax.swing.JFrame {

    /**
     * Creates new form jFramePesquisaComp
     */
    public jFramePesquisaComp() {
        initComponents();
        findcadcomp();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(jFramePesquisaComp.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        Conexao conexao = new Conexao();
        Connection C = conexao.getCon();
        System.out.println("conexao ok!");
        jTblComp.setSelectionBackground(Color.green);

    }

    public Connection getConnection() {
        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/manutencao", "root", "");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return con;
    }

    public ArrayList<cadcomp> listcadcomp(String ValToSearch) {
        ArrayList<cadcomp> CadastroList = new ArrayList<>();

        Statement st;
        ResultSet rs;

        try {
            Connection con = getConnection();
            st = con.createStatement();
            String searchQuery = "SELECT * FROM cadastrocomputador WHERE Concat(CodComp, NomeComp, Memoria, HD, Windows, Processador) LIKE ('%" + ValToSearch + "%')";
            rs = st.executeQuery(searchQuery);

//"SELECT * FROM mpreventiva WHERE CONCAT(Codigo, Funcionario, Departamento, DataFerias,DataVolta,SelecionaStatus,SelecionaMes,SelecionaAno) LIKE ('%" + ValToSearch + "%')";
            cadcomp cadastrocomp;

            while (rs.next()) {
                cadastrocomp = new cadcomp(
                        rs.getInt("CodComp"),
                        rs.getString("NomeComp"),
                        rs.getInt("Memoria"),
                        rs.getInt("HD"),
                        rs.getString("Windows"),
                        rs.getString("Processador"));
                CadastroList.add(cadastrocomp);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return CadastroList;
    }

    public void findcadcomp() {
        ArrayList<cadcomp> Cadastros = listcadcomp(jTxtViewPesquisaComp.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Codigo", "ID PC", "Memória", "HD", "versão Windows", "Processador"});
        Object[] row = new Object[8];

        for (int i = 0; i < Cadastros.size(); i++) {

            row[0] = Cadastros.get(i).getCodComp();
            row[1] = Cadastros.get(i).getNomeComp();
            row[2] = Cadastros.get(i).getMemoria();
            row[3] = Cadastros.get(i).getHD();
            row[4] = Cadastros.get(i).getWindows();
            row[5] = Cadastros.get(i).getProcessador();

            model.addRow(row);
        }
        jTblComp.setModel(model);

        //int somaLinhas = jTblUser.getRowCount();
        //jTxtContador.setText(Integer.toString(somaLinhas));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("manutencao?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        cadastrocomputadorQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cadastrocomputador c");
        cadastrocomputadorList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cadastrocomputadorQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jExcluirComp = new javax.swing.JButton();
        jBtnRelatorioPesqComp = new javax.swing.JButton();
        jBtnSairPesqComp = new javax.swing.JButton();
        jTxtViewPesquisaComp = new javax.swing.JTextField();
        jTxtCodigoPesquisaComp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblComp = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jExcluirComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PktImagens/atualizar.png"))); // NOI18N
        jExcluirComp.setToolTipText("Atualizar");
        getContentPane().add(jExcluirComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 30, 30));

        jBtnRelatorioPesqComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PktImagens/distributor-report-icon.png"))); // NOI18N
        jBtnRelatorioPesqComp.setToolTipText("Relatório");
        getContentPane().add(jBtnRelatorioPesqComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 30, 30));

        jBtnSairPesqComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PktImagens/Log Out.png"))); // NOI18N
        jBtnSairPesqComp.setToolTipText("Sair");
        jBtnSairPesqComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairPesqCompActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnSairPesqComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 30, 30));

        jTxtViewPesquisaComp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtViewPesquisaCompKeyPressed(evt);
            }
        });
        getContentPane().add(jTxtViewPesquisaComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 400, -1));

        jTxtCodigoPesquisaComp.setEditable(false);
        jTxtCodigoPesquisaComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigoPesquisaCompActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtCodigoPesquisaComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 32, 20));

        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jTblComp.setColumnSelectionAllowed(true);
        jTblComp.setEditingColumn(0);
        jTblComp.setEditingRow(0);
        jTblComp.setEnabled(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cadastrocomputadorList, jTblComp);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codComp}"));
        columnBinding.setColumnName("Cod Comp");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomeComp}"));
        columnBinding.setColumnName("Nome Comp");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${memoria}"));
        columnBinding.setColumnName("Memoria");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${hd}"));
        columnBinding.setColumnName("Hd");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${windows}"));
        columnBinding.setColumnName("Windows");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${processador}"));
        columnBinding.setColumnName("Processador");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTblComp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblCompMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblComp);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 628, 450));

        jLabel2.setText("Buscar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSairPesqCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairPesqCompActionPerformed
        jFramePesquisaComp.this.dispose();
    }//GEN-LAST:event_jBtnSairPesqCompActionPerformed

    private void jTblCompMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblCompMouseClicked

    }//GEN-LAST:event_jTblCompMouseClicked

    private void jTxtCodigoPesquisaCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigoPesquisaCompActionPerformed

    }//GEN-LAST:event_jTxtCodigoPesquisaCompActionPerformed

    private void jTxtViewPesquisaCompKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtViewPesquisaCompKeyPressed
        findcadcomp();
    }//GEN-LAST:event_jTxtViewPesquisaCompKeyPressed

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
            java.util.logging.Logger.getLogger(jFramePesquisaComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFramePesquisaComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFramePesquisaComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFramePesquisaComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFramePesquisaComp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<PktClassesCriadasAutomatico.Cadastrocomputador> cadastrocomputadorList;
    private javax.persistence.Query cadastrocomputadorQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jBtnRelatorioPesqComp;
    private javax.swing.JButton jBtnSairPesqComp;
    private javax.swing.JButton jExcluirComp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblComp;
    private javax.swing.JTextField jTxtCodigoPesquisaComp;
    private javax.swing.JTextField jTxtViewPesquisaComp;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void CodComp(String sql) {

    }
}