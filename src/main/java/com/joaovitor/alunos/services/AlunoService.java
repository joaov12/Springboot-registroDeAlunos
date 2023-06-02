package com.joaovitor.alunos.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaovitor.alunos.entities.Aluno;
import com.joaovitor.alunos.repositories.AlunoRepository;

import jakarta.transaction.Transactional;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    @Transactional
    public Aluno addAluno(Aluno aluno) {
        aluno.setMatricula(UUID.randomUUID().toString());
        return alunoRepository.save(aluno);
    }

    public List<Aluno> findAllAlunos() {
        return alunoRepository.findAll();
    }

    public Optional<Aluno> findAlunoById(Long id) {
        return alunoRepository.findById(id);
    }

    @Transactional
    public Aluno updateAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Transactional
    public void deleteAluno(Long id) {
        alunoRepository.deleteById(id);
    }

}
