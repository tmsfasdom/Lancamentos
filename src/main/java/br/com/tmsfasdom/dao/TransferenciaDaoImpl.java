package br.com.tmsfasdom.dao;

import org.springframework.stereotype.Repository;

import br.com.tmsfasdom.modelo.Transferencia;

@Repository
public class TransferenciaDaoImpl extends AbstractDao<Transferencia>{

	public TransferenciaDaoImpl() {
		super(Transferencia.class, Transferencia.tableName);
	}
	
}
