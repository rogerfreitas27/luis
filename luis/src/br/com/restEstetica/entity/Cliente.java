package br.com.restEstetica.entity;

import java.io.Serializable;
import java.time.LocalDate;



/**
 * 
 * @author Roger
 * @version  1.0
 *
 */


public class Cliente  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Long idCliente;
	private String nome = "";
	private String cpf_cnpj = "";
	private LocalDate nascimento ; 
	private transient String nascimentoWeb = "";
	private String tel_celular = "";
	private String telefone = "";
	private Integer status = 0;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Cliente(Long idCliente, String nome, String cpf_cnpj, LocalDate nascimento, String tel_celular,
			String telefone,Integer status, String nascimentoWeb) {
		
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf_cnpj = cpf_cnpj;
		this.nascimento = nascimento;
		this.tel_celular = tel_celular;
		this.telefone = telefone;
	    this.status = status;
	    this.nascimentoWeb = nascimentoWeb;
	
	}




	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", cpf_cnpj=" + cpf_cnpj + ", nascimento="
				+ nascimento + ", tel_celular=" + tel_celular + ", telefone=" + telefone + ",status="+ status + ",nascimentoWeb="
				+ nascimentoWeb + "]";
	}




	public Long getIdCliente() {
		return idCliente;
	}




	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getCpf_cnpj() {
		return cpf_cnpj;
	}




	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}




	public LocalDate getNascimento() {
		return nascimento;
	}




	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}




	public String getTel_celular() {
		return tel_celular;
	}




	public void setTel_celular(String tel_celular) {
		this.tel_celular = tel_celular;
	}




	public String getTelefone() {
		return telefone;
	}




	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	public Integer getStatus() {
		return status;
	}




	public void setIdStatus(Integer status) {
		this.status = status;
	}

	
	



	public String getNascimentoWeb() {
		return nascimentoWeb;
	}




	public void setNascimentoWeb(String nascimentoWeb) {
		this.nascimentoWeb = nascimentoWeb;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	

}
