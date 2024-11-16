package com.ead_gamificada.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Embedded;

@Entity
@Table(name = "tb_curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    
    @Embedded
    private Custo custo;
    
    private String emenda;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Custo getCusto() {
        return custo;
    }

    public void setCusto(Custo custo) {
        this.custo = custo;
    }

    public String getEmenda() {
        return emenda;
    }

    public void setEmenda(String emenda) {
        this.emenda = emenda;
    }
}