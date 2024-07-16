package com.github.pabloperalta94.challenge_literatura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.github.pabloperalta94.challenge_literatura.libreria.Libreria;
import com.github.pabloperalta94.challenge_literatura.repository.iAutorRepository;
import com.github.pabloperalta94.challenge_literatura.repository.iLibroRepository;

@SpringBootApplication
public class ChallengeLiteraturaApplication implements CommandLineRunner {

	@Autowired
	private iLibroRepository libroRepository;
	@Autowired
	private iAutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeLiteraturaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Libreria libreria = new Libreria(libroRepository, autorRepository);
		libreria.consumo();

	}
}
