package dio.springbootscope;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dio.springbootscope.app.SistemaMensagem;

@SpringBootApplication
public class ConhecendoSpringBootScopeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConhecendoSpringBootScopeApplication.class, args);
	}
	
		@Bean
		public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
			return args -> {
				sistema.enviarConfirmacaoCadastro();
				sistema.enviarMensagemBoasVindas();
				sistema.enviarConfirmacaoCadastro();
			};
		}

}
