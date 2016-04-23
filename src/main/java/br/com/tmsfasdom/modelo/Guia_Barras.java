package br.com.tmsfasdom.modelo;

import javax.persistence.Entity;

@Entity
public class Guia_Barras extends Lancamento {

	String codigo_barras;
	String nome_cedente;
	String data_vencimento;
	
	public Guia_Barras(){}
	

	public Guia_Barras(String header_lote, String linha_O, String linha_Z) {
		
		setNumero_agencia(header_lote.substring(52, 57));
		setDv_agencia(header_lote.substring(57, 58));
		setNumero_conta(header_lote.substring(58, 70));
		setDv_conta(header_lote.substring(70, 71));
		setCnpj(header_lote.substring(18, 32));
		setConvenio(header_lote.substring(32, 52));
		setTipo_servico(header_lote.substring(9, 11));
		setForma_lancamento(header_lote.substring(11, 13));

		setData_pagamento(linha_O.substring(99, 107));
		setValor_pagamento(linha_O.substring(107, 122));
		setNumero_documento(linha_O.substring(122, 142));
		setCodigo_ocorrencia(linha_O.substring(230, 240));
		
		// metodos da super
		setNumero_documento_banco(linha_O.substring(142, 162));
		setCodigo_barras(linha_O.substring(17, 61));
		setNome_cedente(linha_O.substring(61, 91));
		setData_vencimento(linha_O.substring(91, 99));

		setAutenticacao(linha_Z.substring(78, 103));

	}
	
	
	
	public String getCodigo_barras() {
		return codigo_barras;
	}
	public void setCodigo_barras(String codigo_barras) {
		this.codigo_barras = codigo_barras;
	}
	public String getNome_cedente() {
		return nome_cedente;
	}
	public void setNome_cedente(String nome_cedente) {
		this.nome_cedente = nome_cedente;
	}
	public String getData_vencimento() {
		return data_vencimento;
	}
	public void setData_vencimento(String data_vencimento) {
		this.data_vencimento = data_vencimento;
	}
	
	
	
}
