package br.com.restEstetica.entity;

import java.io.Serializable;

public class HistoricoProfissionalCliente implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private Integer idHistorico;
	private Atendimento atendimento;
	private Profissional profissional;
	
	public HistoricoProfissionalCliente(){
		
	}

	public HistoricoProfissionalCliente(Integer idHistorico, Atendimento atendimento, Profissional profissional) {
		super();
		this.idHistorico = idHistorico;
		this.atendimento = atendimento;
		this.profissional = profissional;
	}

	public Integer getIdHistorico() {
		return idHistorico;
	}

	public void setIdHistorico(Integer idHistorico) {
		this.idHistorico = idHistorico;
	}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	

}
