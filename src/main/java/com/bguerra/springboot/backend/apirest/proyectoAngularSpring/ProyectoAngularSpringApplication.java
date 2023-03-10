package com.bguerra.springboot.backend.apirest.proyectoAngularSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ProyectoAngularSpringApplication implements CommandLineRunner {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoAngularSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			String password = "12345";
			for (int i = 0; i < 4; i++){
				String passwordBcrypt = passwordEncoder.encode(password);
				System.out.println(passwordBcrypt);
			}
	}
}
