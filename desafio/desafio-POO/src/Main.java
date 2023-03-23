import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Neste curso você irá adquirir conhecimentos sobre a linguagem de programação Java!");
        curso1.setCargaHoraria(140);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Neste curso você irá adquirir conhecimentos sobre a linguagem de programação Python!");
        curso2.setCargaHoraria(120);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria sobre métodos ágeis");
        mentoria1.setDescricao("Nesta mentoria você estudar a importância de métodos ágeis.");
        mentoria1.setData(LocalDate.now());


        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria1.toString());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprendizado básico de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJoaoPedro = new Dev();
        devJoaoPedro.setNome("João Pedro");
        devJoaoPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de João Pedro " + devJoaoPedro.getConteudosInscritos());
        devJoaoPedro.progredir();
        System.out.println("Conteúdos concluídos de João Pedro " + devJoaoPedro.getConteudosConcluidos());
        System.out.println("XP: " + devJoaoPedro.calcularTotalXP());

        Dev devOscar = new Dev();
        devOscar.setNome("Oscar");
        devOscar.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos de Oscar " + devOscar.getConteudosInscritos());
        devOscar.progredir();
        System.out.println("Conteúdos concluídos de Oscar " + devOscar.getConteudosConcluidos());
        System.out.println("XP: " + devOscar.calcularTotalXP());


    }
}
