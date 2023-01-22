package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class User {
    private String name;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

        public void increverFilme(Filme conteudo){
        this.conteudoInscritos.addAll(conteudo.getConteudo());
        conteudo.getUserIncritos().add(this);

    }
    public void progresso(){
        Optional<Conteudo> progresso = this.conteudoInscritos.stream().findFirst();
        if (progresso.isPresent()){
            this.conteudoInscritos.add(progresso.get());
            this.conteudoInscritos.remove(progresso.get());
        } else {
            System.err.println("Você não iniciou nenhum conteudo, começe agora assistir");
        }
    }

    public  double calcularTotalXp(){
        return this.conteudoConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(conteudoInscritos, user.conteudoInscritos) && Objects.equals(conteudoConcluidos, user.conteudoConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, conteudoInscritos, conteudoConcluidos);
    }
}
