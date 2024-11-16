package com.ead_gamificada.service;

import com.ead_gamificada.entity.CursoComprado;
import com.ead_gamificada.repository.CursoCompradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoCompradoService {

    @Autowired
    private CursoCompradoRepository cursoCompradoRepository;

    public List<CursoComprado> listarTodoCursoComprado() {
        return cursoCompradoRepository.findAll();
    }

    public CursoComprado buscarCursoCompradoPorId(Long id) {
        return cursoCompradoRepository.findById(id).orElse(null);
    }

    public CursoComprado salvarCursoComprado(CursoComprado cursoComprado) {
        return cursoCompradoRepository.save(cursoComprado);
    }

    public void deletarCursoComprado(Long id) {
        cursoCompradoRepository.deleteById(id);
    }
}
