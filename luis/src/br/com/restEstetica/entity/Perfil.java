package br.com.restEstetica.entity;

import java.io.Serializable;

public class Perfil implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private Integer idPerfil;
	private String nome;
	
	
	public Perfil(Integer idPerfil, String nome) {
		
		this.idPerfil = idPerfil;
		this.nome = nome;
	}
	
	
	public Perfil() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Perfil [idPerfil=" + idPerfil + ", nome=" + nome + "]";
	}


	public Integer getIdPerfil() {
		return idPerfil;
	}


	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
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
