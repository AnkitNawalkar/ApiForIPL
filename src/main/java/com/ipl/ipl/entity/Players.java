package com.ipl.ipl.entity;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	
	@Entity
	public class Players {
		
	private int id;
	
	
	private String name;
	private int runs;
	private int century;
	private int halfcentury;
	private String team;
	
	@Id
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getRuns() {
	return runs;
	}
	public void setRuns(int runs) {
	this.runs = runs;
	}
	public int getCentury() {
	return century;
	}
	public void setCentury(int century) {
	this.century = century;
	}
	public int getHalfcentury() {
	return halfcentury;
	}
	public void setHalfcentury(int halfcentury) {
	this.halfcentury = halfcentury;
	}
	public String getTeam() {
	return team;
	}
	public void setTeam(String team) {
	this.team = team;
	}
	}

