package com.asolucao.vreal.api.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.asolucao.vreal.api.model.Lancamento;
import com.asolucao.vreal.api.repository.filter.LancamentoFilter;
import com.asolucao.vreal.api.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter,Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter,Pageable pageable);

}
