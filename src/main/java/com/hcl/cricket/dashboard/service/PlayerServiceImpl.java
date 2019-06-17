package com.hcl.cricket.dashboard.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.cricket.dashboard.dto.PlayerDto;
import com.hcl.cricket.dashboard.model.Player;
import com.hcl.cricket.dashboard.repository.PlayersRepository;

@Service
public class PlayerServiceImpl implements PlayerService {
	Logger LOGGER = LoggerFactory.getLogger(PlayerServiceImpl.class);
	@Autowired
	private PlayersRepository playerRepository;

	@Override
	public PlayerDto savePlayer(PlayerDto playerDto) throws IllegalAccessException, InvocationTargetException {
		PlayerDto pdto = new PlayerDto();
		if (playerDto != null) {
			Player player = new Player();
			BeanUtils.copyProperties(player, playerDto);
			Player players = playerRepository.save(player);
			BeanUtils.copyProperties(pdto, players);
		}
		return pdto;
	}

	public List<PlayerDto> getPlayers() throws Exception {
		List<Player> players = playerRepository.findAll();
		List<PlayerDto> playerDto = new ArrayList<>();
		for (Player player : players) {
			PlayerDto playerDtos = new PlayerDto();

			BeanUtils.copyProperties(playerDtos, player);
			playerDto.add(playerDtos);
		}

		return playerDto;
	}

	public PlayerDto getPlayersDetails(Long playerId) throws IllegalAccessException, InvocationTargetException {
		PlayerDto playerDto = new PlayerDto();
		Player player = playerRepository.findByPlayerId(playerId);
		BeanUtils.copyProperties(playerDto, player);
		return playerDto;
	}
}
