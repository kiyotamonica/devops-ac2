package com.example.ead_gamificada.entity.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.ead_gamificada.entity.Aluno;
import com.ead_gamificada.entity.Email;

public class AlunoTest {

    @Test
    void testSetAndGetValidEmail() {
        Aluno aluno = new Aluno();
        Email email = new Email("test@example.com");
        aluno.setEmail(email);

        assertEquals(email, aluno.getEmail());
    }

    @Test
    void testInvalidEmailThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Email("invalid-email");
        });
    }
}
