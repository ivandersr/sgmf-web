package com.salvadot.sgmfweb.dto;

import java.io.Serializable;

import com.salvadot.sgmfweb.domain.Aluno;

public class AlunoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nome;
	private String telefone;
	
	public AlunoDTO() { 
	}

	public AlunoDTO(Aluno obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.telefone = obj.getTelefone();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
}
