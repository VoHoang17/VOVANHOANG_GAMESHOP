package com.web.demo.restcontroller;
import java.util.Date;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.demo.converter.UsersConverter;
import com.web.demo.dto.UsersDto;
import com.web.demo.entity.TokenUser;
import com.web.demo.entity.Users;
import com.web.demo.service.AdminUserService;
import com.web.demo.service.TokenService;

@RestController
public class RestUserController {
	
	@Autowired
	AdminUserService userService;
	@Autowired
	TokenService tokenservice;
	@GetMapping("/api/user")
	public ResponseEntity<?> getListuser(){
		System.out.println("/api/user");
		List<Users> list=userService.findAll();
		
		List<UsersDto> listDto = UsersConverter.getInstance().touserDtoList(list);
		
		return ResponseEntity.ok(listDto);
	}
	@PostMapping("/api/adduser")
	public  ResponseEntity<Users> adduser(@RequestBody Users users){	
		Users us = null;
		if(users.getIdUsers() == null) {
			us= userService.save(users);
			TokenUser token = new TokenUser(us);
			
			tokenservice.save(token);
		}else {
			us = userService.save(users);
			TokenUser token = tokenservice.findByUsers(us);
			token.setValueTokenUsers(UUID.randomUUID().toString());
			token.setDate(new Date());
			tokenservice.save(token);
		}
		return new ResponseEntity<Users>(us,HttpStatus.OK);
	}
	@DeleteMapping("/api/delete/{id}")
	public void delete(@PathVariable Integer id){
			 userService.deleteById(id);
	}
}
