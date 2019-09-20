package com.cristiantoma.entities;

import com.cristiantoma.entities.Cotizaciondetalle;
import com.cristiantoma.entities.Facturaciondetalle;
import com.cristiantoma.entities.Tipoproducto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-20T14:41:42")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Double> descripcion;
    public static volatile ListAttribute<Producto, Facturaciondetalle> facturaciondetalleList;
    public static volatile SingularAttribute<Producto, Tipoproducto> idtipoproductos;
    public static volatile ListAttribute<Producto, Cotizaciondetalle> cotizaciondetalleList;
    public static volatile SingularAttribute<Producto, Double> precioventa;
    public static volatile SingularAttribute<Producto, Integer> idproducto;

}