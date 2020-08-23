package br.com.nektar.smart.Nektar.Smart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.nektar.smart.Nektar.Smart.models.Curso;
import br.com.nektar.smart.Nektar.Smart.services.CursoService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private CursoService cursoService;
	
	@GetMapping
	public String home(Model model) {
		model.addAttribute("cursos", cursoService.buscar());
		return "index";
	}
	
	@PostMapping
	@ResponseBody
	public Curso gravar(@RequestBody Curso curso){
		return cursoService.gravar(curso);
	}
	
	@GetMapping("/{id}")
	public String buscarPorId(@PathVariable Long id, Model model) {
		model.addAttribute("curso", cursoService.buscarPorId(id));
		return "detail1";
	}
}
