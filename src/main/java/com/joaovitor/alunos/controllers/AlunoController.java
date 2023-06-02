package com.joaovitor.alunos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaovitor.alunos.entities.Aluno;
import com.joaovitor.alunos.services.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

   @Autowired
   AlunoService alunoService;

   @GetMapping("/all")
   public ResponseEntity<List<Aluno>> getAllAlunos() {
      return ResponseEntity.status(HttpStatus.OK).body(alunoService.findAllAlunos());
   }

   @GetMapping("/find/{id}")
   public ResponseEntity<Optional<Aluno>> getAlunoById(@PathVariable("id") Long id) {
      return ResponseEntity.status(HttpStatus.OK).body(alunoService.findAlunoById(id));
      // Retornar aqui porque nos outros projetos que eu fiz todos fazem esse método
      // diferente, vamos ver
      // se assim funciona
   }

   @PostMapping("/add")
   public ResponseEntity<Aluno> addAluno(@RequestBody Aluno aluno) {
      Aluno novoAluno = alunoService.addAluno(aluno);
      return new ResponseEntity<>(novoAluno, HttpStatus.CREATED);
   }

   @PutMapping("/edit")
   public ResponseEntity<Aluno> editAluno(@RequestBody Aluno aluno) {
      Aluno editarAluno = alunoService.updateAluno(aluno);
      return new ResponseEntity<>(editarAluno, HttpStatus.OK);
   }

   @DeleteMapping("/delete/{id}")
   public ResponseEntity<?> deleteAluno(@PathVariable("id") Long id){
      alunoService.deleteAluno(id);
      return new ResponseEntity<>(HttpStatus.OK);
   }

}
