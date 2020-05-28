package com.salvadot.sgmfweb.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.salvadot.sgmfweb.domain.Aluno;
import com.salvadot.sgmfweb.domain.Grupo;
import com.salvadot.sgmfweb.domain.Plano;

public class AlunoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nome;
	private String telefone;
	private List<Aluno> indicacoes = new ArrayList<>();
	private Plano plano;
	private Grupo grupo;
	
	public AlunoDTO() { 
	}

	public AlunoDTO(Aluno obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.telefone = obj.getTelefone();
		this.indicacoes = obj.getIndicacoes();
		this.plano = obj.getPlano();
		this.grupo = obj.getGrupo();
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
	
	@JsonIgnore
	public List<Aluno> getIndicacoes() {
		return indicacoes;
	}
	
	public Plano getPlano() {
		return plano;
	}
	
	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	
	

	
}
