/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PktClassesCriadasAutomatico;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

//**
 //* 
 //* @author Sammy Guergachi <sguergachi at gmail.com>
// */
@Entity
@Table(name = "mpreventiva", catalog = "manutencao", schema = "")
@NamedQueries({
    @NamedQuery(name = "Mpreventiva.findAll", query = "SELECT m FROM Mpreventiva m")
    , @NamedQuery(name = "Mpreventiva.findByCodigo", query = "SELECT m FROM Mpreventiva m WHERE m.codigo = :codigo")
    , @NamedQuery(name = "Mpreventiva.findByFuncionario", query = "SELECT m FROM Mpreventiva m WHERE m.funcionario = :funcionario")
    , @NamedQuery(name = "Mpreventiva.findByDepartamento", query = "SELECT m FROM Mpreventiva m WHERE m.departamento = :departamento")
    , @NamedQuery(name = "Mpreventiva.findByDataFerias", query = "SELECT m FROM Mpreventiva m WHERE m.dataFerias = :dataFerias")
    , @NamedQuery(name = "Mpreventiva.findByDataVolta", query = "SELECT m FROM Mpreventiva m WHERE m.dataVolta = :dataVolta")
    , @NamedQuery(name = "Mpreventiva.findBySelecionaStatus", query = "SELECT m FROM Mpreventiva m WHERE m.selecionaStatus = :selecionaStatus")
    , @NamedQuery(name = "Mpreventiva.findBySelecionaMes", query = "SELECT m FROM Mpreventiva m WHERE m.selecionaMes = :selecionaMes")
    , @NamedQuery(name = "Mpreventiva.findBySelecionaAno", query = "SELECT m FROM Mpreventiva m WHERE m.selecionaAno = :selecionaAno")})
public class Mpreventiva implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Codigo")
    private Integer codigo;
    @Column(name = "Funcionario")
    private String funcionario;
    @Column(name = "Departamento")
    private String departamento;
    @Column(name = "DataFerias")
    @Temporal(TemporalType.DATE)
    private Date dataFerias;
    @Column(name = "DataVolta")
    @Temporal(TemporalType.DATE)
    private Date dataVolta;
    @Column(name = "SelecionaStatus")
    private String selecionaStatus;
    @Column(name = "SelecionaMes")
    private String selecionaMes;
    @Column(name = "SelecionaAno")
    private String selecionaAno;

    public Mpreventiva() {
    }

    public Mpreventiva(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        String oldFuncionario = this.funcionario;
        this.funcionario = funcionario;
        changeSupport.firePropertyChange("funcionario", oldFuncionario, funcionario);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        String oldDepartamento = this.departamento;
        this.departamento = departamento;
        changeSupport.firePropertyChange("departamento", oldDepartamento, departamento);
    }

    public Date getDataFerias() {
        return dataFerias;
    }

    public void setDataFerias(Date dataFerias) {
        Date oldDataFerias = this.dataFerias;
        this.dataFerias = dataFerias;
        changeSupport.firePropertyChange("dataFerias", oldDataFerias, dataFerias);
    }

    public Date getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(Date dataVolta) {
        Date oldDataVolta = this.dataVolta;
        this.dataVolta = dataVolta;
        changeSupport.firePropertyChange("dataVolta", oldDataVolta, dataVolta);
    }

    public String getSelecionaStatus() {
        return selecionaStatus;
    }

    public void setSelecionaStatus(String selecionaStatus) {
        String oldSelecionaStatus = this.selecionaStatus;
        this.selecionaStatus = selecionaStatus;
        changeSupport.firePropertyChange("selecionaStatus", oldSelecionaStatus, selecionaStatus);
    }

    public String getSelecionaMes() {
        return selecionaMes;
    }

    public void setSelecionaMes(String selecionaMes) {
        String oldSelecionaMes = this.selecionaMes;
        this.selecionaMes = selecionaMes;
        changeSupport.firePropertyChange("selecionaMes", oldSelecionaMes, selecionaMes);
    }

    public String getSelecionaAno() {
        return selecionaAno;
    }

    public void setSelecionaAno(String selecionaAno) {
        String oldSelecionaAno = this.selecionaAno;
        this.selecionaAno = selecionaAno;
        changeSupport.firePropertyChange("selecionaAno", oldSelecionaAno, selecionaAno);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mpreventiva)) {
            return false;
        }
        Mpreventiva other = (Mpreventiva) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PacoteForms.Mpreventiva[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
