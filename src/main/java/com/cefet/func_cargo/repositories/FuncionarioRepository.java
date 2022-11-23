package com.cefet.func_cargo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cefet.func_cargo.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
