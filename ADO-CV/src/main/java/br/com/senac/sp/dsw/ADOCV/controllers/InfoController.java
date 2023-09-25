package br.com.senac.sp.dsw.ADOCV.controllers;

import br.com.senac.sp.dsw.ADOCV.entities.Info;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {
    @GetMapping("/index")
    public String index(Model model) {

        Info info = new Info();
        info.setNome("Vinicius de Souza Garcia");
        info.setCargo("Data Analysis Intern");
        info.setEmail("vinicius_souzagarcia@hotmail.com");
        info.setTelefone("+55 11 97566-5047");
        info.setDataNascimento("19/05/1999");

        model.addAttribute("info", info);

        return "index";
    }
}


