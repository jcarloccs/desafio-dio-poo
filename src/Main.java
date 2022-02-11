import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "Java do básico ao avançado", 50);

        Curso curso2 = new Curso("Curso JavaScript", "JavaScript do básico ao avançado", 40);

        Mentoria mentoria1 = new Mentoria("mentoria1 de java", "Descrição de mentoria1 de java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(curso2);

        Dev devJean = new Dev("Jean");
        devJean.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devJean.getConteudosInscritos());

        devJean.progredir();
        devJean.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos" + devJean.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos" + devJean.getConteudosInscritos());
        System.out.println("XP:" + devJean.calcularTotalXp());

        System.out.println("---------");


        Dev devJoao = new Dev("João");
        devJoao.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());

        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos" + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }

}
