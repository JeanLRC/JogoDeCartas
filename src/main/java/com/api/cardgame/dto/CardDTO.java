package com.api.cardgame.dto;

import com.api.cardgame.models.Attributes;
import com.api.cardgame.models.CardModel;

public class CardDTO {

	private Long id;
	private String name;
	private Attributes attributes;

	public CardDTO() {
	}

	public CardDTO(Long id, String name, Attributes attributes) {
		super();
		this.id = id;
		this.name = name;
		this.attributes = attributes;
	}

	public CardDTO(CardModel cardModel) {
		id = cardModel.getId();
		name = cardModel.getName();
		attributes = cardModel.getAttributes();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

}
