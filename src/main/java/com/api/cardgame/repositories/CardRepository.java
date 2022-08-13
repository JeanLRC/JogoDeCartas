package com.api.cardgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.cardgame.models.CardModel;

@Repository
public interface CardRepository extends JpaRepository<CardModel, Long> {

}
