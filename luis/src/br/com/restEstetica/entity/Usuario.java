package br.com.restEstetica.entity;

import java.io.Serializable;

public class Usuario implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private Integer idUsuario = 0;
	private String login = "";
	private String senha = "";
	private Integer idCliente = 0;
	private Integer idProfissional = 0;
	private String apelido = "";
	private Perfil perfil;
	
	
	public Usuario() {
		
	}

	public Usuario(Integer idUsuario, String login, String senha,Integer idCliente,
			Integer idProfissional,String apelido,Perfil perfil) {
		
		this.idUsuario = idUsuario;
		this.login = login;
		this.senha = senha;
		this.perfil = perfil;
		this.idCliente = idCliente;
		this.idProfissional = idProfissional;
		this.apelido = apelido;
	}
	
	

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", login=" + login + ", senha=" + senha +
				",perfil=" + perfil + "]";
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Perfil getPerfil() {
		return perfil;
	}
	
	

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(Integer idProfissional) {
		this.idProfissional = idProfissional;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	
	

}
