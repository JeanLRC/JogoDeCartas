package com.api.cardgame.controllers;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.cardgame.dto.GameDTO;
import com.api.cardgame.models.GameModel;

@RestController
@RequestMapping("/game")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class GameController {

	/*public ResponseEntity<GameModel> newRound (@Valid @RequestBody GameDTO gameDTO){
		
	}*/
}
