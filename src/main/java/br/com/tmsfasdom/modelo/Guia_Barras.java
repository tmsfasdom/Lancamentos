package br.com.tmsfasdom.modelo;

import javax.persistence.Entity;

@Entity
public class Guia_Barras extends Lancamento {

	String codigo_barras;
	String nome_cedente;
	String data_vencimento;
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
