package com.joaovitor.alunos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaovitor.alunos.entities.Aluno;
import com.joaovitor.alunos.services.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

   private final AlunoService alunoService;

   @Autowired
   public AlunoController(AlunoService alunoService){
    this.alunoService = alunoService;
   }

   @GetMapping("/all")
   public ResponseEntity<List<Aluno>> getAllAlunos(){
        return ResponseEntity.status(HttpStatus.OK).body(alunoService.findAllAlunos()); 
   }


}
