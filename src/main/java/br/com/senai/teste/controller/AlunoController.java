package br.com.senai.teste.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.teste.service.Alunoservice;
import br.com.senai.teste.model.aluno; 

@RestController 
@RequestMapping ("/alunos")
public class AlunoController {
    
    private final Alunoservice alunoservice; 

    public AlunoController(Alunoservice alunoservice){
        this.alunoservice = alunoservice;
    }

    @PostMapping
    public ResponseEntity<aluno> cadastrar(
    @RequestBody aluno aluno){

    aluno alunoSalvo = alunoservice.salvarAluno(aluno);

    return ResponseEntity.status(HttpStatus.CREATED).body(alunoSalvo);
}
}