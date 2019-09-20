package com.cristiantoma.entities;

import com.cristiantoma.entities.Cliente;
import com.cristiantoma.entities.Cotizaciones;
import com.cristiantoma.entities.Sucursales;
import com.cristiantoma.entities.Tipoevento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-20T14:41:42")
@StaticMetamodel(Reservacion.class)
public class Reservacion_ { 

    public static volatile SingularAttribute<Reservacion, Date> fechaInicial;
    public static volatile SingularAttribute<Reservacion, Sucursales> idsucursal;
    public static volatile ListAttribute<Reservacion, Cotizaciones> cotizacionesList;
    public static volatile SingularAttribute<Reservacion, Integer> idreservacion;
    public static volatile SingularAttribute<Reservacion, Date> fechafinal;
    public static volatile SingularAttribute<Reservacion, Cliente> idcliente;
    public static volatile SingularAttribute<Reservacion, Tipoevento> idtipoevento;

}