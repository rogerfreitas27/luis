package br.com.restEstetica.entity;

import java.io.Serializable;

public class Categoria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer idCategoria;
	private String nome;
	
	
	
	public Categoria() {
		super();
	}



	public Categoria(Integer idCategoria , String nome) {
		
		this.idCategoria = idCategoria;
		this.nome = nome;
		
	}



	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", nome=" + nome + "]";
	}



	public Integer getIdCategoria() {
		return idCategoria;
	}



	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
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
