package com.ead_gamificada.entity;

import jakarta.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Pagamento {
	private Double valor;

    protected Pagamento() {
    
    }

    public Pagamento(Double valor) {
        if (valor == null || valor < 0) {
            throw new IllegalArgumentException("O pagamento sempre deve ser um valor positivo.");
        }
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pagamento pagamento = (Pagamento) o;
        return Objects.equals(valor, pagamento.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

    @Override
    public String toString() {
        return "R$ " + String.format("%.2f", valor);
    }
}
