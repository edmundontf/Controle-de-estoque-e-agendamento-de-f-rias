/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Estoque {

    
    private int id;
    private String Nome;
    private int Quantidade;
    private String Modelo;
    private String Objeto;

    public Estoque(int id, String Nome, int Quantidade, String Modelo, String Objeto) {
        this.id = id;
        this.Nome = Nome;
        this.Quantidade = Quantidade;
        this.Modelo = Modelo;
        this.Objeto = Objeto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getObjeto() {
        return Objeto;
    }

    public void setObjeto(String Objeto) {
        this.Objeto = Objeto;
    }
    
}
