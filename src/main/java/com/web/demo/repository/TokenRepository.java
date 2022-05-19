package com.web.demo.repository;




import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.demo.entity.TokenUser;
import com.web.demo.entity.Users;



@Repository
public interface TokenRepository extends JpaRepository<TokenUser, String> {

	TokenUser findByValueTokenUsers(String valueTokenUsers);
	TokenUser findByUsers(Optional<Users> users);
	TokenUser findByUsers (Users users);
}
