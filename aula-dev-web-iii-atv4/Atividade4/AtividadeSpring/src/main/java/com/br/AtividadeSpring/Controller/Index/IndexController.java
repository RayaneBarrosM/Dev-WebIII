package com.br.AtividadeSpring.Controller.Index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/info")
    public String index() {
        return "index";
    }
}