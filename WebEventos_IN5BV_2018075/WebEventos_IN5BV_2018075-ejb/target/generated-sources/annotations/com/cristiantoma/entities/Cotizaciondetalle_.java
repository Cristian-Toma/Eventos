package com.cristiantoma.entities;

import com.cristiantoma.entities.Cotizaciones;
import com.cristiantoma.entities.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-20T14:41:42")
@StaticMetamodel(Cotizaciondetalle.class)
public class Cotizaciondetalle_ { 

    public static volatile SingularAttribute<Cotizaciondetalle, Integer> idcotizaciondetalle;
    public static volatile SingularAttribute<Cotizaciondetalle, Cotizaciones> idcotizacion;
    public static volatile SingularAttribute<Cotizaciondetalle, Double> precantidad;
    public static volatile SingularAttribute<Cotizaciondetalle, Producto> idproducto;

}