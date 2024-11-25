package com.api.cardgame.models;

public class GameModel {

	private Long winner;
	private Long loser;
	private Details details;

	public GameModel() {

	}

	public GameModel(Long winner, Long loser, Details details) {
		super();
		this.winner = winner;
		this.loser = loser;
		this.details = details;
	}

	public Long getWinner() {
		return winner;
	}

	public void setWinner(Long winner) {
		this.winner = winner;
	}

	public Long getLoser() {
		return loser;
	}

	public void setLoser(Long loser) {
		this.loser = loser;
	}

	public Details getDetails() {
		return details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}

}
