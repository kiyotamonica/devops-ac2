/*package com.example.ead_gamificada.repository.test;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ead_gamificada.repository.AlunoRepository;
import com.ead_gamificada.entity.Aluno;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@DataJpaTest
public class Save_And_Find_AlunoTest {
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Test
	public void testSaveAndFindAluno() {
		// Cria um novo usuário
        Aluno aluno = new Aluno();
        aluno.setNome("Alessandro");
        
        // Salva no banco de dados
        Aluno savedAluno = alunoRepository.save(aluno);
        assertNotNull(savedAluno.getId());
        
        // Busca o usuário pelo ID
        Optional<Aluno> retrievedAluno = alunoRepository.findById(savedAluno.getId());
        assertThat(retrievedAluno).isPresent();
        assertThat(retrievedAluno.get().getNome()).isEqualTo("Alessandro");
	}
}
*/