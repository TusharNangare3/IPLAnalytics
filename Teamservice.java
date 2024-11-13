package com.service;

import java.util.List;

import com.dao.Dao;
import com.entity.Player;

public class Teamservice {
	
	
	public List<Player> getAllTeamservice(){
		
		//System.out.println("getAllTeamservice22");
		Dao d1=new Dao() ;
	   List<Player> a= d1.getAllPlayersofMiTeam();
	   
		
		return a;
		
		
		
	}
	public List<Player> getAllTeamservice2(){
		Dao d2=new Dao();
		List<Player> b= d2.getAllPlayerofCskTeam();
		return b;
		
	}
	
	/*public List<Player> getAllTeamservice3(){
		Dao d2 =new Dao();
		List<Player> c=d2.getAllPlayerofRcbTeam();
		 return c;
	}*/
	
	

}
