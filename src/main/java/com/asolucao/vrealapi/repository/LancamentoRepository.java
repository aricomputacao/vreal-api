package com.asolucao.vrealapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asolucao.vrealapi.model.Lancamento;
import com.asolucao.vrealapi.repository.lancamento.LancamentoRepositoryQuery;


public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

}
