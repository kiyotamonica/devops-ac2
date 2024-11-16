package unidade_teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PagamentoTest {
	private Pagamento pagamento;
	private Acesso acesso;
	private Aluno alessandro;
	
	@BeforeEach
	public void RealizaPagamento(){
		
		this.pagamento = new Pagamento();		
		this.alessandro = new Aluno();
		this.acesso = new Acesso();
			
	}
	
	@Test
    public void pagamentoFoiAprovadoTest() {
        alessandro.adicionaSaldo(50);
        pagamento.validar(alessandro);
        
        assertEquals(true, pagamento.getValido(alessandro));
    }
    
    @Test
    public void acessoAprovadoTest() {
        alessandro.adicionaSaldo(50);
        pagamento.validar(alessandro);
        acesso.validar(alessandro, pagamento);
        
        assertEquals(true, acesso.getValido(alessandro));
    }
    
    @Test
    public void pagamentoFoiReprovadoTest() {
        alessandro.adicionaSaldo(5);
        pagamento.validar(alessandro);
        
        assertEquals(false, pagamento.getValido(alessandro));
    }
    
    @Test
    public void acessoNegadoTest() {
        alessandro.adicionaSaldo(5);
        pagamento.validar(alessandro);
        acesso.validar(alessandro, pagamento);
        
        assertEquals(false, acesso.getValido(alessandro));
    }
	
}
