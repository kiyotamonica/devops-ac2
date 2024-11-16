package unidade_teste;

public class Aluno {
	
	private double saldo;
	
	public Aluno() {
        this.saldo = 0;
    }

	public void adicionaSaldo(double valor) {
		this.saldo += valor;
		
	}
	
	public double getSaldo() {
        return this.saldo;
    }
}