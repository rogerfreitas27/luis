package br.com.restEstetica.persistence;

import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


import br.com.restEstetica.entity.Profissional;

public class ProfissionalDao extends Dao {
	
	private Connection con;
	
	
	public List<Profissional> buscarTodos() throws Exception{
		con = Dao.getMysql();
		List<Profissional> lista =  new ArrayList<>();
		String sql ="select *from profissional  p inner join funcao f on"
				+ "(p.idFuncao=f.idFuncao) ";
		pst=con.prepareStatement(sql);
		rs = pst.executeQuery();
		
		while(rs.next()) {
			
			Profissional f = new  Profissional();
			f.setIdFuncionario(rs.getInt("idProfissional"));
			f.setNome(rs.getString("nome"));
			f.setCpf(rs.getString("cpf"));
		
			Date data = rs.getDate("nascimento");
				       if(data !=null ) {
				DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				f.setNascimento(rs.getDate("nascimento").toLocalDate());
				LocalDate 	nascimento =  f.getNascimento();
			    f.setNascimentoweb(nascimento.format(formatadorBarra));
						}
						
			    f.setIdFuncao(rs.getInt("idFuncao"));
			    f.setFuncao(rs.getString("f.nome"));
			    f.setStatus(rs.getInt("status"));
			    f.setTelefone(rs.getString("telefone"));
			    f.setTel_celular(rs.getString("tel_celular"));
			    f.setCep(rs.getString("cep"));
			    f.setBairro(rs.getString("bairro"));
			    f.setLogradouro(rs.getString("logradouro"));
			    f.setComplemento(rs.getString("complemento"));
			    f.setCidade(rs.getString("cidade"));
			    f.setUf(rs.getString("uf"));
		
					
		lista.add(f);
		
			
		}		
		
		
		return lista;
	}
	
	
	public static void main(String[] args) {
		ProfissionalDao dao = new ProfissionalDao();
		List<Profissional> lista = new ArrayList<>();
		try {
			lista = dao.buscarTodos();
			lista.forEach(System.out::println);
		}catch (Exception ex) {
			ex.printStackTrace();
			
		}
	}

}
