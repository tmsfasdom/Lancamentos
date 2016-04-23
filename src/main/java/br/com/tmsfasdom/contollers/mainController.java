package br.com.tmsfasdom.contollers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.tmsfasdom.modelo.Boleto;
import br.com.tmsfasdom.modelo.Transferencia;
import br.com.tmsfasdom.services.BoletoService;
import br.com.tmsfasdom.services.TransferenciaService;

@Controller
public class mainController {

	@Autowired
	TransferenciaService transferenciaService;


	@Autowired
	BoletoService boletoService;

	
	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		return "index";
	}

	@Transactional
	@RequestMapping(value = { "/transferencia" }, method = RequestMethod.GET)
	public String testTansferencia(ModelMap model) {
		String header_lote = "00100011C2001020 2075265570001000009839280126       0307080000002100819 AMBEV S.A                                              030020012000930                              00000                                                               ";
		String linha_A = "0010001300001A0000000010282660000000391018 LINO OSVALDO COMERCIO REPRES. 2000117550          03022014BRL0000000000000000000000017115660000000000258212273703022014000000001711566                                        0 0          00        ";
		String linha_Z = "0010001300003Z                                                                70FFFCC36BA8FE12                                                                                                                                        00        ";
		String linha_B = "0010001300002B   141623455000140                                                                                                                                                                                                                ";

		Transferencia transf = new Transferencia(header_lote, linha_A, linha_B, linha_Z);
		
		
		transferenciaService.save(transf);

		return "index";
	}

	@Transactional
	@RequestMapping(value = { "/boleto" }, method = RequestMethod.GET)
	public String testBoleto(ModelMap model) {
		String header_lote = "00100011C2030020 2075265570001000009839280126     TS0307080000002100037 TESTE IED - PAGAMENTOS                                 030020302052200                              00000                                                               ";
		String linha_J = "0010001300001J00000197626400018946670000002409802000001512718J FLEURY  ASSESSORIA E CONSULT01122014000000001894667000000000000000000000000000000061120140000000018946670000000000000002001049785                                      00        ";
		String linha_J52 = String.format("%240s"," ");
		String linha_Z = String.format("%240s"," ");

		Boleto bol = new Boleto(header_lote, linha_J, linha_J52, linha_Z);
				
		boletoService.save(bol);
		
		return "index";

	}	
}
