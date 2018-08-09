package br.com.restEstetica.persistence;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.restEstetica.entity.Perfil;
import br.com.restEstetica.entity.Usuario;

public class UsuarioDao  extends Dao{
	Connection con;
	
	
	public List<Usuario> buscarTodos() throws Exception{
		List<Usuario> lista = new ArrayList<>();
		con = Dao.getMysql();
		String sql="select *from usuario u inner join perfil p on(u.perfil=p.idPerfil)";
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		
		while(rs.next()) {
			Usuario u = new Usuario(rs.getInt("idUsuario"),rs.getString("login"),rs.getString("senha"),
					rs.getInt("idCliente") ,rs.getInt("idProfissional") ,rs.getString("apelido"),
					new Perfil(rs.getInt("idPerfil"),rs.getString("nome")));
			lista.add(u);
		}
		
		
		return lista;
	}
	
	public Usuario logar(Usuario usu) throws Exception {
		con = Dao.getMysql();
		Usuario u = new Usuario();
		String sql="select *from usuario u inner join perfil p on(u.perfil=p.idPerfil) "
				+ "where login=? and senha=?";
		
		pst = con.prepareStatement(sql);
		pst.setString(1,usu.getLogin());
		pst.setString(2,usu.getSenha());
		
		rs = pst.executeQuery();
		
		if(rs.next()) {
			 u = new Usuario(rs.getInt("idUsuario"),rs.getString("login"),rs.getString("senha"),
					rs.getInt("idCliente") ,rs.getInt("idProfissional") ,rs.getString("apelido"),
					new Perfil(rs.getInt("idPerfil"),rs.getString("nome")));
		}
		
		
		
		
		
		
		
		
		
		return u;
	}
	
	
	public static void main(String[] args) {
		UsuarioDao dao = new UsuarioDao();
		//List<Usuario>lista = new ArrayList<>();
		Usuario u = new Usuario(null,"luisadm","luisadm",null, null, null, null);
		try {
			Usuario usu = new Usuario();
			usu = dao.logar(u);
			System.out.println(usu);
		//	lista = dao.buscarTodos();
		//	lista.forEach(System.out::println);
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
