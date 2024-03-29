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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
    , @NamedQuery(name = "Producto.findByIdproducto", query = "SELECT p FROM Producto p WHERE p.idproducto = :idproducto")
    , @NamedQuery(name = "Producto.findByDescripcion", query = "SELECT p FROM Producto p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Producto.findByPrecioventa", query = "SELECT p FROM Producto p WHERE p.precioventa = :precioventa")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idproducto")
    private Integer idproducto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "descripcion")
    private Double descripcion;
    @Column(name = "precioventa")
    private Double precioventa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idproducto")
    private List<Cotizaciondetalle> cotizaciondetalleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idproducto")
    private List<Facturaciondetalle> facturaciondetalleList;
    @JoinColumn(name = "idtipoproductos", referencedColumnName = "idtipoproducto")
    @ManyToOne(optional = false)
    private Tipoproducto idtipoproductos;

    public Producto() {
    }

    public Producto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public Double getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Double descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(Double precioventa) {
        this.precioventa = precioventa;
    }

    @XmlTransient
    public List<Cotizaciondetalle> getCotizaciondetalleList() {
        return cotizaciondetalleList;
    }

    public void setCotizaciondetalleList(List<Cotizaciondetalle> cotizaciondetalleList) {
        this.cotizaciondetalleList = cotizaciondetalleList;
    }

    @XmlTransient
    public List<Facturaciondetalle> getFacturaciondetalleList() {
        return facturaciondetalleList;
    }

    public void setFacturaciondetalleList(List<Facturaciondetalle> facturaciondetalleList) {
        this.facturaciondetalleList = facturaciondetalleList;
    }

    public Tipoproducto getIdtipoproductos() {
        return idtipoproductos;
    }

    public void setIdtipoproductos(Tipoproducto idtipoproductos) {
        this.idtipoproductos = idtipoproductos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproducto != null ? idproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idproducto == null && other.idproducto != null) || (this.idproducto != null && !this.idproducto.equals(other.idproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cristiantoma.entities.Producto[ idproducto=" + idproducto + " ]";
    }
    
}
