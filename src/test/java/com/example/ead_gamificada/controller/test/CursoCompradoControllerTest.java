/*package com.example.ead_gamificada.controller.test;


import com.ead_gamificada.controller.CursoCompradoController;
import com.ead_gamificada.entity.CursoComprado;
import com.ead_gamificada.entity.Aluno;
import com.ead_gamificada.entity.Curso;
import com.ead_gamificada.entity.Pagamento;
import com.ead_gamificada.service.CursoCompradoService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(CursoCompradoController.class)
public class CursoCompradoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CursoCompradoService cursoCompradoService;

    @Test
    public void testListarTodoCursoComprado() throws Exception {
        // Mock do serviço
        Aluno aluno = new Aluno();
        aluno.setId(1L);
        aluno.setNome("João");

        Curso curso = new Curso();
        curso.setId(1L);
        curso.setNome("Curso de Java");

        CursoComprado cursoComprado = new CursoComprado();
        cursoComprado.setId(1L);
        cursoComprado.setAluno(aluno);
        cursoComprado.setCurso(curso);
        cursoComprado.setPagamento(new Pagamento(250.0));

        List<CursoComprado> cursos = List.of(cursoComprado);
        Mockito.when(cursoCompradoService.listarTodoCursoComprado()).thenReturn(cursos);

        // Realiza a requisição e verifica a resposta
        mockMvc.perform(MockMvcRequestBuilders.get("/curso-comprado")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].aluno.nome").value("João"))
                .andExpect(jsonPath("$[0].curso.nome").value("Curso de Java"))
                .andExpect(jsonPath("$[0].pagamento.valor").value(250.0));
    }

    @Test
    public void testBuscarCursoCompradoPorId() throws Exception {
        // Mock do serviço
        Aluno aluno = new Aluno();
        aluno.setId(1L);
        aluno.setNome("João");

        Curso curso = new Curso();
        curso.setId(1L);
        curso.setNome("Curso de Java");

        CursoComprado cursoComprado = new CursoComprado();
        cursoComprado.setId(1L);
        cursoComprado.setAluno(aluno);
        cursoComprado.setCurso(curso);
        cursoComprado.setPagamento(new Pagamento(250.0));

        Mockito.when(cursoCompradoService.buscarCursoCompradoPorId(1L)).thenReturn(cursoComprado);

        // Realiza a requisição e verifica a resposta
        mockMvc.perform(MockMvcRequestBuilders.get("/curso-comprado/1")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.aluno.nome").value("João"))
                .andExpect(jsonPath("$.curso.nome").value("Curso de Java"))
                .andExpect(jsonPath("$.pagamento.valor").value(250.0));
    }

    @Test
    public void testSalvarCursoComprado() throws Exception {
        // Mock do serviço
        Aluno aluno = new Aluno();
        aluno.setId(1L);
        aluno.setNome("João");

        Curso curso = new Curso();
        curso.setId(1L);
        curso.setNome("Curso de Java");

        CursoComprado cursoComprado = new CursoComprado();
        cursoComprado.setAluno(aluno);
        cursoComprado.setCurso(curso);
        cursoComprado.setPagamento(new Pagamento(250.0));

        Mockito.when(cursoCompradoService.salvarCursoComprado(Mockito.any(CursoComprado.class))).thenReturn(cursoComprado);

        // Realiza a requisição e verifica a resposta
        mockMvc.perform(MockMvcRequestBuilders.post("/curso-comprado")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"aluno\": {\"id\": 1}, \"curso\": {\"id\": 1}, \"pagamento\": {\"valor\": 250.0}}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.aluno.id").value(1))
                .andExpect(jsonPath("$.curso.id").value(1))
                .andExpect(jsonPath("$.pagamento.valor").value(250.0));
    }

    @Test
    public void testDeletarCursoComprado() throws Exception {
        // Realiza a requisição e verifica a resposta
        mockMvc.perform(MockMvcRequestBuilders.delete("/curso-comprado/1"))
                .andExpect(status().isNoContent());
    }
}*/
