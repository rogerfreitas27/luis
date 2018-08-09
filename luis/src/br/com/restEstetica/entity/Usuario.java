package br.com.restEstetica.entity;

public class Usuario {
	
	private Integer idUsuario;
	private Integer idFuncionario;
	private Integer idCliente;
	private String Login;
	private String senha;
	private Perfil perfil;
	
	public Usuario() {
		
	}

	public Usuario(Integer idUsuario, String login, String senha, Perfil perfil) {
		super();
		this.idUsuario = idUsuario;
		Login = login;
		this.senha = senha;
		this.perfil = perfil;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
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

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	
	

}
