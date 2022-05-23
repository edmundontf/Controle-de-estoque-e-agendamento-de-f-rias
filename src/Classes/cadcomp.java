/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import conec.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//**
 //*
 //* @author Edmundo Faria de Oliveira Neto <netofaria18@gmail.com>
 //*/
public class cadcomp {

    private int CodComp;
    private String NomeComp;
    private int Memoria;
    private int HD;
    private String Windows;
    private String Processador;

    //----------------------------salvar objetos na tabela--------------------------------------------------
    public void Save() {
        Conexao C = new Conexao();
        Connection con = C.getCon();
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO cadastrocomputador VALUES("
                    + this.getCodComp() + ",'"
                    + this.getNomeComp() + "',"
                    + this.getMemoria() + ","
                    + this.getHD() + ",'"
                    + this.getWindows() + "','"
                    + this.getProcessador() + "');");
            stmt.close();
            con.close();
        } catch (SQLException e) {
        }
        
    }

   
    //-------------------------------construtor da classe --------------------------------------
    public cadcomp(int CodComp,String NomeComp, int Memoria, int HD, String Windows, String Processador) {
        this.CodComp = CodComp;
        this.NomeComp = NomeComp;
        this.Memoria = Memoria;
        this.HD = HD;
        this.Windows = Windows;
        this.Processador = Processador;
    }

    public int getCodComp() {
        return CodComp;
    }

    public void setCodComp(int CodComp) {
        this.CodComp = CodComp;
    }

    public String getNomeComp() {
        return NomeComp;
    }

    public void setNomeComp(String NomeComp) {
        this.NomeComp = NomeComp;
    }

    public int getMemoria() {
        return Memoria;
    }

    public void setMemoria(int Memoria) {
        this.Memoria = Memoria;
    }

    public int getHD() {
        return HD;
    }

    public void setHD(int HD) {
        this.HD = HD;
    }

    public String getWindows() {
        return Windows;
    }

    public void setWindows(String Windows) {
        this.Windows = Windows;
    }

    public String getProcessador() {
        return Processador;
    }

    public void setProcessador(String Processador) {
        this.Processador = Processador;

    }
}
