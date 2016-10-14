package exemplo.mb;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import javax.faces.bean.*;

/**
 *
 * @author Administrador
 */
@ManagedBean
public class CinemaMB {
    
    public CinemaMB() {
    }
    
   
    public String getFilmesEmCartaz(){
        Client c = Client.create();
        WebResource wr = c.resource("http://localhost:8080/MeuCinema/webresources/filmes");
        
        return wr.get(String.class);
    }
}
