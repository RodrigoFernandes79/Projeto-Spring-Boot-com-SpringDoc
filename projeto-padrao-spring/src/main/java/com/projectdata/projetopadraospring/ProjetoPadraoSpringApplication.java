package com.projectdata.projetopadraospring;
//Projeto Spring Boot gerado via Spring Initializr
//Os seguintes módulos foram selecionados:
//-Spring Data Jpa;
//-Spring Web;
//- H2 Database;
// -OpenFeign
//
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class ProjetoPadraoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPadraoSpringApplication.class, args);
		
	}
}
	

	

