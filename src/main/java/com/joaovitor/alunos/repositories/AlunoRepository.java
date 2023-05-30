package com.joaovitor.alunos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.joaovitor.alunos.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    
}
