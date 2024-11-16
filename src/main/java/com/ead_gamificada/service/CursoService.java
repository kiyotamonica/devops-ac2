package com.ead_gamificada.service;

import com.ead_gamificada.entity.Curso;
import com.ead_gamificada.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> listarTodosCursos() {
        return cursoRepository.findAll();
    }

    public Curso buscarCursoPorId(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    public Curso salvarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public void deletarCurso(Long id) {
        cursoRepository.deleteById(id);
    }
}
