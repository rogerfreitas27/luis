package br.com.restEstetica.persistence;



	

	import java.net.UnknownHostException;
	import java.sql.Connection;

	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	import com.mongodb.Mongo;
	import com.mongodb.MongoClient;
	import com.mongodb.MongoClientURI;

	import com.mongodb.client.MongoDatabase;

	public class Dao {

	PreparedStatement pst;
	ResultSet rs;
	static MongoClient  mongoClient;
	 static  MongoClientURI mongo_uri;
	//MongoDatabase db;
	//DB db;
	//MongoDatabase dataBase;

		
		
		
		public  static Connection getMysql() throws Exception{
		Connection con =null;
		
		Class.forName("com.mysql.jdbc.Driver");	
		//con = DriverManager.getConnection("jdbc:mysql://rogerdesenvolvedor.com.br:3306/rogerde1_estetica","rogerde1_clinica","r33958262");
		//con = DriverManager.getConnection("jdbc:mysql://vps9573.publiccloud.com.br:3306/estetica","root","r33958262");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/luis","root","1234");
		return con;	
		}
		
		
		public void closeMysql() throws Exception{
			
		}
		
		
		public static MongoDatabase openMongo() throws UnknownHostException{
			MongoDatabase db =null;
			
			
			
		//	mongo_uri = new MongoClientURI("mongodb://roger:r33958262@ds257981.mlab.com:57981/estetica"); 
	      //mongoClient = new MongoClient(mongo_uri);
		    // db = mongoClient.getDatabase(mongo_uri.getDatabase());
			
			
			mongo_uri = new MongoClientURI("mongodb://roger:r33958262@vps9573.publiccloud.com.br:27017/estetica"); 
		    mongoClient = new MongoClient(mongo_uri);
		    db = mongoClient.getDatabase(mongo_uri.getDatabase());
	        
	        
		System.out.println("Conectado com sucesso");
			
			return db;
			
		}
		
		public void closeMongo()throws UnknownHostException{
			mongoClient.close();
			System.out.println("Conexão fechada com sucesso");
		}
		
		
		
		public static void main(String[] args) {
			// Connection conexao=Dao.getMysql();
			try{
				//Connection conexao=Dao.getMysql();
				//System.out.println(conexao);
				//Dao dao = new Dao();
				Dao.openMongo();
				//dao.closeMongo();
			}catch(Exception e ){
				e.printStackTrace();
			}
		}
		
		
	}



