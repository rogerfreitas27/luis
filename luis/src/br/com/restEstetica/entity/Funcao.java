package br.com.restEstetica.entity;

import java.io.Serializable;

public class Funcao implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private String idFuncao;
	private String nome;
	
	
	
	
	
	public Funcao() {
		
	}





	public Funcao(String idFuncao, String nome) {
		
		this.idFuncao = idFuncao;
		this.nome = nome;
	}





	public String getIdFuncao() {
		return idFuncao;
	}





	public void setIdFuncao(String idFuncao) {
		this.idFuncao = idFuncao;
	}





	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	

}
