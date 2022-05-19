package com.web.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;

import com.web.demo.entity.Users;

public interface AdminUserService {
	
	
	List<Users> findAll();

	<S extends Users> Users save(S entity);

	Users getById(Integer id);

	void deleteById(Integer id);

	Users findByusernameUsers(String username);
	
}
