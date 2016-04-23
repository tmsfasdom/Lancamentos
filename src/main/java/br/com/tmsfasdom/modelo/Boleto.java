package br.com.tmsfasdom.modelo;

import javax.persistence.Entity;

@Entity
public class Boleto extends Guia_Barras {

	public static final String tableName = "Boleto";
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
	String numero_inscricao_sacador;
	String nome_sacador;



	public Boleto(String header_lote, String linha_J, String linha_J52, String linha_Z) {
		super();
		// metodos da super super
		setNumero_agencia(header_lote.substring(52, 57));
		setDv_agencia(header_lote.substring(57, 58));
		setNumero_conta(header_lote.substring(58, 70));
		setDv_conta(header_lote.substring(70, 71));
		setCnpj(header_lote.substring(18, 32));
		setConvenio(header_lote.substring(32, 52));
		setTipo_servico(header_lote.substring(9, 11));
		setForma_lancamento(header_lote.substring(11, 13));
		setData_pagamento(linha_J.substring(144, 152));
		setValor_pagamento(linha_J.substring(152, 167));
		setNumero_documento(linha_J.substring(182, 202));
		setCodigo_ocorrencia(linha_J.substring(230, 240));
		// metodos da super
		setCodigo_barras(linha_J.substring(17, 61));
		setNome_cedente(linha_J.substring(61, 91));
		setData_vencimento(linha_J.substring(91, 99));
		setNumero_documento_banco(linha_J.substring(202, 222));
		// metodos da classe
		setValor_titulo(linha_J.substring(99, 114));
		setDesconto_abatimento(linha_J.substring(114, 129));
		setMora_multa(linha_J.substring(129, 144));

		setTipo_inscricao_pagador(linha_J52.substring(19, 20));
		setNumero_inscricao_pagador(linha_J52.substring(20, 35));
		setNome_pagador(linha_J52.substring(36, 75));
		setTipo_inscricao_beneficiario(linha_J52.substring(75, 76));
		setNumero_inscricao_beneficiario(linha_J52.substring(76, 91));
		setNome_beneficiario(linha_J52.substring(91, 131));
		setTipo_inscricao_sacador(linha_J52.substring(131, 132));
		setNumero_inscricao_sacador(linha_J52.substring(132, 147));
		setNome_sacador(linha_J52.substring(147, 187));

		setAutenticacao(linha_Z.substring(78, 103));

	}

	public String getNome_sacador() {
		return nome_sacador;
	}

	public void setNome_sacador(String nome_sacador) {
		this.nome_sacador = nome_sacador;
	}

	public String getNumero_inscricao_sacador() {
		return numero_inscricao_sacador;
	}

	public void setNumero_inscricao_sacador(String numero_inscricao_sacador) {
		this.numero_inscricao_sacador = numero_inscricao_sacador;
	}

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
