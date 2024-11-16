package com.ead_gamificada.controller;
import com.ead_gamificada.entity.Curso;
import com.ead_gamificada.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> listarTodosCursos() {
        return cursoService.listarTodosCursos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> buscarCursoPorId(@PathVariable Long id) {
        Curso curso = cursoService.buscarCursoPorId(id);
        return curso != null ? ResponseEntity.ok(curso) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Curso> salvarCurso(@RequestBody Curso curso) {
        Curso novoCurso = cursoService.salvarCurso(curso);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCurso);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCurso(@PathVariable Long id) {
        cursoService.deletarCurso(id);
        return ResponseEntity.noContent().build();
    }
}