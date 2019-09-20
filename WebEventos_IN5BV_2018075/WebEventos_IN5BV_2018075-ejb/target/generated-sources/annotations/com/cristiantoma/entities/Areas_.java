package com.cristiantoma.entities;

import com.cristiantoma.entities.Sucursales;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-20T14:41:42")
@StaticMetamodel(Areas.class)
public class Areas_ { 

    public static volatile SingularAttribute<Areas, Integer> idareas;
    public static volatile SingularAttribute<Areas, String> nombre;
    public static volatile ListAttribute<Areas, Sucursales> sucursalesList;

}