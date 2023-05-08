package com.ipl.ipl.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ipl.ipl.entity.Player;
import com.ipl.ipl.entity.Players;

@Repository
public class PlayerDao {

	@Autowired
	SessionFactory sf;

	public List<Players> getAllPlayers() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		List<Players> plist = criteria.list();
		return plist;
	}

	public String insertPlayers(Players players) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(players);
		tr.commit();
		return " Players Details Inserted..!!";
	}

	public String updatePlayers(Players players) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(players);
		tr.commit();
		return " Players Details Updated..!!";
	}

	public String deletePlayers(Players players) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Players ply = session.load(Players.class, players.getId());
		session.delete(ply);
		tr.commit();
		return "Players Details Deleted..!!";
	}

	public List<Players> greaterThan2kRuns() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.add(Restrictions.gt("runs", 2000));
		List<Players> greaterThanPlayerList = criteria.list();
		return greaterThanPlayerList;
	}

	public List<Players> lessThan2kRuns() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.add(Restrictions.lt("runs", 2000));
		List<Players> lessThanPlayerList = criteria.list();
		return lessThanPlayerList;
	}

	public List<Players> greaterThanOrEqualTo2kRuns() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.add(Restrictions.ge("runs", 2000));
		List<Players> greaterThanOrEqualTo2kRunsPlayerList = criteria.list();
		return greaterThanOrEqualTo2kRunsPlayerList;
	}

	public List<Players> lessThanOrEqualTo2kRuns() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.add(Restrictions.le("runs", 2000));
		List<Players> lessThanOrEqualTo2kRunsPlayerList = criteria.list();
		return lessThanOrEqualTo2kRunsPlayerList;
	}

	public List<Players> equalTo2kRuns() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.add(Restrictions.eq("runs", 2000));
		List<Players> equalTo2kRunsPlayerList = criteria.list();
		return equalTo2kRunsPlayerList;

	}

	public List<Players> notEqualTo2KRuns() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.add(Restrictions.ne("runs", 2000));
		List<Players> notEqualTo2kRunsPlayerList = criteria.list();
		return notEqualTo2kRunsPlayerList;
	}

	public List<Players> onePlayerDatails() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.add(Restrictions.like("name", "virat Kohli"));
		List<Players> onePlayerList = criteria.list();
		return onePlayerList;
	}

	public List<Players> betweenCenturyPlayerDetails() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.add(Restrictions.between("century", 45, 77));
		List<Players> betweenCenturyList = criteria.list();
		return betweenCenturyList;
	}

	public List<Players> idPlayerRecord() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.add(Restrictions.idEq(12));
		List<Players> idPlayerList = criteria.list();
		return idPlayerList;
	}

	public List<Players> teamPlayersDetails() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.add(Restrictions.eqOrIsNull("team", "south africa"));
		List<Players> teamPlayerList = criteria.list();
		return teamPlayerList;
	}

	public List<Players> playerNotBelongToIndia() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.add(Restrictions.neOrIsNotNull("team", "india"));
		List<Players> playernotBelongToIndiaList = criteria.list();
		return playernotBelongToIndiaList;
	}

	public List<Players> allPlayercenturyRecord() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.add(Restrictions.isNotNull("century"));
		List<Players> allPlayerCenturyRecordList = criteria.list();
		return allPlayerCenturyRecordList;
	}

	public List<Players> countPlayersRecord() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.setProjection(Projections.count("name"));
		List<Players> playerCountList = criteria.list();
		return playerCountList;
	}

	public List<Players> maxRuns() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.setProjection(Projections.max("runs"));
		List<Players> maxRunsList = criteria.list();
		return maxRunsList;
	}

	public List<Players> minRuns() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.setProjection(Projections.min("runs"));
		List<Players> minRunsList = criteria.list();
		return minRunsList;
	}

	public List<Players> avgOfRuns() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.setProjection(Projections.avg("runs"));
		List<Players> avgOfRunsList = criteria.list();
		return avgOfRunsList;
	}

	public List<Players> sumOfRuns() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.setProjection(Projections.sum("runs"));
		List<Players> sumOfRunsList = criteria.list();
		return sumOfRunsList;
	}

	public List<Players> nameOfAllPlayers() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.setProjection(Projections.property("name"));
		List<Players> nameOfAllPlayerList = criteria.list();
		return nameOfAllPlayerList;
	}

	public List<Players> rowCountOfPlayersTableFromIplDB() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.setProjection(Projections.rowCount());
		List<Players> rowCountList = criteria.list();
		return rowCountList;
	}

	public List<Players> listOfID() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		criteria.setProjection(Projections.id());
		List<Players> idList = criteria.list();
		return idList;
	}

	public List<Players> startWithPlayerName() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		List<Players> plylist = criteria.list();
		return plylist;
	}

	public List<Players> endWithPlayerName() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		List<Players> playlist = criteria.list();
		return playlist;
	}

	public List<Players> startWithEndWithPlayerName() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		List<Players> playlist = criteria.list();
		return playlist;
	}

	public List<Players> runsGreaterThan4kPlayerName() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		List<Players> playlist = criteria.list();
		return playlist;
	}

	public List<Players> runsLessThan2kPlayerName() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		List<Players> playlist = criteria.list();
		return playlist;
	}

	public List<Players> sameTeamPlayerName() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		List<Players> playlist = criteria.list();
		return playlist;
	}

	public List<Players> greaterThan60centuryPlayerName() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		List<Players> playlist = criteria.list();
		return playlist;
	}

	public List<Players> lessThan30HalfCenturyPlayerName() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		List<Players> playlist = criteria.list();
		return playlist;
	}

	public List<Players> greaterThan30HaltcenturyPlayerName() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		List<Players> playlist = criteria.list();
		return playlist;
	}

	public List<Players> lessThan30fCenturyPlayerName() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Players.class);
		List<Players> playlist = criteria.list();
		return playlist;
	}

	// samor karayche ah ajun
}
