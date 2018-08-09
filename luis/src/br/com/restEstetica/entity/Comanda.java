package br.com.restEstetica.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class Comanda implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Integer idComanda;
	private Atendimento atendimento;
	private LocalDate data;
	private Integer status;
	
	
	
	public Comanda() {
		
	}



	



	public Comanda(Integer idComanda, Atendimento atendimento, LocalDate data, Integer status) {
		super();
		this.idComanda = idComanda;
		this.atendimento = atendimento;
		this.data = data;
		this.status = status;
	}







	public Integer getIdComanda() {
		return idComanda;
	}







	public void setIdComanda(Integer idComanda) {
		this.idComanda = idComanda;
	}







	public Atendimento getAtendimento() {
		return atendimento;
	}







	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}







	public LocalDate getData() {
		return data;
	}







	public void setData(LocalDate data) {
		this.data = data;
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
