import br.com.dio.desafio.dominio.Filme;
import br.com.dio.desafio.dominio.Trailler;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.setTitulo("Avatar");
        filme1.setSinopse("Ação e aventura aclamada pelo publico, onde um paralitica viaja para um mundo no corpo de um avatar, possibilitando coisas empolgantes e grandes responsabilidades.");
        filme1.setCargaHoraria(150);
        System.out.println(filme1);

        Trailler mentoria = new Trailler();

        mentoria.setTitulo("Trailler de Avatar!");
        mentoria.setDescricao("Ficção científica/Ação");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}