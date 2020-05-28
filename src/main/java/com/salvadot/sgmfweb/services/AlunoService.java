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
	
	public Aluno update(Aluno obj) {
		Aluno update = findById(obj.getId());
		updateData(update, obj);
		return repo.save(update);
	}
	
	private void updateData(Aluno update, Aluno obj) {
		update.setAtivo(obj.getAtivo());
		update.setDataInicio(obj.getDataInicio());
		update.setDataNasc(obj.getDataNasc());
		update.setMensalidade(obj.getMensalidade());
		update.setNome(obj.getNome());
		update.setObserv(obj.getObserv());
		update.setPagamento(obj.getPagamento());
		update.setReferencia(obj.getReferencia());
		update.setTelefone(obj.getTelefone());
		update.setPresenca(obj.getPresenca());
		update.setPlano(obj.getPlano());
		update.setVencimento(obj.getVencimento());
	}

	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public Aluno fromDTO(AlunoDTO objDto) {
		return new Aluno(objDto.getId(), objDto.getNome(), objDto.getTelefone());
	}

}
