package com.asolucao.vrealapi.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.asolucao.vrealapi.model.Lancamento;
import com.asolucao.vrealapi.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter,Pageable pageable);

}
