package com.hcl.cricket.dashboard.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import com.hcl.cricket.dashboard.dto.PlayerDto;

public interface PlayerService {

	PlayerDto savePlayer(PlayerDto playerDto) throws IllegalAccessException, InvocationTargetException;

	public List<PlayerDto> getPlayers() throws Exception;

	PlayerDto getPlayersDetails(Long playerId) throws IllegalAccessException, InvocationTargetException;
}
