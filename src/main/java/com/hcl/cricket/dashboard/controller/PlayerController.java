package com.hcl.cricket.dashboard.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.cricket.dashboard.dto.PlayerDto;
import com.hcl.cricket.dashboard.service.PlayerService;

@RestController
@RequestMapping("/cricketdashboard")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class PlayerController {
	@Autowired
	private PlayerService playerService;

	@PostMapping("/players")
	public ResponseEntity<PlayerDto> addPlayer(@RequestBody PlayerDto playerDto)
			throws IllegalAccessException, InvocationTargetException {
		PlayerDto player = playerService.savePlayer(playerDto);
		return new ResponseEntity<PlayerDto>(player, HttpStatus.CREATED);

	}

	@GetMapping("/players")
	public ResponseEntity<List<PlayerDto>> getPlayers() throws Exception {
		List<PlayerDto> players = playerService.getPlayers();
		return new ResponseEntity<List<PlayerDto>>(players, HttpStatus.OK);
	}

	@GetMapping(value = "/players/{playerid}")
	public ResponseEntity<PlayerDto> getPlayersDetails(@PathVariable("playerid") long playerId)
			throws IllegalAccessException, InvocationTargetException {
		PlayerDto player = playerService.getPlayersDetails(playerId);
		return new ResponseEntity<>(player, HttpStatus.OK);
	}

}
