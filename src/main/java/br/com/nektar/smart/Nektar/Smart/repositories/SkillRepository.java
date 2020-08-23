package br.com.nektar.smart.Nektar.Smart.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.nektar.smart.Nektar.Smart.models.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
	List<Skill> findByOrderByImageOrderAsc();
}
