package com.cristiantoma.entities;

import com.cristiantoma.entities.Cotizaciondetalle;
import com.cristiantoma.entities.Reservacion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-20T14:41:42")
@StaticMetamodel(Cotizaciones.class)
public class Cotizaciones_ { 

    public static volatile SingularAttribute<Cotizaciones, Date> fecha;
    public static volatile SingularAttribute<Cotizaciones, Integer> idcotizaciones;
    public static volatile SingularAttribute<Cotizaciones, String> direccionafacturar;
    public static volatile SingularAttribute<Cotizaciones, String> nombreafacturar;
    public static volatile ListAttribute<Cotizaciones, Cotizaciondetalle> cotizaciondetalleList;
    public static volatile SingularAttribute<Cotizaciones, Reservacion> idreservacion;

}