package org.acme.entity;

import java.util.List;
import javax.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Produtos extends PanacheEntity{

    public int ID;
    public String DESCRICAO;
    public int VALOR;  


    public static List<Produtos> findByName(String DESCRICAO){
        return find("descricao", DESCRICAO).list();
    }
    
}