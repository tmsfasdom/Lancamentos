package br.com.tmsfasdom.modelo;

import javax.persistence.Entity;

@Entity
public class Boleto extends Guia_Barras {

	String valor_titulo;
	String desconto_abatimento;
	String mora_multa;
	String tipo_inscricao_pagador;
	String numero_inscricao_pagador;
	String nome_pagador;
	String tipo_inscricao_beneficiario;
	String numero_inscricao_beneficiario;
	String nome_beneficiario;
	String tipo_inscricao_sacador;
	public String getValor_titulo() {
		return valor_titulo;
	}
	public void setValor_titulo(String valor_titulo) {
		this.valor_titulo = valor_titulo;
	}
	public String getDesconto_abatimento() {
		return desconto_abatimento;
	}
	public void setDesconto_abatimento(String desconto_abatimento) {
		this.desconto_abatimento = desconto_abatimento;
	}
	public String getMora_multa() {
		return mora_multa;
	}
	public void setMora_multa(String mora_multa) {
		this.mora_multa = mora_multa;
	}
	public String getTipo_inscricao_pagador() {
		return tipo_inscricao_pagador;
	}
	public void setTipo_inscricao_pagador(String tipo_inscricao_pagador) {
		this.tipo_inscricao_pagador = tipo_inscricao_pagador;
	}
	public String getNumero_inscricao_pagador() {
		return numero_inscricao_pagador;
	}
	public void setNumero_inscricao_pagador(String numero_inscricao_pagador) {
		this.numero_inscricao_pagador = numero_inscricao_pagador;
	}
	public String getNome_pagador() {
		return nome_pagador;
	}
	public void setNome_pagador(String nome_pagador) {
		this.nome_pagador = nome_pagador;
	}
	public String getTipo_inscricao_beneficiario() {
		return tipo_inscricao_beneficiario;
	}
	public void setTipo_inscricao_beneficiario(String tipo_inscricao_beneficiario) {
		this.tipo_inscricao_beneficiario = tipo_inscricao_beneficiario;
	}
	public String getNumero_inscricao_beneficiario() {
		return numero_inscricao_beneficiario;
	}
	public void setNumero_inscricao_beneficiario(String numero_inscricao_beneficiario) {
		this.numero_inscricao_beneficiario = numero_inscricao_beneficiario;
	}
	public String getNome_beneficiario() {
		return nome_beneficiario;
	}
	public void setNome_beneficiario(String nome_beneficiario) {
		this.nome_beneficiario = nome_beneficiario;
	}
	public String getTipo_inscricao_sacador() {
		return tipo_inscricao_sacador;
	}
	public void setTipo_inscricao_sacador(String tipo_inscricao_sacador) {
		this.tipo_inscricao_sacador = tipo_inscricao_sacador;
	}

	
	
}
