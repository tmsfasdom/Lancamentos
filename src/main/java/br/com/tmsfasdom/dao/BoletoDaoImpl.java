package br.com.tmsfasdom.dao;

import org.springframework.stereotype.Repository;

import br.com.tmsfasdom.modelo.Boleto;

@Repository
public class BoletoDaoImpl extends AbstractDao<Boleto>{

	public BoletoDaoImpl() {
		super(Boleto.class, Boleto.tableName);
	}
	
}
