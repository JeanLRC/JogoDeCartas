package com.api.cardgame.dto;

public class GameDTO {

	private Long playerOneCard;
	private Long playerTwoCard;

	public GameDTO() {
	}

	public GameDTO(Long playerOneCard, Long playerTwoCard) {
		super();
		this.playerOneCard = playerOneCard;
		this.playerTwoCard = playerTwoCard;
	}

	public Long getPlayerOneCard() {
		return playerOneCard;
	}

	public void setPlayerOneCard(Long playerOneCard) {
		this.playerOneCard = playerOneCard;
	}

	public Long getPlayerTwoCard() {
		return playerTwoCard;
	}

	public void setPlayerTwoCard(Long playerTwoCard) {
		this.playerTwoCard = playerTwoCard;
	}

}
