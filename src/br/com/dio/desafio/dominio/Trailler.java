package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Trailler extends Conteudo{

    LocalDate data;

    public Trailler() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Trailler{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + getData() +
                '}';
    }
}
