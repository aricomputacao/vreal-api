package com.asolucao.vrealapi.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	@Column(name = "end_logradouro")
	public String logradouro;
	
	@Column(name = "end_numero")
	public String numero;
	
	@Column(name = "end_complemento")
	public String complemento;

	@Column(name = "end_bairro")
	public String bairro;

	@Column(name = "end_cidade")
	public String cidade;
	
	@Column(name = "end_estado")
	public String estado;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
