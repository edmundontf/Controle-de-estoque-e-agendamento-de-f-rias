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
 //*// 
 //* @author Sammy Guergachi <sguergachi at gmail.com>
 //*/
@Entity
@Table(name = "cadastrocomputador", catalog = "manutencao", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cadastrocomputador.findAll", query = "SELECT c FROM Cadastrocomputador c")
    , @NamedQuery(name = "Cadastrocomputador.findByCodComp", query = "SELECT c FROM Cadastrocomputador c WHERE c.codComp = :codComp")
    , @NamedQuery(name = "Cadastrocomputador.findByNomeComp", query = "SELECT c FROM Cadastrocomputador c WHERE c.nomeComp = :nomeComp")
    , @NamedQuery(name = "Cadastrocomputador.findByMemoria", query = "SELECT c FROM Cadastrocomputador c WHERE c.memoria = :memoria")
    , @NamedQuery(name = "Cadastrocomputador.findByHd", query = "SELECT c FROM Cadastrocomputador c WHERE c.hd = :hd")
    , @NamedQuery(name = "Cadastrocomputador.findByWindows", query = "SELECT c FROM Cadastrocomputador c WHERE c.windows = :windows")
    , @NamedQuery(name = "Cadastrocomputador.findByProcessador", query = "SELECT c FROM Cadastrocomputador c WHERE c.processador = :processador")})
public class Cadastrocomputador implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CodComp")
    private Integer codComp;
    @Column(name = "NomeComp")
    private String nomeComp;
    @Column(name = "Memoria")
    private Integer memoria;
    @Column(name = "HD")
    private Integer hd;
    @Column(name = "Windows")
    private String windows;
    @Column(name = "Processador")
    private String processador;

    public Cadastrocomputador() {
    }

    public Cadastrocomputador(Integer codComp) {
        this.codComp = codComp;
    }

    public Integer getCodComp() {
        return codComp;
    }

    public void setCodComp(Integer codComp) {
        Integer oldCodComp = this.codComp;
        this.codComp = codComp;
        changeSupport.firePropertyChange("codComp", oldCodComp, codComp);
    }

    public String getNomeComp() {
        return nomeComp;
    }

    public void setNomeComp(String nomeComp) {
        String oldNomeComp = this.nomeComp;
        this.nomeComp = nomeComp;
        changeSupport.firePropertyChange("nomeComp", oldNomeComp, nomeComp);
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        Integer oldMemoria = this.memoria;
        this.memoria = memoria;
        changeSupport.firePropertyChange("memoria", oldMemoria, memoria);
    }

    public Integer getHd() {
        return hd;
    }

    public void setHd(Integer hd) {
        Integer oldHd = this.hd;
        this.hd = hd;
        changeSupport.firePropertyChange("hd", oldHd, hd);
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        String oldWindows = this.windows;
        this.windows = windows;
        changeSupport.firePropertyChange("windows", oldWindows, windows);
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        String oldProcessador = this.processador;
        this.processador = processador;
        changeSupport.firePropertyChange("processador", oldProcessador, processador);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codComp != null ? codComp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadastrocomputador)) {
            return false;
        }
        Cadastrocomputador other = (Cadastrocomputador) object;
        if ((this.codComp == null && other.codComp != null) || (this.codComp != null && !this.codComp.equals(other.codComp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PacoteForms.Cadastrocomputador[ codComp=" + codComp + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
