package com.hcl.cricket.dashboard.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.cricket.dashboard.dto.PlayerDto;
import com.hcl.cricket.dashboard.service.PlayerService;

@RestController
@RequestMapping("/cricketdashboard")
@CrossOrigin(allowedHeaders = {"*" ,"*/"}, origins = {"*","*/"})
public class PlayerController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PlayerController.class);
	@Autowired
	PlayerService playerService;
	
	
	@GetMapping("/players")
	public ResponseEntity<List<PlayerDto>> getPlayers(){
		LOGGER.debug("getPlayers");
		List<PlayerDto> players= playerService.findAllPlayers();
		return new ResponseEntity<>(players, HttpStatus.OK);
		
		
	}
	
	

	
	


}
