package br.com.nektar.smart.Nektar.Smart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nektar.smart.Nektar.Smart.models.Curso;
import br.com.nektar.smart.Nektar.Smart.repositories.CursoRepository;

@Service
public class CursoService {
	
	@Autowired
	CursoRepository cursoRepository;
	
	public Curso gravar(Curso curso) {
		return cursoRepository.save(curso);
	}

	public List<Curso> buscar() {
		List<Curso> pacoteList = cursoRepository.findByOrderByOrdemAsc();
		return pacoteList;
	}
}
