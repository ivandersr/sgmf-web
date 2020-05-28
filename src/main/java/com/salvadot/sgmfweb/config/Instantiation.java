package com.salvadot.sgmfweb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.salvadot.sgmfweb.domain.Aluno;
import com.salvadot.sgmfweb.repositories.AlunoRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private AlunoRepository alunoRepo;

	@Override
	public void run(String... args) throws Exception {
		
		alunoRepo.deleteAll();
		
		Aluno a1 = new Aluno(null, "Aluno teste 1", "999999999");
		Aluno a2 = new Aluno(null, "Aluno teste 2", "988888888");
		
		alunoRepo.saveAll(Arrays.asList(a1, a2));
		
		
	}

}
