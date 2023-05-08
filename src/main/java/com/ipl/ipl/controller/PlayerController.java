package com.ipl.ipl.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ipl.ipl.entity.Player;
import com.ipl.ipl.entity.Players;
import com.ipl.ipl.service.PlayerService;

@RestController
public class PlayerController {
	
	@Autowired
	PlayerService ps;

	@GetMapping("allplayers")
	public List<Players> getAllPlayers() {
		return ps.getAllPlayers();
	}

	@PostMapping("insertplayer")
	public String insertPlayers(@RequestBody Players players) {
		return ps.insertPlayers(players);
	}

	@PutMapping("updateplayer")
	public String updatePlayers(@RequestBody Players players) {
		return ps.updatePlayers(players);
	}

	@DeleteMapping("deleteplayer")
	public String deletePlayers(@RequestBody Players players) {
		return ps.deletePlayers(players);
	}

	@GetMapping("greaterthan2krunsplayer")
	public List<Players> greaterThan2kRuns() {
		return ps.greaterThan2kRuns();
	}

	@GetMapping("lessthan2krunsplayer")
	public List<Players> lessThan2kRuns() {
		return ps.lessThan2kRuns();
	}

	@GetMapping("greaterthanorequalto2krunsplayer")
	public List<Players> greaterThanOrEqualTo2kRuns() {
		return ps.greaterThanOrEqualTo2kRuns();
	}

	@GetMapping("lessthanorequalto2krunsplayer")
	public List<Players> lessThanOrEqualTo2kRuns() {
		return ps.lessThanOrEqualTo2kRuns();
	}

	@GetMapping("equalto2krunsplayer")
	public List<Players> equalTo2kRuns() {
		return ps.equalTo2kRuns();
	}

	@GetMapping("notequalto2krunsplayer")
	public List<Players> notEqualTo2KRuns() {
		return ps.notEqualTo2KRuns();
	}

	@GetMapping("oneplayerdatails")
	public List<Players> onePlayerDatails() {
		return ps.onePlayerDatails();
	}

	@GetMapping("centurybetweenplayerdatails")
	public List<Players> betweenCenturyPlayerDetails() {
		return ps.betweenCenturyPlayerDetails();
	}

	@GetMapping("idplayerrecorddatails")
	public List<Players> idPlayerRecord() {
		return ps.idPlayerRecord();
	}

	@GetMapping("teamnameplayerdetails")
	public List<Players> teamPlayersDetails() {
		return ps.teamPlayersDetails();
	}

	@GetMapping("playernotbelongtoindia")
	public List<Players> playerNotBelongToIndia() {
		return ps.playerNotBelongToIndia();
	}

	@GetMapping("allplayercentury")
	public List<Players> allPlayercenturyRecord() {
		return ps.allPlayercenturyRecord();
	}

	@GetMapping("countplayers")
	public List<Players> countPlayersRecord() {
		return ps.countPlayersRecord();
	}

	@GetMapping("maxrun")
	public List<Players> maxRuns() {
		return ps.maxRuns();
	}

	@GetMapping("minrun")
	public List<Players> minRuns() {
		return ps.minRuns();
	}

	@GetMapping("avgofallruns")
	public List<Players> avgOfRuns() {
		return ps.avgOfRuns();
	}

	@GetMapping("sumofallruns")
	public List<Players> sumOfRuns() {
		return ps.sumOfRuns();
	}

	@GetMapping("nameofallplayer")
	public List<Players> nameOfAllPlayers() {
		return ps.nameOfAllPlayers();
	}

	@GetMapping("countrow")
	public List<Players> rowCountOfPlayersTableFromIplDB() {
		return ps.rowCountOfPlayersTableFromIplDB();
	}

	@GetMapping("showid")
	public List<Players> listOfID() {
		return ps.listOfID();
	}

	@GetMapping("startwithplayername")
	public List<Players> startWithPlayerName() {
		return ps.startWithPlayerName();
	}

	@GetMapping("endwithplayername")
	public List<Players> endWithPlayerName() {
		return ps.endWithPlayerName();
	}

	@GetMapping("startwithendwithplayername")
	public List<Players> startWithEndWithPlayerName() {
		return ps.startWithEndWithPlayerName();
	}

	@GetMapping("runsgreaterthan4k")
	public List<Players> runsGreaterThan4kPlayerName() {
		return ps.runsGreaterThan4kPlayerName();
	}

	@GetMapping("runslessthan2k")
	public List<Players> runsLessThan2kPlayerName() {
		return ps.runsLessThan2kPlayerName();
	}

	@GetMapping("sameteamplayername")
	public List<Players> sameTeamPlayerName() {
		return ps.sameTeamPlayerName();
	}

	@GetMapping("geaterthan60centuryplayerdetails")
	public List<Players> greaterThan60centuryPlayerName() {
		return ps.greaterThan60centuryPlayerName();
	}

	@GetMapping("lessthan30halfcenturyplayerdetails")
	public List<Players> lessThan30HalfCenturyPlayerName() {
		return ps.lessThan30HalfCenturyPlayerName();
	}

	@GetMapping("greaterthan30halfcenturyplayerdetails")
	public List<Players> greaterThan30HaltcenturyPlayerName() {
		return ps.greaterThan30HaltcenturyPlayerName();
	}

	@GetMapping("lessthan30centuryplayerdetails")
	public List<Players> lessThan30fCenturyPlayerName() {
		return ps.lessThan30fCenturyPlayerName();
	}
}
