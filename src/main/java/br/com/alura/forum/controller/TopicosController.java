package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.controller.form.TopicoForm;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.CursoRepository;
import br.com.alura.forum.repository.TopicoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/topicos")
public class TopicosController {

  @Autowired
  private TopicoRepository topicoRepository;

  @Autowired
  private CursoRepository cursoRepository;

  @GetMapping
  public List<TopicoDto> lista(String nomeCurso) {
    if (nomeCurso == null) {
      return TopicoDto.converter(topicoRepository.findAll());
    } else {
      return TopicoDto.converter(topicoRepository.findByCursoNome(nomeCurso));
    }
  }
  
  @PostMapping
  public void cadastrar(@RequestBody TopicoForm form) {
    Topico topico = form.converter(cursoRepository);
    topicoRepository.save(topico);
  }
}
