package com.web.demo.dto;

import com.web.demo.entity.Games;

public class CartDTO {
public Games getGames() {
		return games;
	}

	public void setGames(Games games) {
		this.games = games;
	}

private Games games;

public CartDTO(Games games) {
	super();
	this.games = games;
}
public CartDTO() {
	
}
}
