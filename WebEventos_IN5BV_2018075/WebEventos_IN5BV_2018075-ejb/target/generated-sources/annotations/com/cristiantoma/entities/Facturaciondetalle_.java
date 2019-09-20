package com.cristiantoma.entities;

import com.cristiantoma.entities.Facturacion;
import com.cristiantoma.entities.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-20T14:41:42")
@StaticMetamodel(Facturaciondetalle.class)
public class Facturaciondetalle_ { 

    public static volatile SingularAttribute<Facturaciondetalle, Integer> idfacturacion;
    public static volatile SingularAttribute<Facturaciondetalle, Facturacion> numerodocumento;
    public static volatile SingularAttribute<Facturaciondetalle, Producto> idproducto;

}