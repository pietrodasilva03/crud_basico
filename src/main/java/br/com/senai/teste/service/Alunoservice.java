package br.com.senai.teste.service;
    import org.springframework.stereotype.Service;
    import br.com.senai.teste.model.aluno;
    import br.com.senai.teste.repository.AlunoRepository;

@Service 
public class Alunoservice {
    private final AlunoRepository alunoRepository;

    public Alunoservice(AlunoRepository alunoRepository){
        this.alunoRepository = alunoRepository;

    }

    public aluno salvarAluno(aluno aluno){
        return alunoRepository.save(aluno);
    }


    
}
