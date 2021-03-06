package br.com.restEstetica.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import br.com.restEstetica.persistence.ServicoDao;


@Path("/servico")
public class ServicoRest {

	
	
	@GET
	@Produces("Application/json")
	@Path("/listar")
	public String buscarTodos() {
		try{
			//System.out.println("teste");
			return (new Gson().toJson( new ServicoDao().buscarTodos()));
			
			
		}catch(Exception ex){
			
			return "erro" + ex.getMessage();
		}
	}
	
	
	
}
