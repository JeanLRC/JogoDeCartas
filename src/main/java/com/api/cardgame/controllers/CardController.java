package com.api.cardgame.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.cardgame.dto.CardDTO;
import com.api.cardgame.models.CardModel;
import com.api.cardgame.services.CardService;

@RestController
@RequestMapping("/cards")
public class CardController {

	@Autowired
	private CardService service;

	@GetMapping
	public Page<CardDTO> getCards(Pageable pageable) {
		return service.findAllCards(pageable);
	}

	@GetMapping(value = "/{id}")
	public CardDTO getCardById(@PathVariable Long id) {
		return service.findCardById(id);
	}

	@PostMapping
	public ResponseEntity<CardModel> postCard(@Valid @RequestBody CardDTO cardDTO) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.saveCard(cardDTO));
	}

	@PutMapping
	public ResponseEntity<Optional<CardModel>> editCard(@Valid @RequestBody CardModel cardModel) {
		return ResponseEntity.status(HttpStatus.OK).body(service.editCard(cardModel));
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void deleteCard(@PathVariable Long id) {
		service.deleteCardById(id);
	}

}
