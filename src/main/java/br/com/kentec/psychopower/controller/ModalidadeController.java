package br.com.kentec.psychopower.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kentec.psychopower.domain.Modalidade;
import br.com.kentec.psychopower.service.ModalidadeService;

@CrossOrigin(origins = "${origin.cors.url}", maxAge = 3600)
@RestController
@RequestMapping("/psycho-power/api/v1/modalidade")
public class ModalidadeController {
	
	@Autowired
	private ModalidadeService ms;
	
	   @GetMapping("/listar")
	   public List<Modalidade> listar() {
		   return ms.listarTodos();
	   }

}
