package br.gov.mec.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.gov.mec.model.CaptchaController;

@Path("/")
public class CaptchaResource {
	
	private CaptchaController controller = new CaptchaController();

    @GET
    @Path("start/{numero}")
    @Produces("application/json")
    public String start(@PathParam("numero") int numero){
    	return controller.start(numero);
    }
    
    @GET
    @Path("audio")
    public void start(){
    }
    
}