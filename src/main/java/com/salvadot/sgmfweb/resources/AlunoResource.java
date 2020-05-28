package com.salvadot.sgmfweb.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.salvadot.sgmfweb.domain.Aluno;
import com.salvadot.sgmfweb.dto.AlunoDTO;
import com.salvadot.sgmfweb.services.AlunoService;

@RestController
@RequestMapping(value="/alunos")
public class AlunoResource {
	
	@Autowired
	public AlunoService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<AlunoDTO>> findAll() {
		List<Aluno> list = service.findAll();
		List<AlunoDTO> listDTO = list.stream().map(x -> new AlunoDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}

}
