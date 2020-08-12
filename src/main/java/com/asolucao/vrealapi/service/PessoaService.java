package com.asolucao.vrealapi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.asolucao.vrealapi.model.Pessoa;
import com.asolucao.vrealapi.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa atualizar(Long id, Pessoa pessoa) {
		
		Pessoa pessoalSalva = this.pessoaRepository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		
		BeanUtils.copyProperties(pessoa, pessoalSalva, "id");
		
		return this.pessoaRepository.save(pessoalSalva);
	}
	
}
