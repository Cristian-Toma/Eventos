package com.cristiantoma.entities;

import com.cristiantoma.entities.Cliente;
import com.cristiantoma.entities.Facturaciondetalle;
import com.cristiantoma.entities.Sucursales;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-20T14:41:42")
@StaticMetamodel(Facturacion.class)
public class Facturacion_ { 

    public static volatile ListAttribute<Facturacion, Facturaciondetalle> facturaciondetalleList;
    public static volatile SingularAttribute<Facturacion, String> fechaentrega;
    public static volatile SingularAttribute<Facturacion, Integer> numerodocumento;
    public static volatile SingularAttribute<Facturacion, Cliente> idciente;
    public static volatile SingularAttribute<Facturacion, Sucursales> idsucursal;
    public static volatile SingularAttribute<Facturacion, String> fechadoc;

}