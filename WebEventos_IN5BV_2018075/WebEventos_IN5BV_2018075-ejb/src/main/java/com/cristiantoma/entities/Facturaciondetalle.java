/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristiantoma.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "facturaciondetalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturaciondetalle.findAll", query = "SELECT f FROM Facturaciondetalle f")
    , @NamedQuery(name = "Facturaciondetalle.findByIdfacturacion", query = "SELECT f FROM Facturaciondetalle f WHERE f.idfacturacion = :idfacturacion")})
public class Facturaciondetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfacturacion")
    private Integer idfacturacion;
    @JoinColumn(name = "idproducto", referencedColumnName = "idproducto")
    @ManyToOne(optional = false)
    private Producto idproducto;
    @JoinColumn(name = "numerodocumento", referencedColumnName = "numerodocumento")
    @ManyToOne(optional = false)
    private Facturacion numerodocumento;

    public Facturaciondetalle() {
    }

    public Facturaciondetalle(Integer idfacturacion) {
        this.idfacturacion = idfacturacion;
    }

    public Integer getIdfacturacion() {
        return idfacturacion;
    }

    public void setIdfacturacion(Integer idfacturacion) {
        this.idfacturacion = idfacturacion;
    }

    public Producto getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Producto idproducto) {
        this.idproducto = idproducto;
    }

    public Facturacion getNumerodocumento() {
        return numerodocumento;
    }

    public void setNumerodocumento(Facturacion numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfacturacion != null ? idfacturacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturaciondetalle)) {
            return false;
        }
        Facturaciondetalle other = (Facturaciondetalle) object;
        if ((this.idfacturacion == null && other.idfacturacion != null) || (this.idfacturacion != null && !this.idfacturacion.equals(other.idfacturacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cristiantoma.entities.Facturaciondetalle[ idfacturacion=" + idfacturacion + " ]";
    }
    
}
