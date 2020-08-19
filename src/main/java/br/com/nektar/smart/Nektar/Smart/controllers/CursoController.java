package br.com.nektar.smart.Nektar.Smart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nektar.smart.Nektar.Smart.models.Curso;
import br.com.nektar.smart.Nektar.Smart.services.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {
	
	@Autowired
	CursoService cursoService;
	
	@PostMapping
	public Curso gravar(@RequestBody Curso curso){
		return cursoService.gravar(curso);
	}
}
