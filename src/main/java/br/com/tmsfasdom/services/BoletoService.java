package br.com.tmsfasdom.services;

import java.util.List;

import br.com.tmsfasdom.modelo.Boleto;;

public interface BoletoService {

	public void save(Boleto boleto);
	public void update(Boleto boleto);
	public void delete(int boletoID);
	public Boleto getBoleto(int boletoID);
	public List<Boleto> getAllBoleto();
	
}
