/*package com.example.ead_gamificada.repository.test;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ead_gamificada.repository.CursoRepository;
import com.ead_gamificada.entity.Curso;
import com.ead_gamificada.entity.Custo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@DataJpaTest
public class Save_And_Find_CursoTest {
	@Autowired
	private CursoRepository cursoRepository;
	
	@Test
	public void testSaveAndFindCurso() {
		// Cria um novo usuário
        Curso curso = new Curso();
        curso.setNome("Curso DevOps - Andréia Leles");
        curso.setCusto(new Custo(200.0));
        
        // Salva no banco de dados
        Curso savedCurso = cursoRepository.save(curso);
        assertNotNull(savedCurso.getId());
        
        // Busca o usuário pelo ID
        Optional<Curso> retrievedCurso = cursoRepository.findById(savedCurso.getId());
        assertThat(retrievedCurso).isPresent();
        assertThat(retrievedCurso.get().getNome()).isEqualTo("Curso DevOps - Andréia Leles");
	}
}*/
