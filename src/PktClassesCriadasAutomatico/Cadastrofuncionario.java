/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PktClassesCriadasAutomatico;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

//**
 //* 
// * @author Sammy Guergachi <sguergachi at gmail.com>
// */
@Entity
@Table(name = "cadastrofuncionario", catalog = "manutencao", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cadastrofuncionario.findAll", query = "SELECT c FROM Cadastrofuncionario c")
    , @NamedQuery(name = "Cadastrofuncionario.findByCodUser", query = "SELECT c FROM Cadastrofuncionario c WHERE c.codUser = :codUser")
    , @NamedQuery(name = "Cadastrofuncionario.findByNomeFunc", query = "SELECT c FROM Cadastrofuncionario c WHERE c.nomeFunc = :nomeFunc")
    , @NamedQuery(name = "Cadastrofuncionario.findByFuncao", query = "SELECT c FROM Cadastrofuncionario c WHERE c.funcao = :funcao")
    , @NamedQuery(name = "Cadastrofuncionario.findByDepartamento", query = "SELECT c FROM Cadastrofuncionario c WHERE c.departamento = :departamento")})
public class Cadastrofuncionario implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CodUser")
    private Integer codUser;
    @Column(name = "NomeFunc")
    private String nomeFunc;
    @Column(name = "Funcao")
    private String funcao;
    @Column(name = "Departamento")
    private String departamento;

    public Cadastrofuncionario() {
    }

    public Cadastrofuncionario(Integer codUser) {
        this.codUser = codUser;
    }

    public Integer getCodUser() {
        return codUser;
    }

    public void setCodUser(Integer codUser) {
        Integer oldCodUser = this.codUser;
        this.codUser = codUser;
        changeSupport.firePropertyChange("codUser", oldCodUser, codUser);
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        String oldNomeFunc = this.nomeFunc;
        this.nomeFunc = nomeFunc;
        changeSupport.firePropertyChange("nomeFunc", oldNomeFunc, nomeFunc);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        String oldFuncao = this.funcao;
        this.funcao = funcao;
        changeSupport.firePropertyChange("funcao", oldFuncao, funcao);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        String oldDepartamento = this.departamento;
        this.departamento = departamento;
        changeSupport.firePropertyChange("departamento", oldDepartamento, departamento);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUser != null ? codUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadastrofuncionario)) {
            return false;
        }
        Cadastrofuncionario other = (Cadastrofuncionario) object;
        if ((this.codUser == null && other.codUser != null) || (this.codUser != null && !this.codUser.equals(other.codUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PacoteForms.Cadastrofuncionario[ codUser=" + codUser + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
