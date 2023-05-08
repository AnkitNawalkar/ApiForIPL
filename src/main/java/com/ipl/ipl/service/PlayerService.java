package com.ipl.ipl.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ipl.ipl.dao.PlayerDao;
import com.ipl.ipl.entity.Player;
import com.ipl.ipl.entity.Players;

@Service
public class PlayerService {

	@Autowired
	PlayerDao pd;
	SessionFactory sf;

	public List<Players> getAllPlayers() {
		return pd.getAllPlayers();
	}

	public String insertPlayers(Players players) {
		return pd.insertPlayers(players);
	}

	public String updatePlayers(Players players) {
		return pd.updatePlayers(players);
	}

	public String deletePlayers(Players players) {
		return pd.deletePlayers(players);
	}

	public List<Players> greaterThan2kRuns() {
		return pd.greaterThan2kRuns();
	}

	public List<Players> lessThan2kRuns() {
		return pd.lessThan2kRuns();
	}

	public List<Players> greaterThanOrEqualTo2kRuns() {
		return pd.greaterThanOrEqualTo2kRuns();
	}

	public List<Players> lessThanOrEqualTo2kRuns() {
		return pd.lessThanOrEqualTo2kRuns();
	}

	public List<Players> equalTo2kRuns() {
		return pd.equalTo2kRuns();
	}

	public List<Players> notEqualTo2KRuns() {
		return pd.notEqualTo2KRuns();
	}

	public List<Players> onePlayerDatails() {
		return pd.onePlayerDatails();
	}

	public List<Players> betweenCenturyPlayerDetails() {
		return pd.betweenCenturyPlayerDetails();
	}

	public List<Players> idPlayerRecord() {
		return pd.idPlayerRecord();
	}

	public List<Players> teamPlayersDetails() {
		return pd.teamPlayersDetails();
	}

	public List<Players> playerNotBelongToIndia() {
		return pd.playerNotBelongToIndia();
	}

	public List<Players> allPlayercenturyRecord() {
		return pd.allPlayercenturyRecord();
	}

	public List<Players> countPlayersRecord() {
		return pd.countPlayersRecord();
	}

	public List<Players> maxRuns() {
		return pd.maxRuns();
	}

	public List<Players> minRuns() {
		return pd.minRuns();
	}

	public List<Players> avgOfRuns() {
		return pd.avgOfRuns();
	}

	public List<Players> sumOfRuns() {
		return pd.sumOfRuns();
	}

	public List<Players> nameOfAllPlayers() {
		return pd.nameOfAllPlayers();
	}

	public List<Players> rowCountOfPlayersTableFromIplDB() {
		return pd.rowCountOfPlayersTableFromIplDB();
	}

	public List<Players> listOfID() {
		return pd.listOfID();
	}

	public List<Players> startWithPlayerName() {
		List<Players> plylist = pd.startWithPlayerName();
		List<Players> statwithplayerList = new ArrayList<>();
		if (plylist != null) {
			for (Players players : plylist) {

				if (players.getName().startsWith("A")) {
					System.out.println("If Executed...");
					statwithplayerList.add(players);
					System.out.println("Method Calling...");
				}
			}
		} else {
			System.out.println("Else Block..");
			statwithplayerList = null;
		}

		return statwithplayerList;
	}

	public List<Players> endWithPlayerName() {
		List<Players> playlist = pd.endWithPlayerName();
		List<Players> endWithList = new ArrayList<>();

		for (Players players : playlist) {
			if (players.getName().endsWith("e")) {
				System.out.println("If Executed...");
				endWithList.add(players);
				System.out.println("Method Calling...");
			}
		}
		return endWithList;
	}

	public List<Players> startWithEndWithPlayerName() {
		List<Players> plist = pd.startWithEndWithPlayerName();
		List<Players> startWithEndWithList = new ArrayList<>();

		for (Players players : plist) {
			if (players.getName().startsWith("V") && players.getName().endsWith("i")) {
				System.out.println("If Executed...");
				startWithEndWithList.add(players);
				System.out.println("Method Calling...");
			}
		}
		return startWithEndWithList;
	}

	public List<Players> runsGreaterThan4kPlayerName() {
		List<Players> playerList = pd.runsGreaterThan4kPlayerName();
		List<Players> plyList = new ArrayList<>();

		for (Players players : playerList) {
			if (players.getRuns() > 4000) {
				System.out.println("If Executed...");
				plyList.add(players);
				System.out.println("Method Calling...");
			}
		}
		return plyList;
	}

	public List<Players> runsLessThan2kPlayerName() {
		List<Players> playerList = pd.runsLessThan2kPlayerName();
		List<Players> plyList = new ArrayList<>();

		for (Players players : playerList) {
			if (players.getRuns() < 2000) {
				System.out.println("If Executed...");
				plyList.add(players);
				System.out.println("Method Calling...");
			}
		}
		return plyList;
	}

	public List<Players> sameTeamPlayerName() {
		List<Players> playerList = pd.sameTeamPlayerName();
		List<Players> plyList = new ArrayList<>();

		for (Players players : playerList) {
			if (players.getTeam().equals("India")) {
				System.out.println("If Executed...");
				plyList.add(players);
				System.out.println("Method Calling...");
			}
		}
		return plyList;
	}

	public List<Players> greaterThan60centuryPlayerName() {
		List<Players> playerList = pd.sameTeamPlayerName();
		List<Players> plyList = new ArrayList<>();

		for (Players players : playerList) {
			if (players.getCentury() > 60) {
				System.out.println("If Executed...");
				plyList.add(players);
			}
		}
		return plyList;
	}

	public List<Players> lessThan30HalfCenturyPlayerName() {
		List<Players> playList = pd.lessThan30HalfCenturyPlayerName();
		List<Players> plyList = new ArrayList<>();

		for (Players players : playList) {

			if (players.getHalfcentury() < 30) {
				System.out.println("If Executed...");
				plyList.add(players);
			}
		}
		return plyList;
	}

	public List<Players> greaterThan30HaltcenturyPlayerName() {
		List<Players> playList = pd.greaterThan30HaltcenturyPlayerName();
		List<Players> plyList = new ArrayList<>();

		for (Players players : playList) {

			if (players.getHalfcentury() > 30) {
				System.out.println("If Executed...");
				plyList.add(players);
			}
		}
		return plyList;
	}

	public List<Players> lessThan30fCenturyPlayerName() {
		List<Players> playList = pd.lessThan30fCenturyPlayerName();
		List<Players> plyList = new ArrayList<>();

		for (Players players : playList) {

			if (players.getCentury() < 30) {
				System.out.println("If Executed...");
				plyList.add(players);
			}
		}
		return plyList;
	}
}
