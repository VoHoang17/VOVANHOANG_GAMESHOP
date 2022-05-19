package com.web.demo.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import com.web.demo.dto.UsersDto;
import com.web.demo.entity.Users;


public class UsersConverter {
	
	private ModelMapper mapper = new ModelMapper();
	
	private static UsersConverter userConverter;
	
	private UsersConverter() {};
	
	public static UsersConverter getInstance() {
		if(userConverter == null) {
			userConverter = new UsersConverter();
		}
		return userConverter;
	}
	public UsersDto toUserDto(Users entity) {
		return mapper.map(entity, UsersDto.class);
	}
	public List<UsersDto> touserDtoList(List<Users> list) {
		return list
				.stream()
				.map(user -> { return toUserDto(user);})
				.collect(Collectors.toList());
	}
}
