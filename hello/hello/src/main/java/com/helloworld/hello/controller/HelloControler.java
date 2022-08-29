package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloControler {

	@GetMapping
	public String helloWorld() {
		return " Hello World " + " \n MENTALIDADES DE CRESCIMENTO " 
	+ " \n Orientação ao futuro " + " \n Responsabilidade pessoal "
	+ " \n Mentalidade de crescimento " + " \n Persistência " 
	+ " \n HABILIDADES" + " \n Trabalho em equipe "
	+ " \n Orientação ao detalhe " + " \n Pró-atividade "
	+ " \n Comunicação " + " \n OBJETIVOS DE APRENDIZAGEM " + " \n responsabilidade pessoal";
			
	}
	
}
