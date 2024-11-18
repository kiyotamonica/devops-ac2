package com.example.ead_gamificada.service;

import com.ead_gamificada.entity.Aluno;
import com.ead_gamificada.entity.Curso;
import com.ead_gamificada.entity.CursoComprado;
import com.ead_gamificada.entity.Email;
import com.ead_gamificada.entity.Pagamento;
import com.ead_gamificada.repository.CursoCompradoRepository;
import com.ead_gamificada.service.CursoCompradoService;

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

public class CursoCompradoTest {


    @Mock
    private CursoCompradoRepository cursoCompradoRepository;

    @InjectMocks
    private CursoCompradoService cursoCompradoService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testListarTodoCursoComprado() {
        // Criando objetos necessários para o teste
        Aluno aluno = new Aluno();
        aluno.setId(1L);
        aluno.setNome("João");
        aluno.setEmail(new Email("joao@example.com"));

        Curso curso = new Curso();
        curso.setId(1L);
        curso.setNome("Curso de Java");

        CursoComprado cursoComprado1 = new CursoComprado();
        cursoComprado1.setId(1L);
        cursoComprado1.setAluno(aluno);
        cursoComprado1.setCurso(curso);
        cursoComprado1.setPagamento(new Pagamento(250.0));

        CursoComprado cursoComprado2 = new CursoComprado();
        cursoComprado2.setId(2L);
        cursoComprado2.setAluno(aluno);
        cursoComprado2.setCurso(curso);
        cursoComprado2.setPagamento(new Pagamento(300.0));

        // Mock do repositório
        when(cursoCompradoRepository.findAll()).thenReturn(Arrays.asList(cursoComprado1, cursoComprado2));

        // Chamada ao método de serviço
        List<CursoComprado> cursosComprados = cursoCompradoService.listarTodoCursoComprado();

        // Verificação dos resultados
        assertEquals(2, cursosComprados.size());
        assertEquals("João", cursosComprados.get(0).getAluno().getNome());
        assertEquals("Curso de Java", cursosComprados.get(0).getCurso().getNome());
        assertEquals(250.0, cursosComprados.get(0).getPagamento().getValor());
    }

    @Test
    void testBuscarCursoCompradoPorId() {
        // Criando objetos necessários para o teste
        Aluno aluno = new Aluno();
        aluno.setId(1L);
        aluno.setNome("João");
        aluno.setEmail(new Email("joao@example.com"));

        Curso curso = new Curso();
        curso.setId(1L);
        curso.setNome("Curso de Java");

        CursoComprado cursoComprado = new CursoComprado();
        cursoComprado.setId(1L);
        cursoComprado.setAluno(aluno);
        cursoComprado.setCurso(curso);
        cursoComprado.setPagamento(new Pagamento(250.0));

        // Mock do repositório
        when(cursoCompradoRepository.findById(1L)).thenReturn(Optional.of(cursoComprado));

        // Chamada ao método de serviço
        CursoComprado resultado = cursoCompradoService.buscarCursoCompradoPorId(1L);

        // Verificação dos resultados
        assertNotNull(resultado);
        assertEquals("João", resultado.getAluno().getNome());
        assertEquals("Curso de Java", resultado.getCurso().getNome());
        assertEquals(250.0, resultado.getPagamento().getValor());
    }

    @Test
    void testSalvarCursoComprado() {
        // Criando objetos necessários para o teste
        Aluno aluno = new Aluno();
        aluno.setId(1L);
        aluno.setNome("João");
        aluno.setEmail(new Email("joao@example.com"));

        Curso curso = new Curso();
        curso.setId(1L);
        curso.setNome("Curso de Java");

        CursoComprado cursoComprado = new CursoComprado();
        cursoComprado.setAluno(aluno);
        cursoComprado.setCurso(curso);
        cursoComprado.setPagamento(new Pagamento(250.0));

        // Mock do repositório
        when(cursoCompradoRepository.save(cursoComprado)).thenReturn(cursoComprado);

        // Chamada ao método de serviço
        CursoComprado resultado = cursoCompradoService.salvarCursoComprado(cursoComprado);

        // Verificação dos resultados
        assertNotNull(resultado);
        assertEquals("João", resultado.getAluno().getNome());
        assertEquals("Curso de Java", resultado.getCurso().getNome());
        assertEquals(250.0, resultado.getPagamento().getValor());
    }

    @Test
    void testDeletarCursoComprado() {
        // Mock do repositório
        doNothing().when(cursoCompradoRepository).deleteById(1L);

        // Chamada ao método de serviço
        cursoCompradoService.deletarCursoComprado(1L);

        // Verificação se o método foi chamado
        verify(cursoCompradoRepository, times(1)).deleteById(1L);
    }
}
