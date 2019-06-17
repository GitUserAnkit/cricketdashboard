package com.hcl.cricket.dashboard.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.cricket.dashboard.dto.PlayerDto;
import com.hcl.cricket.dashboard.repository.PlayersRepository;
@Service
@Transactional
public class PlayerServiceImpl implements PlayerService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PlayerServiceImpl.class);
	
	@Autowired
	PlayersRepository playersRepository;

	@Override
	public List<PlayerDto> findAllPlayers() {
		// TODO Auto-generated method stub
		return null;
	}
	


	/*
	 * public List<PlayerDto> findAllPlayers() { LOGGER.debug("findAllPlayers");
	 * List<PlayerDto> playerDtos = new ArrayList<>(); List<Player> players =
	 * playersRepository.findAll(); for(Player player : players){ PlayerDto
	 * playerDto = new PlayerDto(); BeanUtils.copyProperties(player, playerDto);
	 * playerDtos.add(playerDto); } return playerDtos; }
	 */


	
}
