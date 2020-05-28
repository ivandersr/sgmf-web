package com.salvadot.sgmfweb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.salvadot.sgmfweb.domain.Aluno;

@RestController
@RequestMapping(value="/alunos")
public class AlunoResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Aluno>> findAll() {
		Aluno a1 = new Aluno();
		a1.setNome("Aluno test");
		a1.setId("1");
		Aluno a2 = new Aluno();
		a2.setNome("Aluno test");
		a2.setId("1");
		List<Aluno> list = new ArrayList<>();
		list.addAll(Arrays.asList(a1, a2));
		return ResponseEntity.ok().body(list);
	}

}
