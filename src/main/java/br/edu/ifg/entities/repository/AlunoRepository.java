package br.edu.ifg.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifg.entities.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

}
