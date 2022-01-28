import br.com.ceproirr.desafio.dominio.Bootcamp;
import br.com.ceproirr.desafio.dominio.Curso;
import br.com.ceproirr.desafio.dominio.Dev;
import br.com.ceproirr.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso de php");
        curso1.setDescricao("Programação PHP, HTML e CSS");
        curso1.setCargaHoraria(5);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JSP");
        curso2.setDescricao("Programa JSP e BootStrap");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de PHP");
        mentoria.setDescricao("Mentoria PHP: Gustavo Gomes");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp PHP Developer");
        bootcamp.setDescricao("Descrição Bootcamp PHP Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcos:" + devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        devMarcos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Marcos:" + devMarcos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Marcos:" + devMarcos.getConteudosConcluidos());
        System.out.println("XP:" + devMarcos.calcularTotalXp());

        System.out.println("----------------------------------------------------------------->");

        Dev devMariana = new Dev();
        devMariana.setNome("Mariana");
        devMariana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mariana:" + devMariana.getConteudosInscritos());
        devMariana.progredir();
        devMariana.progredir();
        devMariana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mariana:" + devMariana.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Mariana:" + devMariana.getConteudosConcluidos());
        System.out.println("XP:" + devMariana.calcularTotalXp());

    }

}
