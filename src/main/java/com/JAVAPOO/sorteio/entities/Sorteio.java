package com.JAVAPOO.sorteio.entities;

public class Sorteio {
	
	private Long id;
	private Long ano;
	private Long identificador;
	private Long mes;
	private Long valor_premio;
	private Long apresentador;
	private Long auditor;
	private Long premiado;
	private String descricao;
	private String tipo;
    
	private Bilhete bilhete;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAno() {
		return ano;
	}

	public void setAno(Long ano) {
		this.ano = ano;
	}

	public Long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}

	public Long getMes() {
		return mes;
	}

	public void setMes(Long mes) {
		this.mes = mes;
	}

	public Long getValor_premio() {
		return valor_premio;
	}

	public void setValor_premio(Long valor_premio) {
		this.valor_premio = valor_premio;
	}

	public Long getApresentador() {
		return apresentador;
	}

	public void setApresentador(Long apresentador) {
		this.apresentador = apresentador;
	}

	public Long getAuditor() {
		return auditor;
	}

	public void setAuditor(Long auditor) {
		this.auditor = auditor;
	}

	public Long getPremiado() {
		return premiado;
	}

	public void setPremiado(Long premiado) {
		this.premiado = premiado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Bilhete getBilhete() {
		return bilhete;
	}

	public void setBilhete(Bilhete bilhete) {
		this.bilhete = bilhete;
	}

	
	

}
