/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristiantoma.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "facturacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturacion.findAll", query = "SELECT f FROM Facturacion f")
    , @NamedQuery(name = "Facturacion.findByNumerodocumento", query = "SELECT f FROM Facturacion f WHERE f.numerodocumento = :numerodocumento")
    , @NamedQuery(name = "Facturacion.findByFechadoc", query = "SELECT f FROM Facturacion f WHERE f.fechadoc = :fechadoc")
    , @NamedQuery(name = "Facturacion.findByFechaentrega", query = "SELECT f FROM Facturacion f WHERE f.fechaentrega = :fechaentrega")})
public class Facturacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "numerodocumento")
    private Integer numerodocumento;
    @Size(max = 45)
    @Column(name = "fechadoc")
    private String fechadoc;
    @Size(max = 45)
    @Column(name = "fechaentrega")
    private String fechaentrega;
    @JoinColumn(name = "idciente", referencedColumnName = "idcliente")
    @ManyToOne(optional = false)
    private Cliente idciente;
    @JoinColumn(name = "idsucursal", referencedColumnName = "idsucursales")
    @ManyToOne(optional = false)
    private Sucursales idsucursal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numerodocumento")
    private List<Facturaciondetalle> facturaciondetalleList;

    public Facturacion() {
    }

    public Facturacion(Integer numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    public Integer getNumerodocumento() {
        return numerodocumento;
    }

    public void setNumerodocumento(Integer numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    public String getFechadoc() {
        return fechadoc;
    }

    public void setFechadoc(String fechadoc) {
        this.fechadoc = fechadoc;
    }

    public String getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(String fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public Cliente getIdciente() {
        return idciente;
    }

    public void setIdciente(Cliente idciente) {
        this.idciente = idciente;
    }

    public Sucursales getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(Sucursales idsucursal) {
        this.idsucursal = idsucursal;
    }

    @XmlTransient
    public List<Facturaciondetalle> getFacturaciondetalleList() {
        return facturaciondetalleList;
    }

    public void setFacturaciondetalleList(List<Facturaciondetalle> facturaciondetalleList) {
        this.facturaciondetalleList = facturaciondetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numerodocumento != null ? numerodocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturacion)) {
            return false;
        }
        Facturacion other = (Facturacion) object;
        if ((this.numerodocumento == null && other.numerodocumento != null) || (this.numerodocumento != null && !this.numerodocumento.equals(other.numerodocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cristiantoma.entities.Facturacion[ numerodocumento=" + numerodocumento + " ]";
    }
    
}
