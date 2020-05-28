package com.salvadot.sgmfweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salvadot.sgmfweb.domain.Aluno;
import com.salvadot.sgmfweb.repositories.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	public AlunoRepository repo;
	
	public List<Aluno> findAll() {
		return repo.findAll();
	}

}
