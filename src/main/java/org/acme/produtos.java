package org.acme;

import java.util.List;
import javax.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class produtos extends PanacheEntity{

        
    public static List<produtos> list;
      
    public String DESCRICAO;
    public float VALOR;   
    }