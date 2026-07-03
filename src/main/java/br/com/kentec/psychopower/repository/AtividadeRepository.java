package br.com.kentec.psychopower.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kentec.psychopower.domain.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long>{

}
