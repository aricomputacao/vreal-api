package com.asolucao.vrealapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asolucao.vrealapi.model.Lancamento;
import com.asolucao.vrealapi.model.Pessoa;
import com.asolucao.vrealapi.repository.LancamentoRepository;
import com.asolucao.vrealapi.repository.PessoaRepository;
import com.asolucao.vrealapi.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired 
	private LancamentoRepository lancamentoRepository;

	public Lancamento salvar(Lancamento lancamento) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(lancamento.getPessoa().getId());
		if (!pessoa.isPresent() || pessoa.get().isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}		
		return lancamentoRepository.save(lancamento);
	}
	
}
