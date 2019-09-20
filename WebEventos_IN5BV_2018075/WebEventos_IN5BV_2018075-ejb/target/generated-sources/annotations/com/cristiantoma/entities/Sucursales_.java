package com.cristiantoma.entities;

import com.cristiantoma.entities.Areas;
import com.cristiantoma.entities.Facturacion;
import com.cristiantoma.entities.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-20T14:41:42")
@StaticMetamodel(Sucursales.class)
public class Sucursales_ { 

    public static volatile SingularAttribute<Sucursales, Areas> idarea;
    public static volatile SingularAttribute<Sucursales, Integer> idsucursales;
    public static volatile SingularAttribute<Sucursales, String> direccion;
    public static volatile SingularAttribute<Sucursales, String> telefono;
    public static volatile ListAttribute<Sucursales, Facturacion> facturacionList;
    public static volatile SingularAttribute<Sucursales, String> nombre;
    public static volatile ListAttribute<Sucursales, Reservacion> reservacionList;

}