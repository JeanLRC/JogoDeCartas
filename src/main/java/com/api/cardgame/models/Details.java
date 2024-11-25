package com.api.cardgame.models;

public class Details {

	private Long hp;
	private Long attack;
	private Long defense;
	private Long specialAttack;
	private Long specialDefense;
	private Long speed;

	public Details() {
	}

	public Details(Long hp, Long attack, Long defense, Long specialAttack, Long specialDefense, Long speed) {
		super();
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.specialAttack = specialAttack;
		this.specialDefense = specialDefense;
		this.speed = speed;
	}

	public Long getHp() {
		return hp;
	}

	public void setHp(Long hp) {
		this.hp = hp;
	}

	public Long getAttack() {
		return attack;
	}

	public void setAttack(Long attack) {
		this.attack = attack;
	}

	public Long getDefense() {
		return defense;
	}

	public void setDefense(Long defense) {
		this.defense = defense;
	}

	public Long getSpecialAttack() {
		return specialAttack;
	}

	public void setSpecialAttack(Long specialAttack) {
		this.specialAttack = specialAttack;
	}

	public Long getSpecialDefense() {
		return specialDefense;
	}

	public void setSpecialDefense(Long specialDefense) {
		this.specialDefense = specialDefense;
	}

	public Long getSpeed() {
		return speed;
	}

	public void setSpeed(Long speed) {
		this.speed = speed;
	}

}
