package br.com.restEstetica.persistence;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.restEstetica.entity.Categoria;
import br.com.restEstetica.entity.Servico;

public class ServicoDao extends Dao {

	private Connection con;
	
	
	public List<Servico> buscarTodos() throws Exception{
		con = Dao.getMysql();
		List<Servico> lista = new ArrayList<>();
		String sql="select *from servico s inner join categoria c on (s.categoria=c.idCategoria)";
		
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		
		while(rs.next()) {
			Servico s = new Servico(rs.getInt("idServico"),rs.getString("nome"),rs.getDouble("valor") ,
					new Categoria(null,rs.getString("nome")),rs.getInt("status") , rs.getDouble("comissao"));
			
			lista.add(s);
		}
		
		
		
		
		
		return lista;
		
	}
	
	public static void main(String[] args) {
		ServicoDao dao =  new ServicoDao();
		List<Servico> lista =  new ArrayList<>();
		
		try {
			
			lista = dao.buscarTodos();
			lista.forEach(System.out::println);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
