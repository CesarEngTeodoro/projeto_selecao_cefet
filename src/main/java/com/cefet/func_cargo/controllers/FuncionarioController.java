package com.cefet.func_cargo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cefet.func_cargo.entities.Funcionario;
import com.cefet.func_cargo.repositories.FuncionarioRepository;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioController {
	
	@Autowired // Injeção de dependências, para não precisar instanciar, usando new
	private FuncionarioRepository funcionarioRepository;
	
	
	@GetMapping  // Verbo HTTP que retorna a Lista
	public List<Funcionario> findAll(){		
		List<Funcionario> result = funcionarioRepository.findAll();
		return result;
		
	}

}
