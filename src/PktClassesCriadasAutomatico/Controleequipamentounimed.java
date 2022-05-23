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
// //* @author Sammy Guergachi <sguergachi at gmail.com>
 //*/
@Entity
@Table(name = "controleequipamentounimed", catalog = "manutencao", schema = "")
@NamedQueries({
    @NamedQuery(name = "Controleequipamentounimed.findAll", query = "SELECT c FROM Controleequipamentounimed c")
    , @NamedQuery(name = "Controleequipamentounimed.findByCodEquip", query = "SELECT c FROM Controleequipamentounimed c WHERE c.codEquip = :codEquip")
    , @NamedQuery(name = "Controleequipamentounimed.findByPatrimonio", query = "SELECT c FROM Controleequipamentounimed c WHERE c.patrimonio = :patrimonio")
    , @NamedQuery(name = "Controleequipamentounimed.findByEquipamento", query = "SELECT c FROM Controleequipamentounimed c WHERE c.equipamento = :equipamento")
    , @NamedQuery(name = "Controleequipamentounimed.findByModelo", query = "SELECT c FROM Controleequipamentounimed c WHERE c.modelo = :modelo")
    , @NamedQuery(name = "Controleequipamentounimed.findByDepartamento", query = "SELECT c FROM Controleequipamentounimed c WHERE c.departamento = :departamento")
    , @NamedQuery(name = "Controleequipamentounimed.findByDataEnvio", query = "SELECT c FROM Controleequipamentounimed c WHERE c.dataEnvio = :dataEnvio")
    , @NamedQuery(name = "Controleequipamentounimed.findByDataRetorno", query = "SELECT c FROM Controleequipamentounimed c WHERE c.dataRetorno = :dataRetorno")
    , @NamedQuery(name = "Controleequipamentounimed.findBySelecione", query = "SELECT c FROM Controleequipamentounimed c WHERE c.selecione = :selecione")
    , @NamedQuery(name = "Controleequipamentounimed.findByOrcamento", query = "SELECT c FROM Controleequipamentounimed c WHERE c.orcamento = :orcamento")
    , @NamedQuery(name = "Controleequipamentounimed.findByCentroCusto", query = "SELECT c FROM Controleequipamentounimed c WHERE c.centroCusto = :centroCusto")})
public class Controleequipamentounimed implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CodEquip")
    private Integer codEquip;
    @Column(name = "Patrimonio")
    private Integer patrimonio;
    @Column(name = "Equipamento")
    private String equipamento;
    @Column(name = "Modelo")
    private String modelo;
    @Column(name = "Departamento")
    private String departamento;
    @Column(name = "DataEnvio")
    @Temporal(TemporalType.DATE)
    private Date dataEnvio;
    @Column(name = "DataRetorno")
    @Temporal(TemporalType.DATE)
    private Date dataRetorno;
    @Column(name = "Selecione")
    private String selecione;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "orcamento")
    private Double orcamento;
    @Column(name = "CentroCusto")
    private Integer centroCusto;

    public Controleequipamentounimed() {
    }

    public Controleequipamentounimed(Integer codEquip) {
        this.codEquip = codEquip;
    }

    public Integer getCodEquip() {
        return codEquip;
    }

    public void setCodEquip(Integer codEquip) {
        Integer oldCodEquip = this.codEquip;
        this.codEquip = codEquip;
        changeSupport.firePropertyChange("codEquip", oldCodEquip, codEquip);
    }

    public Integer getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Integer patrimonio) {
        Integer oldPatrimonio = this.patrimonio;
        this.patrimonio = patrimonio;
        changeSupport.firePropertyChange("patrimonio", oldPatrimonio, patrimonio);
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        String oldEquipamento = this.equipamento;
        this.equipamento = equipamento;
        changeSupport.firePropertyChange("equipamento", oldEquipamento, equipamento);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        String oldModelo = this.modelo;
        this.modelo = modelo;
        changeSupport.firePropertyChange("modelo", oldModelo, modelo);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        String oldDepartamento = this.departamento;
        this.departamento = departamento;
        changeSupport.firePropertyChange("departamento", oldDepartamento, departamento);
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        Date oldDataEnvio = this.dataEnvio;
        this.dataEnvio = dataEnvio;
        changeSupport.firePropertyChange("dataEnvio", oldDataEnvio, dataEnvio);
    }

    public Date getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Date dataRetorno) {
        Date oldDataRetorno = this.dataRetorno;
        this.dataRetorno = dataRetorno;
        changeSupport.firePropertyChange("dataRetorno", oldDataRetorno, dataRetorno);
    }

    public String getSelecione() {
        return selecione;
    }

    public void setSelecione(String selecione) {
        String oldSelecione = this.selecione;
        this.selecione = selecione;
        changeSupport.firePropertyChange("selecione", oldSelecione, selecione);
    }

    public Double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Double orcamento) {
        Double oldOrcamento = this.orcamento;
        this.orcamento = orcamento;
        changeSupport.firePropertyChange("orcamento", oldOrcamento, orcamento);
    }

    public Integer getCentroCusto() {
        return centroCusto;
    }

    public void setCentroCusto(Integer centroCusto) {
        Integer oldCentroCusto = this.centroCusto;
        this.centroCusto = centroCusto;
        changeSupport.firePropertyChange("centroCusto", oldCentroCusto, centroCusto);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEquip != null ? codEquip.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Controleequipamentounimed)) {
            return false;
        }
        Controleequipamentounimed other = (Controleequipamentounimed) object;
        if ((this.codEquip == null && other.codEquip != null) || (this.codEquip != null && !this.codEquip.equals(other.codEquip))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PacoteForms.Controleequipamentounimed[ codEquip=" + codEquip + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
