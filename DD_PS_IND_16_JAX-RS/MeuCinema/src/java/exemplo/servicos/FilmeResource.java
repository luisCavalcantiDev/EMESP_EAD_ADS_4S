package exemplo.servicos;

import com.google.gson.Gson;
import exemplo.modelo.Filme;
import java.util.*;
import java.util.List;
import javax.ws.rs.*;

/**
 * REST Web Service
 *
 * @author Luis Gustavo Cavalcanti
 */
@Path("filmes")
public class FilmeResource {

    private List<Filme> filmes;

    /**
     * Creates a new instance of FilmeResource
     */
    public FilmeResource() {
        filmes = new ArrayList<Filme>();
        filmes.add(new Filme(1L, "StarWars", "Sinopse do filme StarWars", "Fição Cientítica", "teste1", 220));
        filmes.add(new Filme(2L, "Batman X Superman", "Confronto dos dois personagens da DC Comins sinopse filme", "Aventura", "teste2", 190));
        filmes.add(new Filme(3L, "Capitão América III Guerra Civil", "Homem de Ferro contro o Capitão América", "Aventura", "teste3", 170));
    }

    /**
     * Retrieves representation of an instance of exemplo.servicos.FilmeResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        Gson gson = new Gson();
        return gson.toJson(filmes);
    }

    @Path("{filmeId}")
    @GET
    @Produces("application/json")
    public String getFilme(@PathParam("filmeId") String id) {
        for (Filme filme : filmes) {
            if (filme.getId().equals(Long.valueOf(id))) {
                Gson gson = new Gson();
                return gson.toJson(filme);
            }
        }        
        return null;
    }   
}
