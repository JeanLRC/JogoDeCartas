package com.api.cardgame.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.cardgame.dto.CardDTO;
import com.api.cardgame.dto.GameDTO;
import com.api.cardgame.models.GameModel;

@Service
public class GameService {

	@Autowired
	private CardService cardService;

	public GameModel compareCards(GameDTO gameDTO) {
		CardDTO playerOne = cardService.findCardById(gameDTO.getPlayerOneCard());
		CardDTO playerTwo = cardService.findCardById(gameDTO.getPlayerTwoCard());

		Long hpWinner = getHpWinner(playerOne, playerTwo);
		Long attackWinner = getAttackWinner(playerOne, playerTwo);
		Long defenseWinner = getDefenseWinner(playerOne, playerTwo);
		Long specialAttackWinner = getSpecialAttackWinner(playerOne, playerTwo);
		Long specialDefenseWinner = getSpecialDefenseWinner(playerOne, playerTwo);
		Long speedWinner = getSpeedWinner(playerOne, playerTwo);

		GameModel gameResult = new GameModel();

		gameResult.getDetails().setHp(hpWinner);
		gameResult.getDetails().setAttack(attackWinner);
		gameResult.getDetails().setDefense(defenseWinner);
		gameResult.getDetails().setSpecialAttack(specialAttackWinner);
		gameResult.getDetails().setSpecialDefense(specialDefenseWinner);
		gameResult.getDetails().setSpeed(speedWinner);

		return gameResult;
	}

	// public int getWinner(GameModel card1, GameModel card2) {}

	public Long getHpWinner(CardDTO p1, CardDTO p2) {
		int hp1 = p1.getAttributes().getHp();
		int hp2 = p2.getAttributes().getHp();
		if (hp1 != hp2) {
			if (hp1 > hp2) {
				return p1.getId().longValue();
			} else {
				return p2.getId().longValue();
			}
		}
		return null;
	}

	public Long getAttackWinner(CardDTO p1, CardDTO p2) {
		int value1 = p1.getAttributes().getAttack();
		int value2 = p2.getAttributes().getAttack();
		if (value1 != value2) {
			if (value1 > value2) {
				return p1.getId().longValue();
			} else {
				return p2.getId().longValue();
			}
		}
		return null;
	}

	public Long getDefenseWinner(CardDTO p1, CardDTO p2) {
		int value1 = p1.getAttributes().getDefense();
		int value2 = p2.getAttributes().getDefense();
		if (value1 != value2) {
			if (value1 > value2) {
				return p1.getId().longValue();
			} else {
				return p2.getId().longValue();
			}
		}
		return null;
	}

	public Long getSpecialAttackWinner(CardDTO p1, CardDTO p2) {
		int value1 = p1.getAttributes().getSpecialAttack();
		int value2 = p2.getAttributes().getSpecialAttack();
		if (value1 != value2) {
			if (value1 > value2) {
				return p1.getId().longValue();
			} else {
				return p2.getId().longValue();
			}
		}
		return null;
	}

	public Long getSpecialDefenseWinner(CardDTO p1, CardDTO p2) {
		int value1 = p1.getAttributes().getSpecialDefense();
		int value2 = p2.getAttributes().getSpecialDefense();
		if (value1 != value2) {
			if (value1 > value2) {
				return p1.getId().longValue();
			} else {
				return p2.getId().longValue();
			}
		}
		return null;
	}

	public Long getSpeedWinner(CardDTO p1, CardDTO p2) {
		int value1 = p1.getAttributes().getSpeed();
		int value2 = p2.getAttributes().getSpeed();
		if (value1 != value2) {
			if (value1 > value2) {
				return p1.getId().longValue();
			} else {
				return p2.getId().longValue();
			}
		}
		return null;
	}
}
