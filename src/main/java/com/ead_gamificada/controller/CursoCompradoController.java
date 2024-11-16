package com.ead_gamificada.controller;


import com.ead_gamificada.entity.CursoComprado;
import com.ead_gamificada.service.CursoCompradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso-comprado")
public class CursoCompradoController {

    @Autowired
    private CursoCompradoService cursoCompradoService;

    @GetMapping
    public List<CursoComprado> listarTodoCursoComprado() {
        return cursoCompradoService.listarTodoCursoComprado();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CursoComprado> buscarCursoCompradoPorId(@PathVariable Long id) {
        CursoComprado cursoComprado = cursoCompradoService.buscarCursoCompradoPorId(id);
        return cursoComprado != null ? ResponseEntity.ok(cursoComprado) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<CursoComprado> salvarCursoComprado(@RequestBody CursoComprado cursoComprado) {
        CursoComprado novoCursoComprado = cursoCompradoService.salvarCursoComprado(cursoComprado);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCursoComprado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCursoComprado(@PathVariable Long id) {
        cursoCompradoService.deletarCursoComprado(id);
        return ResponseEntity.noContent().build();
    }
}
