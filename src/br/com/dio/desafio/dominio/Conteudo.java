package br.com.dio.desafio.dominio;

import com.sun.source.tree.UsesTree;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Conteudo {
    protected static final Double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(1);
    private Set<User> userIncritos = new HashSet<>();
    private Set<Conteudo> conteudo = new LinkedHashSet<>();

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<User> getUserIncritos() {
        return userIncritos;
    }

    public void setUserIncritos(Set<User> userIncritos) {
        this.userIncritos = userIncritos;
    }

    public Set<Conteudo> getConteudo() {
        return conteudo;
    }

    public void setConteudo(Set<Conteudo> conteudo) {
        this.conteudo = conteudo;
    }
}
