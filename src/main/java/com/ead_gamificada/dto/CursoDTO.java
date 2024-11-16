package com.ead_gamificada.dto;

public class CursoDTO {
    private Long id;
    private String nome;
    private Double custo;
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

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public String getEmenda() {
        return emenda;
    }

    public void setEmenda(String emenda) {
        this.emenda = emenda;
    }
}
