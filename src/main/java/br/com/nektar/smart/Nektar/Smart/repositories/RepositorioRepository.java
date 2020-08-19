package br.com.nektar.smart.Nektar.Smart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.nektar.smart.Nektar.Smart.models.Repositorio;

@Repository
public interface RepositorioRepository extends JpaRepository<Repositorio, Long>{

}
