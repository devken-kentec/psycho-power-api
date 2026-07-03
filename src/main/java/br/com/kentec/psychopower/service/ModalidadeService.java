package br.com.kentec.psychopower.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.psychopower.domain.Modalidade;
import br.com.kentec.psychopower.repository.ModalidadeRepository;

@Service
public class ModalidadeService {
	
	@Autowired
	private ModalidadeRepository mr;
	
	public List<Modalidade> listarTodos(){
		return mr.findAll();
	}
}
