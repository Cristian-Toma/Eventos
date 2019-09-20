package com.cristiantoma.entities;

import com.cristiantoma.entities.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-20T14:41:42")
@StaticMetamodel(Tipoevento.class)
public class Tipoevento_ { 

    public static volatile SingularAttribute<Tipoevento, String> descripcion;
    public static volatile SingularAttribute<Tipoevento, String> casamiento;
    public static volatile SingularAttribute<Tipoevento, String> brunch;
    public static volatile ListAttribute<Tipoevento, Reservacion> reservacionList;
    public static volatile SingularAttribute<Tipoevento, Integer> idtipoevento;
    public static volatile SingularAttribute<Tipoevento, String> cumpleanios;

}