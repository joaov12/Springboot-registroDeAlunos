package com.joaovitor.alunos.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_ALUNOS")
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nome;
    private String curso;
    private int idade;
    private String email;
    private String telefone;
    @Column(nullable = false, updatable = false)
    private String matricula;

    public Aluno(String nome, String curso, int idade, String email, String telefone, String matricula) {
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno [id=" + id + ", nome=" + nome + ", curso=" + curso + ", idade=" + idade + ", email=" + email
                + ", telefone=" + telefone + ", matricula=" + matricula + "]";
    }

}
