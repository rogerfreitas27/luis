package br.com.restEstetica.entity;

import java.io.Serializable;

public class Venda implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private Integer  idItem;
	private Integer  idProduto;
	private Double  valor;
	private Double comissao;
	
	
	public Venda() {
		
	}

	
	
	
	

	public Venda(Integer idItem, Integer idProduto, Double valor, Double comissao) {
		super();
		this.idItem = idItem;
		this.idProduto = idProduto;
		this.valor = valor;
		this.comissao = comissao;
	}






	@Override
	public String toString() {
		return "Venda [idItem=" + idItem + ", idProduto=" + idProduto + ", valor=" + valor + ", comissao=" + comissao
				+ "]";
	}






	public Integer getIdItem() {
		return idItem;
	}






	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}






	public Integer getIdProduto() {
		return idProduto;
	}






	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}






	public Double getValor() {
		return valor;
	}






	public void setValor(Double valor) {
		this.valor = valor;
	}






	public Double getComissao() {
		return comissao;
	}






	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}






	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	


	


	
	
	
	
	
	
	
	

}
