package com.hcl.cricket.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.cricket.dashboard.model.Player;

public interface PlayersRepository extends JpaRepository<Player, Long> {

	Player findByPlayerId(long playerId);

}
