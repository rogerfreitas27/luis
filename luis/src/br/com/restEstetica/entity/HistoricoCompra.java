package br.com.restEstetica.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class HistoricoCompra implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private Integer idCompra;
	private String marca;
	private String fornecedor;
	private Integer quantidade;
	private String tipo;
	private LocalDate data;
	private String cnpj;
	
	public HistoricoCompra() {
		
	}

	public HistoricoCompra(Integer idCompra, String marca, String fornecedor, Integer quantidade, String tipo,
			LocalDate data, String cnpj) {
		super();
		this.idCompra = idCompra;
		this.marca = marca;
		this.fornecedor = fornecedor;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.data = data;
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "HistoricoCompra [idCompra=" + idCompra + ", marca=" + marca + ", fornecedor=" + fornecedor
				+ ", quantidade=" + quantidade + ", tipo=" + tipo + ", data=" + data + ", cnpj=" + cnpj + "]";
	}

	public Integer getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	

}
