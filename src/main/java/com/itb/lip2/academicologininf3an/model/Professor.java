package com.itb.lip2.academicologininf3an.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.List;

@Entity
@DiscriminatorValue(value = "Professor")
public class Professor extends Usuario {

    private int pontuacao;

    private String nivelProfissional;


    @OneToMany
    @JoinColumn(name="usuario_id")
    @JsonIgnore
    private List<Curso> cursos;


    public Professor() {


    }
    public Professor(Long id, String nome, String email, String senha, Collection<Papel> papeis) {
        super(id, nome, email, senha, papeis);  // Acesso ao construtor da classe pai
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getNivelProfissional() {
        return nivelProfissional;
    }

    public void setNivelProfissional(String nivelProfissional) {
        this.nivelProfissional = nivelProfissional;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
