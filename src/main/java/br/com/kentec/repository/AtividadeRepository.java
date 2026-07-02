package br.com.kentec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kentec.domain.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long>{

}
