package com.cefet.func_cargo.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;


// Mapeamento da classe para tabela
@Entity
@Table(name ="tb_funcionario")
public class Funcionario {
	

	// Para que o Id do banco de dados seja autoincremetado pelo próprio BD
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	private String nome;
	private String cargo;
	private String data;
	
	//Relacionament de muitos/funcionários para um cargo/função
	@ManyToOne	
	@JoinColumn(name = "funcao_id")
	private Funcao funcao;
	
	public Funcionario() {		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}
	
		
	
}
	
	