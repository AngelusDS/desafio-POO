import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAngelo = new Dev();
        devAngelo.setNome("Angelo");
        devAngelo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Angelo: " + devAngelo.getConteudosInscritos());
        devAngelo.progredir();
        devAngelo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Angelo: " + devAngelo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Angelo: " + devAngelo.getConteudosConcluidos());
        System.out.println("XP: " + devAngelo.calcularTotalXp());


        System.out.println("------");


        Dev devPriscila = new Dev();
        devPriscila.setNome("Priscila");
        devPriscila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Priscila: " + devPriscila.getConteudosInscritos());
        devPriscila.progredir();
        devPriscila.progredir();
        devPriscila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Priscila: " + devPriscila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Priscila: " + devPriscila.getConteudosConcluidos());
        System.out.println("XP: " + devPriscila.calcularTotalXp());


        System.out.println("------");


        Dev devFeca = new Dev();
        devFeca.setNome("Fábio");
        devFeca.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fábio: " + devFeca.getConteudosInscritos());
        devFeca.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Fábio: " + devFeca.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Fábio: " + devFeca.getConteudosConcluidos());
        System.out.println("XP: " + devFeca.calcularTotalXp());
    }
}