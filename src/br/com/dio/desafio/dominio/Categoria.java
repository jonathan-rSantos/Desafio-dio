package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Categoria {

    private String name;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(1); //um filme por dia
    private Set<User> UsersInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Set<User> getUsersInscritos() {
        return UsersInscritos;
    }

    public void setUsersInscritos(Set<User> usersInscritos) {
        UsersInscritos = usersInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(name, categoria.name) && Objects.equals(descricao, categoria.descricao) && Objects.equals(dataInicial, categoria.dataInicial) && Objects.equals(dataFinal, categoria.dataFinal) && Objects.equals(UsersInscritos, categoria.UsersInscritos) && Objects.equals(conteudos, categoria.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, descricao, dataInicial, dataFinal, UsersInscritos, conteudos);
    }
}
