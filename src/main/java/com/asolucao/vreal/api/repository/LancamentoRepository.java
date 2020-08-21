package com.asolucao.vreal.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asolucao.vreal.api.model.Lancamento;
import com.asolucao.vreal.api.repository.lancamento.LancamentoRepositoryQuery;


public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

}
