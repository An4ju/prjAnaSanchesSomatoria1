package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // é uma entidade
@Table(name = "servico")//nomea a tabela
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tipo;
	private int valor;

	///////ID///////////
	public Long getId() {
	return id;
	}
		
	public void setId(Long id) {
	this.id = id;
	}
	
	////////tipo///////
	public String getTipo() {
	return tipo;
	}
			
	public void setTipo(String tipo) {
	this.tipo = tipo;
	}
	
	
    ///////valor//////////////////
	public int getValor() {
	return valor;
	}
					
	public void setValor(int valor) {
	this.valor = valor;
	}
	
}

