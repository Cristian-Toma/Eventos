/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristiantoma.sessionbeans;

import com.cristiantoma.entities.Facturaciondetalle;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crist
 */
@Local
public interface FacturaciondetalleFacadeLocal {

    void create(Facturaciondetalle facturaciondetalle);

    void edit(Facturaciondetalle facturaciondetalle);

    void remove(Facturaciondetalle facturaciondetalle);

    Facturaciondetalle find(Object id);

    List<Facturaciondetalle> findAll();

    List<Facturaciondetalle> findRange(int[] range);

    int count();
    
}
