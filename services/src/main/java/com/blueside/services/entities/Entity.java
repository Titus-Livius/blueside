package com.blueside.services.entities;

import org.springframework.data.annotation.Id;

public class Entity {

	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
