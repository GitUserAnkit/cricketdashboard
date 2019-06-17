package com.hcl.cricket.dashboard.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "player")
@Entity
public class Player implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long playerId;
	private String playerName;
	private String country;
	private String battingStyle;
	private String bowlingStyle;
	private Integer odiRuns;
	private Integer testRuns;
	private Integer testWickets;
	private Integer odiWickets;
	private Integer matches;

	public Player() {

	}

	public Player(Long playerId, String playerName, String country, String battingStyle, String bowlingStyle,
			Integer odiRuns, Integer testRuns, Integer testWickets, Integer odiWickets, Integer matches) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.country = country;
		this.battingStyle = battingStyle;
		this.bowlingStyle = bowlingStyle;
		this.odiRuns = odiRuns;
		this.testRuns = testRuns;
		this.testWickets = testWickets;
		this.odiWickets = odiWickets;
		this.matches = matches;
	}

	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getBattingStyle() {
		return battingStyle;
	}

	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	public String getBowlingStyle() {
		return bowlingStyle;
	}

	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}

	public Integer getOdiRuns() {
		return odiRuns;
	}

	public void setOdiRuns(Integer odiRuns) {
		this.odiRuns = odiRuns;
	}

	public Integer getTestRuns() {
		return testRuns;
	}

	public void setTestRuns(Integer testRuns) {
		this.testRuns = testRuns;
	}

	public Integer getTestWickets() {
		return testWickets;
	}

	public void setTestWickets(Integer testWickets) {
		this.testWickets = testWickets;
	}

	public Integer getOdiWickets() {
		return odiWickets;
	}

	public void setOdiWickets(Integer odiWickets) {
		this.odiWickets = odiWickets;
	}


	public Integer getMatches() {
		return matches;
	}

	public void setMatches(Integer matches) {
		this.matches = matches;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", country=" + country
				+ ", battingStyle=" + battingStyle + ", bowlingStyle=" + bowlingStyle + ", odiRuns=" + odiRuns
				+ ", testRuns=" + testRuns + ", testWickets=" + testWickets + ", odiWickets=" + odiWickets
				+ ", matches=" + matches + "]";
	}
}
