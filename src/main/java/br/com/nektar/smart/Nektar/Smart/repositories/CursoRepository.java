package br.com.nektar.smart.Nektar.Smart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.nektar.smart.Nektar.Smart.models.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

}