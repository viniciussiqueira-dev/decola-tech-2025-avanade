package me.dio.avanade_tech;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
@EntityScan("me.dio.domain.model") // Especifica onde estão as entidades
@EnableJpaRepositories("me.dio.domain.repository") // Especifica onde estão os repositórios
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
