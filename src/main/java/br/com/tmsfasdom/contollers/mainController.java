package br.com.tmsfasdom.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class mainController {
	
	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        return "index";
    }

}
