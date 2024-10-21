package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Servico;
import com.example.demo.repositories.ServicoRepository;

@Service
public class ServicoService {
	
	private final ServicoRepository servicorepository;
	
	@Autowired
	public ServicoService(ServicoRepository servicorepository) {
		this.servicorepository = servicorepository;
	}

	//criação do serviço
	public Servico saveServico(Servico servico) {
		return servicorepository.save(servico);
	}
	//buscar servico
	public Servico getServicoById(Long id) {
		return servicorepository.findById(id).orElse(null);
	}
	//procurar todos os serviços
	public List<Servico> getAllServico(){
		return servicorepository.findAll();
	}
	
	//excluir os servicos
	public void deleteServico(Long id) {
		servicorepository.deleteById(id);
	}
}
