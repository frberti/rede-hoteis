package br.com.hotel.rede.model;

import java.io.Serializable;

public abstract class BaseModel implements Serializable {
	
	protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

}
