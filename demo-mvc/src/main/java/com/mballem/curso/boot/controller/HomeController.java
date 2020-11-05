package com.mballem.curso.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")  // O GetMapping ira mapear o diretorio raiz depois do :8080 e retornará o que vem metodo home.
	public String home() { // Metodo que ira abri a pagina home.html
		
		return "/home";
		
	}

}
