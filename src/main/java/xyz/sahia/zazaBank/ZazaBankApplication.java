package xyz.sahia.zazaBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ZazaBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZazaBankApplication.class, args);
	}


	@Bean
	public Compte singletonCompte(){
		return new Compte();
	}
}
