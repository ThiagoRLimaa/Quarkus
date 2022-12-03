package org.acme.entity.resource;
import java.util.List;
import javax.transaction.Transactional;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.acme.entity.Produtos;


@Path("/produtos")
public class ProdutosResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Produtos> getAll(){
        return Produtos.listAll();
    }  


@POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Produtos produtos){
        if(produtos.DESCRICAO.equals("")){
            throw new BadRequestException("descricao é obrigatoria");
        }

        produtos.persist();
        return Response.status(Status.CREATED).entity(produtos).build();
    }
}
