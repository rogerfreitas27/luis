package br.com.restEstetica.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import br.com.restEstetica.persistence.ProfissionalDao;


@Path("/profissional")
public class ProfissionalRest {

	
@GET	
@Path("/listar")
//@Produces(MediaType.APPLICATION_JSON)
@Produces("Application/json")
public String listar() {
	
	try {
		return (new Gson().toJson( new ProfissionalDao().buscarTodos()));
	}catch(Exception ex) {
		return "erro" + ex.getMessage();
		
	}
}

	

}
