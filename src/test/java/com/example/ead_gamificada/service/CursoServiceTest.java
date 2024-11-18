package com.example.ead_gamificada.service;

import com.ead_gamificada.entity.Curso;
import com.ead_gamificada.entity.Custo;
import com.ead_gamificada.repository.CursoRepository;
import com.ead_gamificada.service.CursoService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CursoServiceTest {

    @Mock
    private CursoRepository cursoRepository;

    @InjectMocks
    private CursoService cursoService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    
    @Test
    void testListarTodosCursos() {
        // Configurando dados fictícios
        Curso curso1 = new Curso();
        curso1.setId(1L);
        curso1.setNome("Curso de Java");
        curso1.setCusto(new Custo(200.0));
        curso1.setEmenda("Aprenda os conceitos básicos de Java.");

        Curso curso2 = new Curso();
        curso2.setId(2L);
        curso2.setNome("Curso de Python");
        curso2.setCusto(new Custo(150.0));
        curso2.setEmenda("Introdução ao Python.");

        // Mock do repositório
        when(cursoRepository.findAll()).thenReturn(Arrays.asList(curso1, curso2));

        // Chamada ao método de serviço
        List<Curso> cursos = cursoService.listarTodosCursos();

        // Verificação dos resultados
        assertEquals(2, cursos.size());
        assertEquals("Curso de Java", cursos.get(0).getNome());
        assertEquals(200.0, cursos.get(0).getCusto().getValor());
        assertEquals("Curso de Python", cursos.get(1).getNome());
        assertEquals(150.0, cursos.get(1).getCusto().getValor());
    }
    
    @Test
    void testBuscarCursoPorId() {
        // Configurando dados fictícios
        Curso curso = new Curso();
        curso.setId(1L);
        curso.setNome("Curso de Java");
        curso.setCusto(new Custo(200.0));
        curso.setEmenda("Aprenda os conceitos básicos de Java.");

        // Mock do repositório
        when(cursoRepository.findById(1L)).thenReturn(Optional.of(curso));

        // Chamada ao método de serviço
        Curso resultado = cursoService.buscarCursoPorId(1L);

        // Verificação dos resultados
        assertNotNull(resultado);
        assertEquals("Curso de Java", resultado.getNome());
        assertEquals(200.0, resultado.getCusto().getValor());
        assertEquals("Aprenda os conceitos básicos de Java.", resultado.getEmenda());
    }
    
    @Test
    void testBuscarCursoPorIdNaoExistente() {
        // Mock do repositório
        when(cursoRepository.findById(99L)).thenReturn(Optional.empty());

        // Chamada ao método de serviço
        Curso resultado = cursoService.buscarCursoPorId(99L);

        // Verificação de retorno nulo
        assertNull(resultado);
    }
    
    void testSalvarCurso() {
        // Configurando dados fictícios
        Curso curso = new Curso();
        curso.setNome("Curso de Java");
        curso.setCusto(new Custo(200.0));
        curso.setEmenda("Aprenda os conceitos básicos de Java.");

        // Mock do repositório
        when(cursoRepository.save(curso)).thenReturn(curso);

        // Chamada ao método de serviço
        Curso resultado = cursoService.salvarCurso(curso);

        // Verificação dos resultados
        assertNotNull(resultado);
        assertEquals("Curso de Java", resultado.getNome());
        assertEquals(200.0, resultado.getCusto().getValor());
        assertEquals("Aprenda os conceitos básicos de Java.", resultado.getEmenda());
    }
    
    @Test
    void testDeletarCurso() {
        // Mock do repositório
        doNothing().when(cursoRepository).deleteById(1L);

        // Chamada ao método de serviço
        cursoService.deletarCurso(1L);

        // Verificação se o método foi chamado
        verify(cursoRepository, times(1)).deleteById(1L);
    }
}
