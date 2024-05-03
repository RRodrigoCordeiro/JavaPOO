package com.JAVAPOO.sorteio.entities;

public class Bilhete {
	
	private Long id;
	private Long ano;
	private Long mes;
	private Long numero;
	private Long nota_fiscal_id;
	private Long usuario_id;
	
	private Nota_Fiscal nota_fiscal;
	private Usuario usuario;
	
	
	public Bilhete() {
	}


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


	public Long getMes() {
		return mes;
	}


	public void setMes(Long mes) {
		this.mes = mes;
	}


	public Long getNumero() {
		return numero;
	}


	public void setNumero(Long numero) {
		this.numero = numero;
	}


	public Long getNota_fiscal_id() {
		return nota_fiscal_id;
	}


	public void setNota_fiscal_id(Long nota_fiscal_id) {
		this.nota_fiscal_id = nota_fiscal_id;
	}


	public Long getUsuario_id() {
		return usuario_id;
	}


	public void setUsuario_id(Long usuario_id) {
		this.usuario_id = usuario_id;
	}


	public Nota_Fiscal getNota_fiscal() {
		return nota_fiscal;
	}


	public void setNota_fiscal(Nota_Fiscal nota_fiscal) {
		this.nota_fiscal = nota_fiscal;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	
	
	

}
