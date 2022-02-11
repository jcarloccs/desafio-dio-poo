import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setDescricao("descrição curso Java");
        curso1.setTitulo("Curso Java");
        curso1.setCargaHoraria(2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição de mentoria de java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();
    }

}
