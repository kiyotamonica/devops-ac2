/*package com.example.ead_gamificada.controller.test;

import com.ead_gamificada.controller.AlunoController;
import com.ead_gamificada.entity.Aluno;
import com.ead_gamificada.entity.Email;
import com.ead_gamificada.service.AlunoService;
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

@WebMvcTest(AlunoController.class)
public class AlunoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AlunoService alunoService;

    @Test
    public void testListarTodosAlunos() throws Exception {
        // Mock do serviço
        Aluno aluno = new Aluno();
        aluno.setId(1L);
        aluno.setNome("João");
        aluno.setEmail(new Email("joao@example.com"));

        List<Aluno> alunos = List.of(aluno);
        Mockito.when(alunoService.listarTodosAlunos()).thenReturn(alunos);

        // Realiza a requisição e verifica a resposta
        mockMvc.perform(MockMvcRequestBuilders.get("/alunos")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nome").value("João"))
                .andExpect(jsonPath("$[0].email.address").value("joao@example.com"));
    }

    @Test
    public void testBuscarAlunoPorId() throws Exception {
        // Mock do serviço
        Aluno aluno = new Aluno();
        aluno.setId(1L);
        aluno.setNome("João");
        aluno.setEmail(new Email("joao@example.com"));

        Mockito.when(alunoService.buscarAlunoPorId(1L)).thenReturn(aluno);

        // Realiza a requisição e verifica a resposta
        mockMvc.perform(MockMvcRequestBuilders.get("/alunos/1")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nome").value("João"))
                .andExpect(jsonPath("$.email.address").value("joao@example.com"));
    }

    @Test
    public void testSalvarAluno() throws Exception {
        // Mock do serviço
        Aluno aluno = new Aluno();
        aluno.setId(1L);
        aluno.setNome("João");
        aluno.setEmail(new Email("joao@example.com"));

        Mockito.when(alunoService.salvarAluno(Mockito.any(Aluno.class))).thenReturn(aluno);

        // Realiza a requisição e verifica a resposta
        mockMvc.perform(MockMvcRequestBuilders.post("/alunos")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"nome\": \"João\", \"email\": \"joao@example.com\"}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.nome").value("João"))
                .andExpect(jsonPath("$.email.address").value("joao@example.com"));
    }

    @Test
    public void testDeletarAluno() throws Exception {
        // Realiza a requisição e verifica a resposta
        mockMvc.perform(MockMvcRequestBuilders.delete("/alunos/1"))
                .andExpect(status().isNoContent());
    }
}*/
