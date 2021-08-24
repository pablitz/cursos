package br.com.alura.forum.controller;


import br.com.alura.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teste")
public class TopicosController {

    //@Autowired
    //private TopicoRepository topicoRepository;

    @GetMapping
    public String lista() {
        return "hello world";
    }


//    @GetMapping
//    @ResponseBody
//    public List<TopicoDto> lista(String nomeCurso) {
//        if (nomeCurso == null) {
//            List<Topico> topicos = topicoRepository.findAll();
//            return TopicoDto.converter(topicos);
//        } else {
//            List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
//            return TopicoDto.converter(topicos);
//        }
//    }
}
