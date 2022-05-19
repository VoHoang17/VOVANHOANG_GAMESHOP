package com.web.demo.dto;

import java.util.HashSet;
import java.util.Set;

public class RoleDto {
	
	private Integer idRole;
	private String nameRole;
	private Set<UserDto2> userses = new HashSet<UserDto2>(0);
	public Integer getIdRole() {
		return idRole;
	}
	public void setIdRole(Integer idRole) {
		this.idRole = idRole;
	}
	public String getNameRole() {
		return nameRole;
	}
	public void setNameRole(String nameRole) {
		this.nameRole = nameRole;
	}
	public Set<UserDto2> getUserses() {
		return userses;
	}
	public void setUserses(Set<UserDto2> userses) {
		this.userses = userses;
	}
	
}
