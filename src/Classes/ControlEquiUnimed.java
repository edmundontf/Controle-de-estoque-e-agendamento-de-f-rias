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
public class ControlEquiUnimed {

    
    private int CodEquip;
    private int Patrimonio;
    private String Equipamento;
    private String Modelo;
    private String Departamento;
    private String DataEnvio;
    private String DataRetorno;
    private String Selecione;
    private float Orcamento;
    private int CentroCusto;

    
    
    //----------------------------salvar objetos na tabela--------------------------------------------------
    public void Save() {
        Conexao C = new Conexao();
        Connection con = C.getCon();
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO controleequipamentounimed VALUES("
                    + this.getCodEquip()+ ","
                    + this.getPatrimonio()+ ",'"
                    + this.getEquipamento()+ "','"
                    + this.getModelo()+ "','"
                    + this.getDepartamento()+ "',"                   
                    + this.getDataEnvio()+ ","
                    + this.getDataRetorno()+ ",'"
                    + this.getSelecione()+ "','"
                    + this.getOrcamento()+ "','"                    
                    + this.getCentroCusto()+ "');");
            stmt.close();
            con.close();
        } catch (SQLException e) {
        }
    }

   
    //-------------------------------construtor da classe --------------------------------------
    
    
    
    public ControlEquiUnimed(int CodEquip, int Patrimonio, String Equipamento, String Modelo, String Departamento, String DataEnvio, String DataRetorno, String Selecione, float Orcamento, int CentroCusto) {
        this.CodEquip = CodEquip;
        this.Patrimonio = Patrimonio;
        this.Equipamento = Equipamento;
        this.Modelo = Modelo;
        this.Departamento = Departamento;
        this.DataEnvio = DataEnvio;
        this.DataRetorno = DataRetorno;
        this.Selecione = Selecione;
        this.Orcamento = Orcamento;
        this.CentroCusto = CentroCusto;
    }

    public int getCodEquip() {
        return CodEquip;
    }

    public void setCodEquip(int CodEquip) {
        this.CodEquip = CodEquip;
    }

    public int getPatrimonio() {
        return Patrimonio;
    }

    public void setPatrimonio(int Patrimonio) {
        this.Patrimonio = Patrimonio;
    }

    public String getEquipamento() {
        return Equipamento;
    }

    public void setEquipamento(String Equipamento) {
        this.Equipamento = Equipamento;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getDataEnvio() {
        return DataEnvio;
    }

    public void setDataEnvio(String DataEnvio) {
        this.DataEnvio = DataEnvio;
    }

    public String getDataRetorno() {
        return DataRetorno;
    }

    public void setDataRetorno(String DataRetorno) {
        this.DataRetorno = DataRetorno;
    }

    public String getSelecione() {
        return Selecione;
    }

    public void setSelecione(String Selecione) {
        this.Selecione = Selecione;
    }

    public float getOrcamento() {
        return Orcamento;
    }

    public void setOrcamento(float Orcamento) {
        this.Orcamento = Orcamento;
    }

    public int getCentroCusto() {
        return CentroCusto;
    }

    public void setCentroCusto(int CentroCusto) {
        this.CentroCusto = CentroCusto;
    }
    
}
