package com.jordyCa.Platzi.Cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class Saludo {
	
	@GetMapping("/hi")
	public String saludar() {
		return "Hola Mundo ";
	}
}
