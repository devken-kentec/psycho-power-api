package br.com.kentec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kentec.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
