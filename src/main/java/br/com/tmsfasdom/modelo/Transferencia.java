package br.com.tmsfasdom.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@Table(name="Transferencia")
public class Transferencia extends Lancamento {

	public static final String tableName = "Transferencia";
	String codigo_camara_centralizadora;
	String codigo_banco_favorecido;
	String agencia_conta_favorecido;
	String dv_agencia_conta_favorecido;
	String conta_favorecido;
	String dv_conta_favorecido;
	String nome_favorecido;
	String data_real_pagamento;
	String valor_real_pagamento;
	String tipo_inscricao_favorecido;
	String numero_inscricao_favorecido;
	String id_deposito_judicial;

	public Transferencia(String header_lote, String linha_A) {

		setNumero_agencia(header_lote.substring(53, 57));
		setDv_agencia(header_lote.substring(58, 59));
		setNumero_conta(header_lote.substring(59, 70));
		setDv_conta(header_lote.substring(71, 72));
		setCnpj(header_lote.substring(19, 32));
		setConvenio(header_lote.substring(33, 52));
		setTipo_servico(header_lote.substring(10, 11));
		setForma_lancamento(header_lote.substring(12, 13));
		setCodigo_ocorrencia(linha_A.substring(231, 240));
		setNumero_documento(linha_A.substring(74, 93));
		setData_pagamento(linha_A.substring(94, 101));
		setValor_pagamento(linha_A.substring(120, 134));
		setCodigo_camara_centralizadora(linha_A.substring(18, 20));
		setCodigo_banco_favorecido(linha_A.substring(21, 23));
		setAgencia_conta_favorecido(linha_A.substring(24, 28));
		setDv_agencia_conta_favorecido(linha_A.substring(29));
		setConta_favorecido(linha_A.substring(30, 41));
		setDv_conta_favorecido(linha_A.substring(42, 43));
		setNome_favorecido(linha_A.substring(44, 73));
		setData_real_pagamento(linha_A.substring(155, 162));
		setValor_real_pagamento(linha_A.substring(163, 177));
		setId_deposito_judicial(linha_A.substring(178, 217));
	}

	public Transferencia(String header_lote, String linha_A, String linha_B_ou_Z) {

		setNumero_agencia(header_lote.substring(53, 57));
		setDv_agencia(header_lote.substring(58, 59));
		setNumero_conta(header_lote.substring(59, 70));
		setDv_conta(header_lote.substring(71, 72));
		setCnpj(header_lote.substring(19, 32));
		setConvenio(header_lote.substring(33, 52));
		setTipo_servico(header_lote.substring(10, 11));
		setForma_lancamento(header_lote.substring(12, 13));
		setCodigo_ocorrencia(linha_A.substring(231, 240));
		setNumero_documento(linha_A.substring(74, 93));
		setData_pagamento(linha_A.substring(94, 101));
		setValor_pagamento(linha_A.substring(120, 134));
		setCodigo_camara_centralizadora(linha_A.substring(18, 20));
		setCodigo_banco_favorecido(linha_A.substring(21, 23));
		setAgencia_conta_favorecido(linha_A.substring(24, 28));
		setDv_agencia_conta_favorecido(linha_A.substring(29));
		setConta_favorecido(linha_A.substring(30, 41));
		setDv_conta_favorecido(linha_A.substring(42, 43));
		setNome_favorecido(linha_A.substring(44, 73));
		setData_real_pagamento(linha_A.substring(155, 162));
		setValor_real_pagamento(linha_A.substring(163, 177));
		setId_deposito_judicial(linha_A.substring(178, 217));

		if (linha_B_ou_Z.substring(14, 15).contentEquals("B")) {
			setTipo_inscricao_favorecido(linha_B_ou_Z.substring(18, 19));
			setNumero_inscricao_favorecido(linha_B_ou_Z.substring(19, 32));
		}

		if (linha_B_ou_Z.substring(14, 15).contentEquals("Z")) {
			setAutenticacao(linha_B_ou_Z.substring(79, 103));
		}

	}

	public Transferencia(String header_lote, String linha_A, String linha_B, String linha_Z) {
		setNumero_agencia(header_lote.substring(53, 57));
		setDv_agencia(header_lote.substring(58, 59));
		setNumero_conta(header_lote.substring(59, 70));
		setDv_conta(header_lote.substring(71, 72));
		setCnpj(header_lote.substring(19, 32));
		setConvenio(header_lote.substring(33, 52));
		setTipo_servico(header_lote.substring(10, 11));
		setForma_lancamento(header_lote.substring(12, 13));
		setCodigo_ocorrencia(linha_A.substring(231, 240));
		setNumero_documento(linha_A.substring(74, 93));
		setData_pagamento(linha_A.substring(94, 101));
		setValor_pagamento(linha_A.substring(120, 134));
		setCodigo_camara_centralizadora(linha_A.substring(18, 20));
		setCodigo_banco_favorecido(linha_A.substring(21, 23));
		setAgencia_conta_favorecido(linha_A.substring(24, 28));
		setDv_agencia_conta_favorecido(linha_A.substring(29));
		setConta_favorecido(linha_A.substring(30, 41));
		setDv_conta_favorecido(linha_A.substring(42, 43));
		setNome_favorecido(linha_A.substring(44, 73));
		setData_real_pagamento(linha_A.substring(155, 162));
		setValor_real_pagamento(linha_A.substring(163, 177));
		setId_deposito_judicial(linha_A.substring(178, 217));
		setTipo_inscricao_favorecido(linha_B.substring(18, 19));
		setNumero_inscricao_favorecido(linha_B.substring(19, 32));
		setAutenticacao(linha_Z.substring(79, 103));
		
	}

	public String getCodigo_camara_centralizadora() {
		return codigo_camara_centralizadora;
	}

	public void setCodigo_camara_centralizadora(String codigo_camara_centralizadora) {
		this.codigo_camara_centralizadora = codigo_camara_centralizadora;
	}

	public String getCodigo_banco_favorecido() {
		return codigo_banco_favorecido;
	}

	public void setCodigo_banco_favorecido(String codigo_banco_favorecido) {
		this.codigo_banco_favorecido = codigo_banco_favorecido;
	}

	public String getAgencia_conta_favorecido() {
		return agencia_conta_favorecido;
	}

	public void setAgencia_conta_favorecido(String agencia_conta_favorecido) {
		this.agencia_conta_favorecido = agencia_conta_favorecido;
	}

	public String getDv_agencia_conta_favorecido() {
		return dv_agencia_conta_favorecido;
	}

	public void setDv_agencia_conta_favorecido(String dv_agencia_conta_favorecido) {
		this.dv_agencia_conta_favorecido = dv_agencia_conta_favorecido;
	}

	public String getConta_favorecido() {
		return conta_favorecido;
	}

	public void setConta_favorecido(String conta_favorecido) {
		this.conta_favorecido = conta_favorecido;
	}

	public String getDv_conta_favorecido() {
		return dv_conta_favorecido;
	}

	public void setDv_conta_favorecido(String dv_conta_favorecido) {
		this.dv_conta_favorecido = dv_conta_favorecido;
	}

	public String getNome_favorecido() {
		return nome_favorecido;
	}

	public void setNome_favorecido(String nome_favorecido) {
		this.nome_favorecido = nome_favorecido;
	}

	public String getData_real_pagamento() {
		return data_real_pagamento;
	}

	public void setData_real_pagamento(String data_real_pagamento) {
		this.data_real_pagamento = data_real_pagamento;
	}

	public String getValor_real_pagamento() {
		return valor_real_pagamento;
	}

	public void setValor_real_pagamento(String valor_real_pagamento) {
		this.valor_real_pagamento = valor_real_pagamento;
	}

	public String getTipo_inscricao_favorecido() {
		return tipo_inscricao_favorecido;
	}

	public void setTipo_inscricao_favorecido(String tipo_inscricao_favorecido) {
		this.tipo_inscricao_favorecido = tipo_inscricao_favorecido;
	}

	public String getNumero_inscricao_favorecido() {
		return numero_inscricao_favorecido;
	}

	public void setNumero_inscricao_favorecido(String numero_inscricao_favorecido) {
		this.numero_inscricao_favorecido = numero_inscricao_favorecido;
	}

	public String getId_deposito_judicial() {
		return id_deposito_judicial;
	}

	public void setId_deposito_judicial(String id_deposito_judicial) {
		this.id_deposito_judicial = id_deposito_judicial;
	}

}
