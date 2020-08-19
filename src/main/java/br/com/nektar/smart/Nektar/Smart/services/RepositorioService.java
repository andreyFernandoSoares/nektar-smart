package br.com.nektar.smart.Nektar.Smart.services;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.nektar.smart.Nektar.Smart.models.Repositorio;
import br.com.nektar.smart.Nektar.Smart.repositories.RepositorioRepository;

@Service
public class RepositorioService {
	
	@Autowired
	RepositorioRepository repositorioRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	private final static String URI = "https://api.github.com/repos/andreyFernandoSoares/"; 
	
	public Repositorio busca() throws Exception {
		List<String> repoList = new ArrayList<>();
		
		Scanner scanner = new Scanner(new File("repo.txt"));
		
		while(scanner.hasNext()) 
			repoList.add(scanner.nextLine());
		
		repoList.forEach(r -> {
			String resp = restTemplate.exchange(URI+r, HttpMethod.GET, null, String.class).getBody();
			System.out.println(resp);
		});
		
		return null;
	}
}
