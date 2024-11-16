package entity_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.ead_gamificada.entity.Curso;
import com.ead_gamificada.entity.Custo;

public class CursoTest {
    @Test
    void testSetAndGetValidCusto() {
        Curso curso = new Curso();
        Custo custo = new Custo(100.0);
        curso.setCusto(custo);

        assertEquals(custo, curso.getCusto());
    }

    @Test
    void testInvalidCustoThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Custo(-10.0);
        });
    }
}
