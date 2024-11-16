/*package com.example.ead_gamificada.repository.test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.ead_gamificada.entity.Curso;
import com.ead_gamificada.entity.Custo;
import com.ead_gamificada.repository.CursoRepository;

@ActiveProfiles("test")
@DataJpaTest
public class CursoRepositoryTest {
	
    @Autowired
    private CursoRepository cursoRepository;

    @Test
    public void testSaveAndFindCurso() {
     
        Curso curso = new Curso();
        curso.setNome("Curso DevOps - Andréia Leles");
        curso.setCusto(new Custo(200.0));

        Curso savedCurso = cursoRepository.save(curso);
        assertNotNull(savedCurso.getId());

        Optional<Curso> retrievedCurso = cursoRepository.findById(savedCurso.getId());
        assertThat(retrievedCurso).isPresent();
        assertThat(retrievedCurso.get().getNome()).isEqualTo("Curso DevOps - Andréia Leles");
    }
}*/
