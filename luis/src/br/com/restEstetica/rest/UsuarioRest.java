package br.com.restEstetica.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import br.com.restEstetica.entity.Usuario;
import br.com.restEstetica.persistence.UsuarioDao;

@Path("/usuario")
public class UsuarioRest {
	
	
@Path("listar")
@Produces("Application/json")
@GET
public String listar() {
	try {
	return (new Gson().toJson( new UsuarioDao().buscarTodos()));
	
	}catch(Exception ex) {
		return "erro" + ex.getMessage();
	}
}


@POST
@Produces("txt/plain")
@Consumes(MediaType.APPLICATION_JSON)
@Path("/logar")
public String logar(String usuario) {
	try {
		
		Usuario  u =new Gson().fromJson(usuario,Usuario.class);
		UsuarioDao dao = new UsuarioDao();
		
		Usuario usu;
		usu = dao.logar(u);
		if(usu.getIdUsuario() == 0) {
			
			return "usuario não encontrado verifique se o login e senha estão corretos";
		}else 
		return (new Gson().toJson(usu));
			
			
		}catch(Exception ex) {
			return "erro" + ex.getMessage();
		}
}

}
