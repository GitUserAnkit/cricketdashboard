package com.hcl.cricket.dashboard.service;

import java.util.List;

import com.hcl.cricket.dashboard.dto.PlayerDto;

public interface PlayerService {

	List<PlayerDto> findAllPlayers();

}
