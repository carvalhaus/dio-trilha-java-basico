import java.time.LocalDate;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
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


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1.toString());

        
    }
}
