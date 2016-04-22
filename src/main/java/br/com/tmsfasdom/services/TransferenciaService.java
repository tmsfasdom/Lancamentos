package br.com.tmsfasdom.services;

import java.util.List;

import br.com.tmsfasdom.modelo.Transferencia;;

public interface TransferenciaService {

	public void save(Transferencia transferencia);
	public void update(Transferencia transferencia);
	public void delete(int transferenciaId);
	public Transferencia getTransferencia(int transferenciaId);
	public List<Transferencia> getAllTransferencia();
	
}
