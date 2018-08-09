package br.com.restEstetica.persistence;



import java.net.UnknownHostException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import br.com.restEstetica.entity.Servico;



/**
 * @author roger
 */
public class ServicoDaoHibrido extends Dao {
Connection con;
MongoCollection<Document> songs ;


public List<Servico> buscarTodos() throws Exception{
	String sql="select *from servico ";
	List<Servico> lista = new ArrayList<>();
	con=Dao.getMysql();
	pst = con.prepareStatement(sql);
	rs = pst.executeQuery();
	
	while(rs.next()){
	//	Servico s= new Servico(rs.getInt("idServico"), rs.getString("nome_servico"),rs.getString("duracao"),
		//		rs.getString("obs"), rs.getDouble("valor"),rs.getString("tipo"),rs.getInt("qtd_aplicacao"),rs.getInt("status_servico"));
		//lista.add(s);
	}
	
	
	return lista;
	
}

/**

 * @param Aqui eu recebo uma lista de serviço em mysql e gravo estes dados no mongodb 
 * @throws UnknownHostException
 * @return Não há retorno
 */
public void gravarListaServico(List<Servico> lista) throws UnknownHostException, MongoException{
	
	 MongoDatabase conexao =ServicoDaoHibrido.openMongo();
	
	for (Servico s : lista) {
		List<Document> servico = new ArrayList<Document>();
//		servico.add(new Document(
//				"nome", s.getNome()).
//                append("valor",s.getValor()).
//                append("duracao", s.getDuracao()).
//                append("tipo", s.getTipo()).
//                append("Qtd_aplicacao", s.getQtd_aplicacao()).
//                append("descricao",s.getDescricao()).
//                append("status", s.getStatus())
	 //       );
			
		 songs = conexao.getCollection("servico");
		 songs.insertMany(servico);

	}
	
	 closeMongo(); // fechando a conexao
	}


public List<Servico> buscarTodosMongo() throws Exception {
	 List<Servico> lista =new ArrayList<>();
	
	
	//openMongo();
	 MongoDatabase conexao =ServicoDaoHibrido.openMongo();
	 
	songs = conexao.getCollection("servico");
	MongoCursor<Document> cursor = songs.find().iterator();

	
     try {
    	 
    	  
         while (cursor.hasNext()) {
        	 
             Document doc = cursor.next();
                    
//             Servico s = new Servico(null, doc.getString("nome"),doc.getString("duracao"), doc.getString("descricao"),
//            		doc.getDouble("valor"), doc.getString("tipo"),doc.getInteger("qtd_aplicacao") ,doc.getInteger("satus"));
//             
//
//             lista.add(s);
         }
     } finally {
         cursor.close();
     }
     
     
     closeMongo();
     
     return lista;
}
	
	






public  static void main( String[] args){
ServicoDaoHibrido serdao = new ServicoDaoHibrido();

List<Servico> lista = new ArrayList<>();

try{
lista=serdao.buscarTodos();
//lista=serdao.buscarTodosMongo();

//lista.forEach(System.out::println);
//lista.forEach(System.out::println);
//serdao.gravarListaServico(lista);
serdao.buscarTodosMongo();
lista.forEach(System.out::println);
}catch (Exception ex){
	System.out.println("Erro");
	ex.printStackTrace();
}
	
}

}

