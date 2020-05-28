package com.salvadot.sgmfweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salvadot.sgmfweb.domain.Aluno;
import com.salvadot.sgmfweb.dto.AlunoDTO;
import com.salvadot.sgmfweb.repositories.AlunoRepository;
import com.salvadot.sgmfweb.services.exceptions.ObjectNotFoundException;

@Service
public class AlunoService {
	
	@Autowired
	public AlunoRepository repo;
	
	public List<Aluno> findAll() {
		return repo.findAll();
	}
	
	public Aluno findById(String id) {
		return repo.findById(id).orElseThrow(() -> new ObjectNotFoundException("Aluno não encontrado."));
	}
	
	public Aluno insert(Aluno obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public Aluno fromDTO(AlunoDTO objDto) {
		return new Aluno(objDto.getId(), objDto.getNome(), objDto.getTelefone());
	}

}
