/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import conec.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

///**
// *
// * @author Edmundo Faria de Oliveira Neto <netofaria18@gmail.com>
// */
public class CadManutencao {

    private int codigo;
    private String Funcionario;
    private String Departamento;
    private String dataFerias;
    private String dataVolta;
    private String SelecionaStatus;
    private String SelecionaMes;
    private String SelecionaAno;

    //----------------------------salvar objetos na tabela--------------------------------------------------
    public void Save() {
        Conexao C = new Conexao();
        Connection con = C.getCon();
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO mpreventiva VALUES("
                    + this.getCodigo() + ",'"
                    + this.getFuncionario() + "','"
                    + this.getDepartamento() + "','"
                    + this.getDataFerias() + "','"
                    + this.getDataVolta() + "','"
                    + this.getSelecionaStatus() + "','"
                    + this.getSelecionaMes() + "','"
                    + this.getSelecionaAno() + "');");
            stmt.close();
            con.close();
        } catch (SQLException e) {
        }
    }

    //-------------------------------recuperar objetos ----------------------
    public CadManutencao(int codigo) throws SQLException {
        Conexao C = new Conexao();
        Connection con = C.getCon();
        Statement stmt = null;
        ResultSet rs = null;

        try {  // recuperar objeto da tabela
            stmt = con.createStatement();
            rs = stmt.executeQuery("Select * from mpreventiva where Codigo=" + codigo);
            while (rs.next()) {
                this.codigo = Integer.parseInt(rs.getString(1));
                this.Funcionario = rs.getString(2);
                this.Departamento = rs.getString(3);
                this.dataFerias = rs.getString(4);
                this.dataVolta = rs.getString(5);
                this.SelecionaStatus = rs.getString(6);
                this.SelecionaMes = rs.getString(7);
                this.SelecionaAno = rs.getString(8);

            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //------------------ UPDATE 
    public void Update(CadManutencao M) throws SQLException {
        Conexao C = new Conexao();
        Connection con = C.getCon();
        ResultSet rs = null;
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO mpreventiva (codigo,Funcionario,Departamento,DataFerias,DataVolta,SelecionaStatus,SelecionaMes,SelecionaAno)VALUES(?,?,?,?,?,?,?,?)");
            stmt.setInt(1, M.getCodigo());
            stmt.setString(2, M.getFuncionario());
            stmt.setString(3, M.getDepartamento());
            stmt.setString(4, M.getDataFerias());
            stmt.setString(5, M.getDataVolta());
            stmt.setString(6, M.getSelecionaStatus());
            stmt.setString(7, M.getSelecionaMes());
            stmt.setString(8, M.getSelecionaAno());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            stmt.close();
            con.close();
        }

    }

    //-----------------------
    public CadManutencao(int codigo, String Funcionario, String Departamento, String dataFerias, String dataVolta, String SelecionaStatus, String SelecionaMes, String SelecionaAno) {
        this.codigo = codigo;
        this.Funcionario = Funcionario;
        this.Departamento = Departamento;
        this.dataFerias = dataFerias;
        this.dataVolta = dataVolta;
        this.SelecionaStatus = SelecionaStatus;
        this.SelecionaMes = SelecionaMes;
        this.SelecionaAno = SelecionaAno;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(String Funcionario) {
        this.Funcionario = Funcionario;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getDataFerias() {
        return dataFerias;
    }

    public void setDataFerias(String dataFerias) {
        this.dataFerias = dataFerias;
    }

    public String getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(String dataVolta) {
        this.dataVolta = dataVolta;
    }

    public String getSelecionaStatus() {
        return SelecionaStatus;
    }

    public void setSelecionaStatus(String SelecionaStatus) {
        this.SelecionaStatus = SelecionaStatus;
    }

    public String getSelecionaMes() {
        return SelecionaMes;
    }

    public void setSelecionaMes(String SelecionaMes) {
        this.SelecionaMes = SelecionaMes;
    }

    public String getSelecionaAno() {
        return SelecionaAno;
    }

    public void setSelecionaAno(String SelecionaAno) {
        this.SelecionaAno = SelecionaAno;
    }
}
