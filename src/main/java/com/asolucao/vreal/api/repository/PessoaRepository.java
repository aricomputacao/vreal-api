package com.asolucao.vreal.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asolucao.vreal.api.model.Pessoa;

public interface PessoaRepository  extends JpaRepository<Pessoa, Long>{

}
