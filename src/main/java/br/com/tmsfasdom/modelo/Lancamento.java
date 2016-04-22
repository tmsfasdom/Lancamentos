package br.com.tmsfasdom.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Lancamento {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String numero_agencia;
	String dv_agencia;
	String numero_conta;
	String dv_conta;
	String cnpj;
	String convenio;
	String tipo_servico;
	String forma_lancamento;
	String autenticacao;
	String codigo_ocorrencia;
	String numero_documento;
	String data_pagamento;
	String valor_pagamento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero_agencia() {
		return numero_agencia;
	}

	public void setNumero_agencia(String numero_agencia) {
		this.numero_agencia = numero_agencia;
	}

	public String getDv_agencia() {
		return dv_agencia;
	}

	public void setDv_agencia(String dv_agencia) {
		this.dv_agencia = dv_agencia;
	}

	public String getNumero_conta() {
		return numero_conta;
	}

	public void setNumero_conta(String numero_conta) {
		this.numero_conta = numero_conta;
	}

	public String getDv_conta() {
		return dv_conta;
	}

	public void setDv_conta(String dv_conta) {
		this.dv_conta = dv_conta;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public String getTipo_servico() {
		return tipo_servico;
	}

	public void setTipo_servico(String tipo_servico) {
		this.tipo_servico = tipo_servico;
	}

	public String getForma_lancamento() {
		return forma_lancamento;
	}

	public void setForma_lancamento(String forma_lancamento) {
		this.forma_lancamento = forma_lancamento;
	}

	public String getAutenticacao() {
		return autenticacao;
	}

	public void setAutenticacao(String autenticacao) {
		this.autenticacao = autenticacao;
	}

	public String getCodigo_ocorrencia() {
		return codigo_ocorrencia;
	}

	public void setCodigo_ocorrencia(String codigo_ocorrencia) {
		this.codigo_ocorrencia = codigo_ocorrencia;
	}

	public String getNumero_documento() {
		return numero_documento;
	}

	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}

	public String getData_pagamento() {
		return data_pagamento;
	}

	public void setData_pagamento(String data_pagamento) {
		this.data_pagamento = data_pagamento;
	}

	public String getValor_pagamento() {
		return valor_pagamento;
	}

	public void setValor_pagamento(String valor_pagamento) {
		this.valor_pagamento = valor_pagamento;
	}

}
