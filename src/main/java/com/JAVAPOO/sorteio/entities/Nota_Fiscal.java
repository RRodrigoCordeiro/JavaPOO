package com.JAVAPOO.sorteio.entities;
import java.time.LocalDate;

public class Nota_Fiscal {
	
	private Long id;
	private Long usuario_id;
	private String chave;
	private String sequencial;
	private LocalDate data_processamento;
	
	
	private Usuario usuario;

	public Nota_Fiscal() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Long usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getSequencial() {
		return sequencial;
	}

	public void setSequencial(String sequencial) {
		this.sequencial = sequencial;
	}

	public LocalDate getData_processamento() {
		return data_processamento;
	}

	public void setData_processamento(LocalDate data_processamento) {
		this.data_processamento = data_processamento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
