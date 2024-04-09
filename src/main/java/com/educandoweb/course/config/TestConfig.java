package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

//O spring vai entender que a classe vai rodar no perfil de teste 
//por conta do arquivo application.properties

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;  //Injeção de dependência no spring (@Autowired)

	
	//Como fazer para executar isso quando o programa for iniciado
	// implementando a interface CommandLineRunner
	// Tudo que colocarmos no método RUN vai ser executado quando a aplicação
	// for iniciada
	
	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}

	
	
}
