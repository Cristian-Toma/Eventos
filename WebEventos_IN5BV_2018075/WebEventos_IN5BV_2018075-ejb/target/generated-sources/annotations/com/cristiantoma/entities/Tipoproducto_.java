package com.cristiantoma.entities;

import com.cristiantoma.entities.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-20T14:41:42")
@StaticMetamodel(Tipoproducto.class)
public class Tipoproducto_ { 

    public static volatile SingularAttribute<Tipoproducto, String> descripcion;
    public static volatile SingularAttribute<Tipoproducto, Integer> idtipoproducto;
    public static volatile ListAttribute<Tipoproducto, Producto> productoList;

}