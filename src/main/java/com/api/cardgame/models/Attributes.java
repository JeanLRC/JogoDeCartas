package com.api.cardgame.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Embeddable
@Table(name = "tb_card_attributes")
public class Attributes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attributes_id")
	private Long id;

	@NotNull(message = "Attriute hp is required")
	private Integer hp;

	@NotNull(message = "Attribute attack is required")
	private Integer attack;

	@NotNull(message = "Attribute defense is required")
	private Integer defense;

	@NotNull(message = "Attribute special-attack is required")
	private Integer specialAttack;

	@NotNull(message = "Attribute special-defense is required")
	private Integer specialDefense;

	@NotNull(message = "Attribute speed is required")
	private Integer speed;

	public Attributes() {
	}

	public Attributes(Integer hp, Integer attack, Integer defense, Integer specialAttack, Integer specialDefense,
			Integer speed) {
		super();
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.specialAttack = specialAttack;
		this.specialDefense = specialDefense;
		this.speed = speed;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public Integer getSpecialAttack() {
		return specialAttack;
	}

	public void setSpecialAttack(Integer specialAttack) {
		this.specialAttack = specialAttack;
	}

	public Integer getSpecialDefense() {
		return specialDefense;
	}

	public void setSpecialDefense(Integer specialDefense) {
		this.specialDefense = specialDefense;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

}
