package br.com.restEstetica.entity;

import java.io.Serializable;

public class Produto  implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private Integer produto;
	private String nome;
	private Double valor;
	private Double comissao;
	private String tipo;
	
	
	
	public Produto(Integer produto, String nome, Double valor,Double comissao,String tipo) {
		
		this.produto = produto;
		this.nome = nome;
		this.valor = valor;
		this.comissao=comissao;
		this.tipo=tipo;
		
	}


	public Produto() {
		
	}


	@Override
	public String toString() {
		return "Produto [produto=" + produto + ", nome=" + nome + ", valor=" + valor + ",comissao="
				+ comissao + ",tipo=" + tipo +"]";
	}


	public Integer getProduto() {
		return produto;
	}


	public void setProduto(Integer produto) {
		this.produto = produto;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
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
	
	
	


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	
	
	
	

}
