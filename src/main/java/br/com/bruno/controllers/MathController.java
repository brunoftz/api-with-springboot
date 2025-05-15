package br.com.bruno.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.bruno.SimpleMath;

@RestController
public class MathController {
	
	SimpleMath math = new SimpleMath();
	
	@GetMapping("/sum1/{num1}/{num2}")
	public Double sum(
			@PathVariable Double num1,
			@PathVariable Double num2
			) 
	{return math.sum(num1, num2);}
	
	@GetMapping
	public String teste() {
		return "endpoint carregado com sucesso!";
	}
}


