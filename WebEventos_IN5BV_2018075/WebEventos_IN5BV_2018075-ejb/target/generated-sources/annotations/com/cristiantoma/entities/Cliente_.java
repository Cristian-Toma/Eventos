package com.cristiantoma.entities;

import com.cristiantoma.entities.Facturacion;
import com.cristiantoma.entities.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-20T14:41:42")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> apellido;
    public static volatile SingularAttribute<Cliente, String> nit;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile ListAttribute<Cliente, Facturacion> facturacionList;
    public static volatile SingularAttribute<Cliente, Integer> idcliente;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile ListAttribute<Cliente, Reservacion> reservacionList;

}