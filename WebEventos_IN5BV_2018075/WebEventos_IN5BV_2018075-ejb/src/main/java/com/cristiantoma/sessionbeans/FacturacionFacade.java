/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristiantoma.sessionbeans;

import com.cristiantoma.entities.Facturacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author crist
 */
@Stateless
public class FacturacionFacade extends AbstractFacade<Facturacion> implements FacturacionFacadeLocal {

    @PersistenceContext(unitName = "com.cristiantoma_WebEventos_IN5BV_2018075-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FacturacionFacade() {
        super(Facturacion.class);
    }
    
}
