package com.ead_gamificada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ead_gamificada.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
