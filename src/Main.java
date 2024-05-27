import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java DIO");
        cursoJava.setDescricao("Breve descrição");
        cursoJava.setCargaHoraria(10);

        Curso cursoPython = new Curso();
        cursoPython.setTitulo("Curso Python");
        cursoPython.setDescricao("Um curso sobre Python");
        cursoPython.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Lógica de Programação");
        mentoria.setDescricao("Melhorar seu raciocínio lógico computacional");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Santander Java 2024");
        bootcamp.setDescricao("Uma parceria entre Santander e Digital Innovation One");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoPython);
        bootcamp.getConteudos().add(mentoria);

        Dev devFrancisco = new Dev();
        devFrancisco.setNome("Francisco");
        devFrancisco.inscreverBootcamp(bootcamp);
        devFrancisco.inscreverCurso(cursoJava);
        devFrancisco.inscreverCurso(cursoPython);
        System.out.println("Conteúdos Inscritos Francisco:" + devFrancisco.getConteudosInscritos());
        devFrancisco.progredir();
        devFrancisco.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Francisco:" + devFrancisco.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Francisco:" + devFrancisco.getConteudosConcluidos());
        System.out.println("XP:" + devFrancisco.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.inscreverMentoria(mentoria);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}