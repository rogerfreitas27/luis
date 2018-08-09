package br.com.restEstetica.entity;

import java.io.Serializable;

public class Atendimento  implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private Integer idAtendimento;
	private Integer idprofissional;
	private Integer idservico;
	private Integer idcliente;
	private String data_hora;
	private Integer idComanda;
	private Double valor;
	private Venda venda;
	private String obs;
	
	public Atendimento() {
		// TODO Auto-generated constructor stub
	}

	public Atendimento(Integer idAtendimento, Integer idprofissional, Integer idservico, Integer idcliente,
			String data_hora, Integer idComanda,Double valor,Venda venda,String obs) {
		
		this.idAtendimento = idAtendimento;
		this.idprofissional = idprofissional;
		this.idservico = idservico;
		this.idcliente = idcliente;
		this.data_hora = data_hora;
		this.idComanda = idComanda;
		this.valor=valor;
		this.venda=venda;
		this.obs=obs;
	}

	public Integer getIdAtendimento() {
		return idAtendimento;
	}

	public void setIdAtendimento(Integer idAtendimento) {
		this.idAtendimento = idAtendimento;
	}

	public Integer getIdprofissional() {
		return idprofissional;
	}

	public void setIdprofissional(Integer idprofissional) {
		this.idprofissional = idprofissional;
	}

	public Integer getIdservico() {
		return idservico;
	}

	public void setIdservico(Integer idservico) {
		this.idservico = idservico;
	}

	public Integer getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public String getData_hora() {
		return data_hora;
	}

	public void setData_hora(String data_hora) {
		this.data_hora = data_hora;
	}
	
	
	

	public Integer getIdComanda() {
		return idComanda;
	}

	public void setIdComanda(Integer idComanda) {
		this.idComanda = idComanda;
	}
	
	

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
	

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
	public String getObs() {
		return obs;
	}
	
	public void setObs(String obs) {
		this.obs=obs;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

	
	
	
}
