package br.com.kentec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kentec.domain.Modalidade;

@Repository
public interface ModalidadeRepository extends JpaRepository<Modalidade, Long>{

}
