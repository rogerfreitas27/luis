package br.com.restEstetica.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class Profissional implements Serializable  {
	
	
	private static final long serialVersionUID = 1L;
	private Integer idFuncionario = 0;
	private String cpf = "";
	private String nome ="";
	private String email = "";
	private Integer idFuncao = 0;
	private transient String funcao; 
	private LocalDate nascimento ;
	private transient String nascimentoweb = "";
	private String telefone = "";
	private String tel_celular;
	private String cep = "";
	private String bairro = "";
	private String logradouro = "";
	private String complemento = " ";
	private String cidade = "";
	private String uf;
	private Integer status;
	public Profissional(Integer idFuncionario,String cpf, String nome,String email, Integer idFuncao, String funcao, LocalDate nascimento,
			String nascimentoweb,String telefone,String tel_celular, String cep,
			String bairro, String logradouro, String complemento, String cidade, String uf,Integer status) {
		
		this.idFuncionario = idFuncionario;
		this.cpf=cpf;
		this.nome = nome;
		this.email=email;
		this.idFuncao = idFuncao;
		this.funcao = funcao;
		this.nascimento = nascimento;
		this.nascimentoweb= nascimentoweb;
		this.telefone= telefone;
		this.tel_celular = tel_celular;
		this.cep = cep;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.uf = uf;
		this.status=status;
	}
	public Profissional() {
		
	}
	@Override
	public String toString() {
		return "Profissional [idFuncionario=" + idFuncionario + ",cpf=" + cpf + ", nome=" + nome + ",email=" +email + ", idFuncao=" + idFuncao
				+",funcao=" + funcao + ", nascimento=" + nascimento +",nascimentoweb=" +  nascimentoweb + ", cep=" + cep + ", bairro=" + bairro + ", logradouro=" + logradouro
				+ ", complemento=" + complemento + ", cidade=" + cidade + ", uf=" + uf + ",status=" + status +  "]";
	}
	public Integer getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getIdFuncao() {
		return idFuncao;
	}
	public void setIdFuncao(Integer idFuncao) {
		this.idFuncao = idFuncao;
	}
	
	
	
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	
	
	
	
	public String getNascimentoweb() {
		return nascimentoweb;
	}
	public void setNascimentoweb(String nascimentoweb) {
		this.nascimentoweb = nascimentoweb;
	}
	
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTel_celular() {
		return tel_celular;
	}
	public void setTel_celular(String tel_celular) {
		this.tel_celular = tel_celular;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	
	public Integer getStatus() {
		return status;
	}




	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	
	
	

}
