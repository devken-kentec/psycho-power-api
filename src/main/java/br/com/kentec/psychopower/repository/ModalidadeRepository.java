package br.com.kentec.psychopower.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kentec.psychopower.domain.Modalidade;

@Repository
public interface ModalidadeRepository extends JpaRepository<Modalidade, Long>{

}
