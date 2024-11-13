package com.controller;

import java.util.List;

import com.entity.Player;
import com.service.Teamservice;

public class Teamcontroller {
	
	public List<Player> getMiteamcontroller() {
		
		//System.out.println("getAllteamcontroller11");
		
		Teamservice b=new Teamservice();
		List<Player> c=b.getAllTeamservice();
		
		return c;
		
	}
	public List<Player> getCskteamcontroller2() {
		
		Teamservice c=new Teamservice();
		List<Player>d=c.getAllTeamservice2();
		return d;
		
	}
	
	/*public List<Player> getRcbteamcontroller3(){
		
		Teamservice e=new Teamservice();
		List<Player>f=e.getAllTeamservice3();
		return f;
	}*/

}
