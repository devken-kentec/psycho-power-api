package br.com.kentec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kentec.domain.ImagemAtividade;

@Repository
public interface ImagemAtividadeRepository extends JpaRepository<ImagemAtividade, Long>{

}
