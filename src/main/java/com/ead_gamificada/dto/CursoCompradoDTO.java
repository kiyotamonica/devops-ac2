package com.ead_gamificada.dto;

public class CursoCompradoDTO {
    private Long id;
    private Long alunoId;   // Representa o ID do Aluno
    private Long cursoId;   // Representa o ID do Curso
    private Double pagamento;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }

    public Long getCursoId() {
        return cursoId;
    }

    public void setCursoId(Long cursoId) {
        this.cursoId = cursoId;
    }

    public Double getPagamento() {
        return pagamento;
    }

    public void setPagamento(Double pagamento) {
        this.pagamento = pagamento;
    }
}
