package br.com.restEstetica.persistence;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.restEstetica.entity.Cliente;

public class ClienteDao extends Dao{
private static  Connection con;
	
	
	public List<Cliente> buscarTodos() throws Exception {
		con = Dao.getMysql();
		String sql= "select *from cliente";
		List<Cliente> lista = new ArrayList<Cliente>();
		pst = con.prepareStatement(sql);
		
		rs = pst.executeQuery();
		
		while(rs.next()) {
			
			Cliente c = new  Cliente();
			c.setIdCliente(rs.getLong("idCliente"));
			c.setNome(rs.getString("nome"));
			c.setCpf_cnpj(rs.getString("cpf/cnpj"));
		
			Date data = rs.getDate("nascimento");
						if(data !=null ) {
				DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				c.setNascimento(rs.getDate("nascimento").toLocalDate());
				LocalDate 	nascimento =  c.getNascimento();
			    c.setNascimentoWeb(nascimento.format(formatadorBarra));
						}
			    c.setCpf_cnpj(rs.getString("cpf/cnpj"));
			    c.setIdStatus(rs.getInt("status"));
			    c.setTelefone(rs.getString("telefone"));
			    c.setTel_celular(rs.getString("tel_celular"));
		
					
		lista.add(c);
		
		}
		
		
		
		
		
		return lista;
		
	}
	
	
	public static void main(String[] args) {
		ClienteDao dao = new ClienteDao();
		try {
			//System.out.println("teste");
			List<Cliente> lista =  new ArrayList<>();
			lista = dao.buscarTodos();
			lista.forEach(System.out::println);
		}catch(Exception ex) {
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
			
		}
	}
}
