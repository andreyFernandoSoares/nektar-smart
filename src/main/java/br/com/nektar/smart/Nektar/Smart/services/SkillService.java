package br.com.nektar.smart.Nektar.Smart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nektar.smart.Nektar.Smart.models.Skill;
import br.com.nektar.smart.Nektar.Smart.repositories.SkillRepository;

@Service
public class SkillService {
	
	@Autowired
	SkillRepository skillRepository;
	
	public Skill save(Skill skill) {
		return skillRepository.save(skill);
	}

	public List<Skill> getByImageOrder() {
		return skillRepository.findByOrderByImageOrderAsc();
	}

	public Skill getById(Long id) {
		return skillRepository.findById(id).get();
	}
}
