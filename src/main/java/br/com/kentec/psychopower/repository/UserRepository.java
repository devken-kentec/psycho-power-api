package br.com.kentec.psychopower.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kentec.psychopower.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
