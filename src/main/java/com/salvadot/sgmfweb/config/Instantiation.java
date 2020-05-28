package com.salvadot.sgmfweb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.salvadot.sgmfweb.domain.Aluno;
import com.salvadot.sgmfweb.domain.Grupo;
import com.salvadot.sgmfweb.domain.Plano;
import com.salvadot.sgmfweb.repositories.AlunoRepository;
import com.salvadot.sgmfweb.repositories.GrupoRepository;
import com.salvadot.sgmfweb.repositories.PlanoRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private AlunoRepository alunoRepo;
	
	@Autowired
	private PlanoRepository planoRepo;
	
	@Autowired
	private GrupoRepository grupoRepo;

	@Override
	public void run(String... args) throws Exception {

		alunoRepo.deleteAll();
		planoRepo.deleteAll();
		grupoRepo.deleteAll();
		
		Plano p1 = new Plano(null, "Plano 1: Todos os dias.", 92.0);
		Plano p2 = new Plano(null, "Plano 2: Três vezes por semana.", 78.0);
		
		planoRepo.saveAll(Arrays.asList(p1, p2));
		
		Grupo adulto = new Grupo(null, "Adultos", "Alunos com idade acima de 16 anos.");
		Grupo crianca = new Grupo(null, "Crianças", "Alunos com idade abaixo de 16 anos.");
		
		grupoRepo.saveAll(Arrays.asList(adulto, crianca));
		
		Aluno a1 = new Aluno(null, "Aluno teste 1", "999999999");
		Aluno a2 = new Aluno(null, "Aluno teste 2", "988888888");
		
		a1.setPlano(p1);
		a2.setPlano(p2);
		a1.setGrupo(adulto);
		a2.setGrupo(crianca);

		alunoRepo.saveAll(Arrays.asList(a1, a2));

	}

}
