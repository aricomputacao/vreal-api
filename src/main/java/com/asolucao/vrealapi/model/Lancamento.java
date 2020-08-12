package com.asolucao.vrealapi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "lancamento",schema = "movimentacao")
public class Lancamento implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lan_id",nullable = false)
	private Long id;
	
	@NotEmpty
	@Column(name = "lan_descricao",nullable = false)
	private String descricao;
	
//	@JsonFormat(pattern =  "dd/MM/yyyy")
	@NotNull
	@Column(name = "lan_data_vencimento",nullable = false)
	private LocalDate dataVencimento;
	
//	@JsonFormat(pattern =  "dd/MM/yyyy")
	@Column(name = "lan_data_pagamento")
	private LocalDate dataPagamento;
	
	
	@NotNull
	@Min(value = 0)
	@Column(name = "lan_valor",nullable = false)
	private BigDecimal valor;
	
	@Column(name = "lan_observacao")
	private String observacao;
	
	@NotNull
	@Column(name = "lan_tipo_lancamento",nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoLancamento tipoLancamento;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "cat_id",referencedColumnName = "cat_id",nullable = false,updatable = false )
	private Categoria categoria;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "pes_id",referencedColumnName = "pes_id",nullable = false,updatable = false )
	private Pessoa pessoa;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public TipoLancamento getTipoLancamento() {
		return tipoLancamento;
	}

	public void setTipoLancamento(TipoLancamento tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lancamento other = (Lancamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
}
