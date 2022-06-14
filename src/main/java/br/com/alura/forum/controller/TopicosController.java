package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {

  @RequestMapping("/topicos")
  @ResponseBody
  public List<Topico> lista() {
    Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programacao Java"));
    Topico topico2 = new Topico("Relacionamentos", "Relacionamentos entre Spring e Banco de Dados", new Curso("Spring", "Programacao Java"));
    Topico topico3 = new Topico("Questão", "Questão com Spring", new Curso("Spring", "Programacao Java"));
    return Arrays.asList(topico, topico2, topico3);
  }
  
}
