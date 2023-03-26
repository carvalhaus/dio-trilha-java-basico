package dio.springbootpropertiesvalues.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner{
    @Value("${nome}")
    private String nome;

    @Value("${email}")
    private String email = "manoel@dio.com.br";

    @Value("${telefones}")
    private List<Long> telefones = new ArrayList<>(Arrays.asList(new Long[]{}));

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome
         + "\nE-mail: " + email
          + "\nCom telefone: " + telefones);
        System.out.println("Seu cadastro foi aprovado");
    }
}
