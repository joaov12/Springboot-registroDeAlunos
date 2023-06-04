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
   }

   @PostMapping("/add")
   public ResponseEntity<Aluno> addAluno(@RequestBody Aluno aluno) {
      return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.addAluno(aluno));
   }

   @PutMapping("/edit")
   public ResponseEntity<Aluno> editAluno(@RequestBody Aluno aluno) {
      return ResponseEntity.status(HttpStatus.OK).body(alunoService.updateAluno(aluno));
   }

   @DeleteMapping("/delete/{id}")
   public ResponseEntity<?> deleteAluno(@PathVariable("id") Long id) {
      alunoService.deleteAluno(id);
      return ResponseEntity.status(HttpStatus.OK).body("Usuário deletado com sucesso");
   }

}
