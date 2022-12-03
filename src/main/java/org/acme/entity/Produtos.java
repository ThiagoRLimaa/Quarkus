package org.acme.entity;

import java.util.List;
import javax.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Produtos extends PanacheEntity{

  
    public String descricao;
    public int valor;  


    public static List<Produtos> findByName(int id){
        return find("id", id).list();
    }
    
}