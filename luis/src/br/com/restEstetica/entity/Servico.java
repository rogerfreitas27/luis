package br.com.restEstetica.entity;






import java.io.Serializable;


public class Servico  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private Integer idServico = 0;	
	private String nome ="";	
	private Double valor =0.0;	
	private Categoria categoria ;
	private Integer status = 0;
	private Double comissao = 0.0;
	//<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
	
	public Servico(){
		
	}
	public Servico(Integer idServico, String nome, Double valor, Categoria categoria, Integer status, Double comissao) {
		super();
		this.idServico = idServico;
		this.nome = nome;
		this.valor = valor;
		this.categoria = categoria;
		this.status = status;
		this.comissao = comissao;
	}
	@Override
	public String toString() {
		return "Servico [idServico=" + idServico + ", nome=" + nome + ", valor=" + valor + ", categoria=" + categoria
				+ ", status=" + status + ", comissao=" + comissao + "]";
	}
	public Integer getIdServico() {
		return idServico;
	}
	public void setIdServico(Integer idServico) {
		this.idServico = idServico;
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
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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


