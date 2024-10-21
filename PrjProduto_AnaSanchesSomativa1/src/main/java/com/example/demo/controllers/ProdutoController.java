package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Produto;
import com.example.demo.services.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	private final ProdutoService produtoservice;
	
	@Autowired
	public ProdutoController(ProdutoService produtoservice) {
		this.produtoservice = produtoservice;
	}
	
	@PostMapping
	public Produto createServico(@RequestBody Produto produto) {
		return produtoservice.saveProduto(produto);
	}
	
	// taz todos os registros
	@GetMapping
	public List<Produto> getProdutoAll(){
		return produtoservice.getAllProduto();
	}

	// traz somente o objeto especifico pelo id
	@GetMapping("/{id}")
	public Produto getProduto(@PathVariable Long id) {
		return produtoservice.getProdutoById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable Long id) {
		produtoservice.deleteProduto(id);
	}
}
