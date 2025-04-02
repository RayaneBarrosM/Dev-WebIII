    package com.br.AtividadeSpring.Controller.InfoController;

    import org.springframework.stereotype.Controller;
    import org.springframework.ui.ModelMap;
    import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class InfoController {

        @GetMapping("/info")
        public String info(ModelMap map) {
            map.addAttribute("Nome", "Guilherme Souza");
            map.addAttribute("RA", "2345678");
            return "info";
        }
    }
