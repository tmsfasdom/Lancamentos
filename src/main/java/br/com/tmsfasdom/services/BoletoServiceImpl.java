package br.com.tmsfasdom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.tmsfasdom.dao.BoletoDaoImpl;
import br.com.tmsfasdom.modelo.Boleto;

@Service
public class BoletoServiceImpl implements BoletoService {

	

	private BoletoDaoImpl boletoDaoImpl;

	@Autowired
	public BoletoServiceImpl(BoletoDaoImpl boletoDaoImpl) {
		this.boletoDaoImpl = boletoDaoImpl;
	}

	
	@Transactional
	public void save(Boleto boleto) {
		boletoDaoImpl.save(boleto);	
	}

	@Transactional
	public void update(Boleto boleto) {
		boletoDaoImpl.update(boleto);
	}

	@Transactional
	public void delete(int boletoID) {
		boletoDaoImpl.delete(boletoID);
	}

	@Transactional
	public Boleto getBoleto(int boletoID) {
		return boletoDaoImpl.getEntity(boletoID);
	}

	@Transactional
	public List<Boleto> getAllBoleto() {
		return boletoDaoImpl.getAll();
	}


}
