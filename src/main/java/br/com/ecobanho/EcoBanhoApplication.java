package br.com.ecobanho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EcoBanhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcoBanhoApplication.class, args);
	}
}
