package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.acme.produtos;
import java.util.List;

@Path("/Produtos")
public class produtosResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<produtos> getAll(){
        return produtos.list("order by ID");
    }
    
}