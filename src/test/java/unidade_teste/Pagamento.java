package unidade_teste;

public class Pagamento {

	private boolean valido;
	
	public void validar(Aluno aluno) {
		// Considerando que o valor do pacote é 50
        if (aluno.getSaldo() >= 50) {
            this.valido = true;
            aluno.adicionaSaldo(-50);
        } else {
            this.valido = false;
        }
	}
	

	public boolean getValido(Aluno aluno) {
		return this.valido;
	}
}