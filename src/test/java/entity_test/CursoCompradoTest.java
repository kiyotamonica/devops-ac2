package entity_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.ead_gamificada.entity.CursoComprado;
import com.ead_gamificada.entity.Pagamento;

public class CursoCompradoTest {
    @Test
    void testSetAndGetValidPagamento() {
        CursoComprado cursoComprado = new CursoComprado();
        Pagamento pagamento = new Pagamento(50.0);
        cursoComprado.setPagamento(pagamento);

        assertEquals(pagamento, cursoComprado.getPagamento());
    }

    @Test
    void testInvalidPagamentoThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Pagamento(-20.0);
        });
    }
}
