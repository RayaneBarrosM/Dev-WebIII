package com.br.AtividadeSpring.Controller.IMC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IMCController {

    String altura = "1.80";
    String peso = "80.0";

    double alturaDouble = Double.parseDouble(altura);
    double pesoDouble = Double.parseDouble(peso);

    double imc = pesoDouble / (alturaDouble * alturaDouble);

    @GetMapping("/imc")
    public String imc(ModelMap model) {
        model.addAttribute("altura", altura);
        model.addAttribute("peso", peso);
        model.addAttribute("imc", Math.round(imc * 100.0) / 100.0);
        return "imc";
    }

}
