package com.api.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.api.crudspring.model.Usuario;
import com.api.crudspring.repository.UsuarioRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initeDataase(UsuarioRepository usuarioRepository) {
		return args ->  {
			usuarioRepository.deleteAll();

			Usuario teste = new Usuario();
			teste.setName("Racine fellipe");
			teste.setEmail("teste@email_miro.com.br");

			Usuario teste2 = new Usuario();
			teste2.setName("jasinto pinto");
			teste2.setEmail("teste2@email_miro.com.br");

			Usuario teste3 = new Usuario();
			teste3.setName("kiku lindo da silva");
			teste3.setEmail("teste3@email_miro.com.br");

			usuarioRepository.save(teste);
			usuarioRepository.save(teste2);
			usuarioRepository.save(teste3);

			
			

			
		};
	}
}
