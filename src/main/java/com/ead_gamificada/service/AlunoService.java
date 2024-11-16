package com.ead_gamificada.service;

import com.ead_gamificada.entity.Aluno;
import com.ead_gamificada.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> listarTodosAlunos() {
        return alunoRepository.findAll();
    }

    public Aluno buscarAlunoPorId(Long id) {
        return alunoRepository.findById(id).orElse(null);
    }

    public Aluno salvarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public void deletarAluno(Long id) {
        alunoRepository.deleteById(id);
    }
}
