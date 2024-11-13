package com.entity;

public class Player {
	
	private String Name;
	private int JerseyNo;
	private int Runs;
	private int Wickets;
	
	
	public Player() {
		super();
	}


	public Player(String Name, int JerseyNo, int Runs, int Wickets) {
		super();
		this.Name = Name;
		this.JerseyNo = JerseyNo;
		this.Runs = Runs;
		this.Wickets = Wickets;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getJerseyNo() {
		return JerseyNo;
	}


	public void setJerseyNo(int jerseyNo) {
		this.JerseyNo = jerseyNo;
	}


	public int getRuns() {
		return Runs;
	}


	public void setRuns(int runs) {
		this.Runs = runs;
	}


	public int getWickets() {
		return Wickets;
	}


	public void setWickets(int wickets) {
		this.Wickets = wickets;
	}


	@Override
	public String toString() {
		return "Player [Name=" + Name + ", JerseyNo=" + JerseyNo + ", Runs=" + Runs + ", Wickets=" + Wickets + "]";
	}
	
	
	
	

}
