package br.com.kentec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kentec.domain.Imagem;

@Repository
public interface ImagemRepository extends JpaRepository<Imagem, Long>{

}
