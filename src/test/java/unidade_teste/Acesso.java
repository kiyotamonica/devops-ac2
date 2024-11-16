package unidade_teste;

public class Acesso {

	private boolean acessoValido;
	
	public Object getValido(Aluno aluno) {
		return this.acessoValido;
	}

	public void validar(Aluno aluno, Pagamento pagamento) {
		if (pagamento.getValido(aluno)) {
            this.acessoValido = true;
        } else {
            this.acessoValido = false;
        }
		
	}

}