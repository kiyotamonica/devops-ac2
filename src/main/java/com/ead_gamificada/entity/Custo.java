package com.ead_gamificada.entity;

import java.util.Objects;
import jakarta.persistence.Embeddable;

@Embeddable
public class Custo {
	private Double valor;

    protected Custo() {
    
    }

    public Custo(Double valor) {
        if (valor == null || valor < 0) {
            throw new IllegalArgumentException("O custo sempre deve ser um valor positivo.");
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
        Custo custo = (Custo) o;
        return Objects.equals(valor, custo.valor);
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
