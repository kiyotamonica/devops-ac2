/*package com.example.ead_gamificada.controller.test;

import com.ead_gamificada.controller.CursoController;
import com.ead_gamificada.entity.Curso;
import com.ead_gamificada.service.CursoService;
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

@WebMvcTest(CursoController.class)
public class CursoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CursoService cursoService;

    @Test
    public void testListarTodosCursos() throws Exception {
        // Mock do serviço
        Curso curso = new Curso();
        curso.setId(1L);
        curso.setNome("Curso de Java");

        List<Curso> cursos = List.of(curso);
        Mockito.when(cursoService.listarTodosCursos()).thenReturn(cursos);

        // Realiza a requisição e verifica a resposta
        mockMvc.perform(MockMvcRequestBuilders.get("/cursos")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nome").value("Curso de Java"));
    }

    @Test
    public void testBuscarCursoPorId() throws Exception {
        // Mock do serviço
        Curso curso = new Curso();
        curso.setId(1L);
        curso.setNome("Curso de Java");

        Mockito.when(cursoService.buscarCursoPorId(1L)).thenReturn(curso);

        // Realiza a requisição e verifica a resposta
        mockMvc.perform(MockMvcRequestBuilders.get("/cursos/1")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nome").value("Curso de Java"));
    }

    @Test
    public void testSalvarCurso() throws Exception {
        // Mock do serviço
        Curso curso = new Curso();
        curso.setId(1L);
        curso.setNome("Curso de Java");

        Mockito.when(cursoService.salvarCurso(Mockito.any(Curso.class))).thenReturn(curso);

        // Realiza a requisição e verifica a resposta
        mockMvc.perform(MockMvcRequestBuilders.post("/cursos")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"nome\": \"Curso de Java\"}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.nome").value("Curso de Java"));
    }

    @Test
    public void testDeletarCurso() throws Exception {
        // Realiza a requisição e verifica a resposta
        mockMvc.perform(MockMvcRequestBuilders.delete("/cursos/1"))
                .andExpect(status().isNoContent());
    }
}*/
