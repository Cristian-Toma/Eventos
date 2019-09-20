/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristiantoma.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "cotizaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cotizaciones.findAll", query = "SELECT c FROM Cotizaciones c")
    , @NamedQuery(name = "Cotizaciones.findByIdcotizaciones", query = "SELECT c FROM Cotizaciones c WHERE c.idcotizaciones = :idcotizaciones")
    , @NamedQuery(name = "Cotizaciones.findByNombreafacturar", query = "SELECT c FROM Cotizaciones c WHERE c.nombreafacturar = :nombreafacturar")
    , @NamedQuery(name = "Cotizaciones.findByDireccionafacturar", query = "SELECT c FROM Cotizaciones c WHERE c.direccionafacturar = :direccionafacturar")
    , @NamedQuery(name = "Cotizaciones.findByFecha", query = "SELECT c FROM Cotizaciones c WHERE c.fecha = :fecha")})
public class Cotizaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcotizaciones")
    private Integer idcotizaciones;
    @Size(max = 45)
    @Column(name = "nombreafacturar")
    private String nombreafacturar;
    @Size(max = 45)
    @Column(name = "direccionafacturar")
    private String direccionafacturar;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcotizacion")
    private List<Cotizaciondetalle> cotizaciondetalleList;
    @JoinColumn(name = "idreservacion", referencedColumnName = "idreservacion")
    @ManyToOne(optional = false)
    private Reservacion idreservacion;

    public Cotizaciones() {
    }

    public Cotizaciones(Integer idcotizaciones) {
        this.idcotizaciones = idcotizaciones;
    }

    public Integer getIdcotizaciones() {
        return idcotizaciones;
    }

    public void setIdcotizaciones(Integer idcotizaciones) {
        this.idcotizaciones = idcotizaciones;
    }

    public String getNombreafacturar() {
        return nombreafacturar;
    }

    public void setNombreafacturar(String nombreafacturar) {
        this.nombreafacturar = nombreafacturar;
    }

    public String getDireccionafacturar() {
        return direccionafacturar;
    }

    public void setDireccionafacturar(String direccionafacturar) {
        this.direccionafacturar = direccionafacturar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public List<Cotizaciondetalle> getCotizaciondetalleList() {
        return cotizaciondetalleList;
    }

    public void setCotizaciondetalleList(List<Cotizaciondetalle> cotizaciondetalleList) {
        this.cotizaciondetalleList = cotizaciondetalleList;
    }

    public Reservacion getIdreservacion() {
        return idreservacion;
    }

    public void setIdreservacion(Reservacion idreservacion) {
        this.idreservacion = idreservacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcotizaciones != null ? idcotizaciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotizaciones)) {
            return false;
        }
        Cotizaciones other = (Cotizaciones) object;
        if ((this.idcotizaciones == null && other.idcotizaciones != null) || (this.idcotizaciones != null && !this.idcotizaciones.equals(other.idcotizaciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cristiantoma.entities.Cotizaciones[ idcotizaciones=" + idcotizaciones + " ]";
    }
    
}
