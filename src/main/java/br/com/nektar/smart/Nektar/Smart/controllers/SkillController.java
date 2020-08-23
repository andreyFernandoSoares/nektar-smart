package br.com.nektar.smart.Nektar.Smart.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.nektar.smart.Nektar.Smart.models.Skill;
import br.com.nektar.smart.Nektar.Smart.services.SkillService;

@Controller
@RequestMapping("/")
public class SkillController {
	
	@Autowired
	private SkillService skillService;
	
	@GetMapping
	public String home(Model model) {
		model.addAttribute("skills", skillService.getByImageOrder());
		return "index";
	}
	
	@PostMapping
	@Transactional
	@ResponseBody
	public Skill save(@RequestBody Skill skill){
		return skillService.save(skill);
	}
	
	@GetMapping("/{id}")
	public String getById(@PathVariable Long id, Model model) {
		model.addAttribute("skill", skillService.getById(id));
		return "detail1";
	}
}
