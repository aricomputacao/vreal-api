package com.asolucao.vrealapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asolucao.vrealapi.model.Pessoa;

public interface PessoaRepository  extends JpaRepository<Pessoa, Long>{

}
