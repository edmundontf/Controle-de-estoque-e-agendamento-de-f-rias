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

///**
//*
//*/ @author Edmundo Faria de Oliveira Neto <netofaria18@gmail.com>
//*/
public class caduser {

    private int CodUser;
    private String NomeFunc;
    private String Funcao;
    private String Departamento;

    //----------------------------salvar objeto na tabela--------------------------------------------------
    public void Save() {
        Conexao C = new Conexao();
        Connection con = C.getCon();
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO cadastrofuncionario VALUES("
                    + this.getCodUser() + ",'"
                    + this.getNomeFunc() + "','"
                    + this.getFuncao() + "','"
                    + this.getDepartamento() + "');");
            stmt.close();
            con.close();
        } catch (SQLException e) {
        }
    }

    public caduser(int CodUser, String NomeFunc, String Funcao, String Departamento) {
        this.CodUser = CodUser;
        this.NomeFunc = NomeFunc;
        this.Funcao = Funcao;
        this.Departamento = Departamento;
    }

    public int getCodUser() {
        return CodUser;
    }

    public void setCodUser(int CodUser) {
        this.CodUser = CodUser;
    }

    public String getNomeFunc() {
        return NomeFunc;
    }

    public void setNomeFunc(String NomeFunc) {
        this.NomeFunc = NomeFunc;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

}
