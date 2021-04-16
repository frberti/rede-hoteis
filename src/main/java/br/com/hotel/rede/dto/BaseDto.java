package br.com.hotel.rede.dto;

import java.io.Serializable;

public abstract class BaseDto implements Serializable {

	protected Long id;

	public Long getId() {
		return id;
	}
}
