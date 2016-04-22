package br.com.tmsfasdom.contollers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.tmsfasdom.modelo.Transferencia;
import br.com.tmsfasdom.services.TransferenciaService;

@Controller
public class mainController {

	@Autowired
	TransferenciaService transferenciaService;

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		return "index";
	}

	@Transactional
	@RequestMapping(value = { "/transferencia" }, method = RequestMethod.GET)
	public String testTansferencia(ModelMap model) {
		String header_lote = "00100011C2011020 2075265570004520001213190126     TS0307080000002100061 TESTE IED - PAGAMENTOS                                 030020112052201                              00000                                                               ";
		String linha_A = "0010001300001O00085840500223362035912011106010000100018554679SECRETARIA DE ESTADO DE FAZEND06112014061120140000050022373622001049786          00000000000000000000                                                                    ACAJAP    ";
		String linha_Z = "";
		String linha_B = "";

		Transferencia transf = new Transferencia(header_lote, linha_A);
		transferenciaService.save(transf);

		return "index";
	}

}
