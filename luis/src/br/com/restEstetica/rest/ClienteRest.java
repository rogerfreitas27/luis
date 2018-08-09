package br.com.restEstetica.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import br.com.restEstetica.persistence.ClienteDao;

@Path("/cliente")
public class ClienteRest {
	
	
@GET	
@Path("/listar")
@Produces("Application/json")
public String listar() {
	try {
	return  (new Gson().toJson(new ClienteDao().buscarTodos()));
	}catch(Exception ex) {
		return "erro" + ex.getMessage();
	}
	
}

}
