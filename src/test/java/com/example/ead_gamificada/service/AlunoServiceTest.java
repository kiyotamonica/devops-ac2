package com.example.ead_gamificada.service;

import com.ead_gamificada.entity.Aluno;
import com.ead_gamificada.entity.Email;
import com.ead_gamificada.repository.AlunoRepository;
import com.ead_gamificada.service.AlunoService;

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

public class AlunoServiceTest {

    @Mock
    private AlunoRepository alunoRepository;

    @InjectMocks
    private AlunoService alunoService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testListarTodosAlunos() {
        // Criando objetos Aluno com Email
        Aluno aluno1 = new Aluno();
        aluno1.setId(1L);
        aluno1.setNome("João");
        aluno1.setEmail(new Email("joao@example.com"));

        Aluno aluno2 = new Aluno();
        aluno2.setId(2L);
        aluno2.setNome("Maria");
        aluno2.setEmail(new Email("maria@example.com"));

        // Mock do repositório
        when(alunoRepository.findAll()).thenReturn(Arrays.asList(aluno1, aluno2));

        // Chamada ao método de serviço
        List<Aluno> alunos = alunoService.listarTodosAlunos();

        // Verificação dos resultados
        assertEquals(2, alunos.size());
        assertEquals("João", alunos.get(0).getNome());
        assertEquals("joao@example.com", alunos.get(0).getEmail().getAddress());
        assertEquals("Maria", alunos.get(1).getNome());
        assertEquals("maria@example.com", alunos.get(1).getEmail().getAddress());
    }

    @Test
    void testBuscarAlunoPorId() {
        // Criando objeto Aluno com Email
        Aluno aluno = new Aluno();
        aluno.setId(1L);
        aluno.setNome("João");
        aluno.setEmail(new Email("joao@example.com"));

        // Mock do repositório
        when(alunoRepository.findById(1L)).thenReturn(Optional.of(aluno));

        // Chamada ao método de serviço
        Aluno resultado = alunoService.buscarAlunoPorId(1L);

        // Verificação dos resultados
        assertNotNull(resultado);
        assertEquals("João", resultado.getNome());
        assertEquals("joao@example.com", resultado.getEmail().getAddress());
    }

    @Test
    void testSalvarAluno() {
        // Criando objeto Aluno com Email
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        aluno.setEmail(new Email("joao@example.com"));

        // Mock do repositório
        when(alunoRepository.save(aluno)).thenReturn(aluno);

        // Chamada ao método de serviço
        Aluno resultado = alunoService.salvarAluno(aluno);

        // Verificação dos resultados
        assertNotNull(resultado);
        assertEquals("João", resultado.getNome());
        assertEquals("joao@example.com", resultado.getEmail().getAddress());
    }

    @Test
    void testDeletarAluno() {
        // Mock do repositório
        doNothing().when(alunoRepository).deleteById(1L);

        // Chamada ao método de serviço
        alunoService.deletarAluno(1L);

        // Verificação se o método foi chamado
        verify(alunoRepository, times(1)).deleteById(1L);
    }
}
