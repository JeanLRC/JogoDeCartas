package com.api.cardgame.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import com.api.cardgame.dto.CardDTO;
import com.api.cardgame.models.CardModel;
import com.api.cardgame.repositories.CardRepository;

@Service
public class CardService {

	@Autowired
	private CardRepository repository;

	@Transactional(readOnly = true)
	public Page<CardDTO> findAllCards(Pageable pageable) {
		Page<CardModel> result = repository.findAll(pageable);
		Page<CardDTO> page = result.map(x -> new CardDTO(x));
		return page;
	}

	@Transactional(readOnly = true)
	public CardDTO findCardById(Long id) {
		CardModel result = repository.findById(id).get();
		CardDTO dto = new CardDTO(result);
		return dto;
	}

	@Transactional
	public CardModel saveCard(CardDTO cardDTO) {
		CardModel card = new CardModel();
		card.setName(cardDTO.getName());
		card.setAttributes(cardDTO.getAttributes());
		repository.save(card);
		return card;
	}

	@Transactional
	public Optional<CardModel> editCard(CardModel cardModel) {
		if (repository.findById(cardModel.getId()).isPresent()) {
			return Optional.of(repository.save(cardModel));
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Card not found!", null);
	}

	public void deleteCardById(Long id) {
		Optional<CardModel> card = repository.findById(id);

		if (card.isEmpty())
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);

		repository.deleteById(id);
	}

}
