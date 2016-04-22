package br.com.tmsfasdom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.tmsfasdom.dao.TransferenciaDaoImpl;
import br.com.tmsfasdom.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements TransferenciaService {

	

	private TransferenciaDaoImpl transferenciaDaoImpl;

	@Autowired
	public TransferenciaServiceImpl(TransferenciaDaoImpl transferenciaDaoImpl) {
		this.transferenciaDaoImpl = transferenciaDaoImpl;
	}

	
	@Transactional
	public void save(Transferencia transferencia) {
		transferenciaDaoImpl.save(transferencia);	
	}

	@Transactional
	public void update(Transferencia transferencia) {
		transferenciaDaoImpl.update(transferencia);
	}

	@Transactional
	public void delete(int transferenciaId) {
		transferenciaDaoImpl.delete(transferenciaId);
	}

	@Transactional
	public Transferencia getTransferencia(int transferenciaId) {
		return transferenciaDaoImpl.getEntity(transferenciaId);
	}

	@Transactional
	public List<Transferencia> getAllTransferencia() {
		return transferenciaDaoImpl.getAll();
	}

}
