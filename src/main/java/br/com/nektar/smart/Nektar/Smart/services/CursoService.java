package br.com.nektar.smart.Nektar.Smart.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nektar.smart.Nektar.Smart.repositories.CursoRepository;

@Service
public class CursoService {
	
	@Autowired
	CursoRepository cursoRepository;
}
