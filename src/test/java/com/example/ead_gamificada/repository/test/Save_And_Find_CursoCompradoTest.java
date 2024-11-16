/*package com.example.ead_gamificada.repository.test;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ead_gamificada.repository.AlunoRepository;
import com.ead_gamificada.repository.CursoCompradoRepository;
import com.ead_gamificada.repository.CursoRepository;
import com.ead_gamificada.entity.Aluno;
import com.ead_gamificada.entity.Curso;
import com.ead_gamificada.entity.CursoComprado;
import com.ead_gamificada.entity.Custo;
import com.ead_gamificada.entity.Email;
import com.ead_gamificada.entity.Pagamento;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@DataJpaTest
public class Save_And_Find_CursoCompradoTest {
    @Autowired
    private CursoCompradoRepository cursoCompradoRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Test
    public void testSaveAndFindCursoComprado() {
        Aluno aluno = new Aluno();
        aluno.setNome("Tambelli");
        aluno.setEmail(new Email("tambelli@facens.com"));
        aluno = alunoRepository.save(aluno);

        Curso curso = new Curso();
        curso.setNome("Sobrevivendo à Engenharia de Computação 2.0");
        curso.setCusto(new Custo(300.0));
        curso = cursoRepository.save(curso);

        CursoComprado cursoComprado = new CursoComprado();
        cursoComprado.setAluno(aluno);
        cursoComprado.setCurso(curso);
        cursoComprado.setPagamento(new Pagamento(300.0));

        CursoComprado savedCursoComprado = cursoCompradoRepository.save(cursoComprado);
        assertNotNull(savedCursoComprado.getId());

        Optional<CursoComprado> retrievedCursoComprado = cursoCompradoRepository.findById(savedCursoComprado.getId());
        assertThat(retrievedCursoComprado).isPresent();
        assertThat(retrievedCursoComprado.get().getAluno().getNome()).isEqualTo("Tambelli");
        assertThat(retrievedCursoComprado.get().getCurso().getNome()).isEqualTo("Sobrevivendo à Engenharia de Computação 2.0");
    }
}*/
