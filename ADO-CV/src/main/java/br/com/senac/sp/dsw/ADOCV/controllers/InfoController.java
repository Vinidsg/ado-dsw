package br.com.senac.sp.dsw.ADOCV.controllers;

import br.com.senac.sp.dsw.ADOCV.entities.Idioma;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class InfoController {
    @GetMapping("/index")
    public ModelAndView index() {

        ModelAndView mv = new ModelAndView("index");

        //Informações
        mv.addObject("nome", "Vinicius de Souza Garcia");
        mv.addObject("cargo", "Data Analysis Intern");
        mv.addObject("email", "vinicius_souzagarcia@hotmail.com");
        mv.addObject("telefone", "+55 11 97566-5047");
        mv.addObject("dataNasc", "19/05/1999");

        //Experiências
        mv.addObject("empresaAtual", "GE HealthCare");
        mv.addObject("cargoAtual", "Data Analysis Intern");
        mv.addObject("periodoAtual", "11/2022 - Atual");
        mv.addObject("localidadeAtual", "São Paulo - SP | Brasil");
        mv.addObject("descAtual", "Faço análises de grandes quantidades de dados e elaboro dashboards sob demanda no intuito " +
                "de ajudar a empresa em tomadas de decisões, trabalho no time de Business Intelligence, o que me permite usar ferramentas como Power BI " +
                "para análise de dados, Python e SQL para que todas as análises sejam realizadas da melhor e mais correta maneira possível.");

        List<String> listaDeHabilidades = new ArrayList<>();

        listaDeHabilidades.add("Power BI");
        listaDeHabilidades.add("SQL");
        listaDeHabilidades.add("Python");
        listaDeHabilidades.add("Excel e VBA");

        mv.addObject("listaDeHabilidades", listaDeHabilidades);


        mv.addObject("empresaAnterior2", "Evermart");
        mv.addObject("cargoAnterior2", "Back-End Development Intern");
        mv.addObject("periodoAnterior2", "08/2022 - 10/2022");
        mv.addObject("localidadeAnterior2", "São Paulo - SP | Brasil");
        mv.addObject("descAnterior2", "Trabalhei com desenvolvedores nível Sênior no intuito de ajudar com as tasks no dia a dia, " +
                "adquiri experiência e conhecimento prático na metodologia ágil Scrum na qual usávamos o Jira para a administração das tarefas a serem realizadas.");

        List<String> listaDeHabilidadesAnterior2 = new ArrayList<>();

        listaDeHabilidadesAnterior2.add("Jira");
        listaDeHabilidadesAnterior2.add("Scrum");
        listaDeHabilidadesAnterior2.add("PHP");
        listaDeHabilidadesAnterior2.add("MVC");

        mv.addObject("listaDeHabilidadesAnterior2", listaDeHabilidadesAnterior2);

        mv.addObject("empresaAnterior3", "Robotton Imóveis & Condomínios");
        mv.addObject("cargoAnterior3", "Analista de Departamento Pessoal");
        mv.addObject("periodoAnterior3", "08/2014 - 04/2022");
        mv.addObject("localidadeAnterior3", "São Paulo - SP | Brasil");
        mv.addObject("descAnterior3", "Atuava na folha de pagamento, realizando cálculos de horas extras mensalmente, bem como cálculo " +
                "e pagamento dos encargos trabalhistas na área de condomínios, ao todo eram cerca de 350 condomínios e mais de 2 mil funcionários. " +
                "Fazia as entregas ao eSocial da folha de pagamento mensalmente, e também realizava estudo de contratações, demissões e reduções de horas extras" +
                " aos condomínios.");

        List<String> listaDeHabilidadesAnterior3 = new ArrayList<>();

        listaDeHabilidadesAnterior3.add("Pensamento Analítico");
        listaDeHabilidadesAnterior3.add("Resolução de Problemas");
        listaDeHabilidadesAnterior3.add("Capacidade Analítica");
        listaDeHabilidadesAnterior3.add("Comunicação");

        mv.addObject("listaDeHabilidadesAnterior3", listaDeHabilidadesAnterior3);

        return mv;
    }

    @GetMapping("/index2")
    public ModelAndView index2() {

        ModelAndView mv = new ModelAndView("index2");

        //Informações
        mv.addObject("nome", "Vinicius de Souza Garcia");
        mv.addObject("cargo", "Data Analysis Intern");
        mv.addObject("email", "vinicius_souzagarcia@hotmail.com");
        mv.addObject("telefone", "+55 11 97566-5047");
        mv.addObject("dataNasc", "19/05/1999");

        //Acadêmico
        mv.addObject("universidade", "Centro Universitário Senac");
        mv.addObject("curso", "Análise e Desenvolvimento de Sistemas");
        mv.addObject("periodo", "Cursando 04º período");
        mv.addObject("localidade", "São Paulo - SP | Brasil");
        mv.addObject("descCurso", "Desde que iniciei a faculdade, adquiri muitos conhecimentos como Algoritmos e Programação, Banco\n" +
                "                    de Dados, SQL, Programação Orientada a Objetos, Programação WEB, Estrutura de Dados, Engenharia\n" +
                "                    de Software, além de colocar em prática em todos os projetos integradores de cada semestre.");

        List<String> listaDeSkills = new ArrayList<>();

        listaDeSkills.add("Java");
        listaDeSkills.add("Banco de Dados");
        listaDeSkills.add("Programação WEB");
        listaDeSkills.add("Algoritmos e Programação");

        mv.addObject("listaDeSkills", listaDeSkills);

        List<String> outros = new ArrayList<>();

        outros.add("Conhecimento: Possuo Certificação SCRUM");
        outros.add("Conhecimento: Possuo Certificação em POO");
        outros.add("Interesse: Certificação AWS");
        outros.add("Interesse: Ciência de Dados");

        mv.addObject("outros", outros);

        List<Idioma> idiomas = new ArrayList<>();

        Idioma ingles = new Idioma();
        ingles.setNome("Inglês");
        ingles.setLeitura("Avançado");
        ingles.setEscrita("Avançado");
        ingles.setConversacao("Avançado");

        Idioma espanhol = new Idioma();
        espanhol.setNome("Espanhol");
        espanhol.setLeitura("Avançado");
        espanhol.setEscrita("Avançado");
        espanhol.setConversacao("Avançado");

        idiomas.add(ingles);
        idiomas.add(espanhol);

        mv.addObject("idiomas", idiomas);

        return mv;
    }
}


