package br.com.restEstetica.entity;

import java.io.Serializable;

public class HistoricoClienteComanda implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private Integer idHistorico;
	private Integer idCliente;
	private Comanda comanda;
	
	
	public HistoricoClienteComanda() {
		// TODO Auto-generated constructor stub
	}


	


	


	public HistoricoClienteComanda(Integer idHistorico, Integer idCliente, Comanda comanda) {
		super();
		this.idHistorico = idHistorico;
		this.idCliente = idCliente;
		this.comanda = comanda;
	}








	@Override
	public String toString() {
		return "Historico [idHistorico=" + idHistorico + ", idCliente=" + idCliente + "]";
	}








	public Integer getIdHistorico() {
		return idHistorico;
	}








	public void setIdHistorico(Integer idHistorico) {
		this.idHistorico = idHistorico;
	}








	public Integer getIdCliente() {
		return idCliente;
	}








	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}








	public Comanda getComanda() {
		return comanda;
	}








	public void setComanda(Comanda comanda) {
		this.comanda = comanda;
	}








	public static long getSerialversionuid() {
		return serialVersionUID;
	}








	
	
	

	
	
}
