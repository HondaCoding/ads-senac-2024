package com.example.prova;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class FuncionarioEntidade {
	
	@Id
	@GeneratedValue
	Long Id;
	String nome;
	int idade;
	
	public FuncionarioEntidade() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Long getId() {
		return Id;
	}

    public void setId(Long id) {
        this.Id = id;
    }
	
	
}
