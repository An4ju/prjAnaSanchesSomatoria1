package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Produto;
import com.example.demo.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	private final ProdutoRepository produtorepository;
	
	@Autowired
	public ProdutoService(ProdutoRepository produtorepository) {
		this.produtorepository = produtorepository;
	}

	//criação do produto
	public Produto saveProduto(Produto produto) {
		return produtorepository.save(produto);
	}
	//buscar produto
	public Produto getProdutoById(Long id) {
		return produtorepository.findById(id).orElse(null);
	}
	//procurar todos os produtos
	public List<Produto> getAllProduto(){
		return produtorepository.findAll();
	}
	
	//excluir os produtos
	public void deleteProduto(Long id) {
		produtorepository.deleteById(id);
	}
}
