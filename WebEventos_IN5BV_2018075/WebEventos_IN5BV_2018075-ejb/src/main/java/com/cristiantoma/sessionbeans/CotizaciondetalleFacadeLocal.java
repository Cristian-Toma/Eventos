/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristiantoma.sessionbeans;

import com.cristiantoma.entities.Cotizaciondetalle;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crist
 */
@Local
public interface CotizaciondetalleFacadeLocal {

    void create(Cotizaciondetalle cotizaciondetalle);

    void edit(Cotizaciondetalle cotizaciondetalle);

    void remove(Cotizaciondetalle cotizaciondetalle);

    Cotizaciondetalle find(Object id);

    List<Cotizaciondetalle> findAll();

    List<Cotizaciondetalle> findRange(int[] range);

    int count();
    
}
