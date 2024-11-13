package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.entity.Player;

public class Dao {

	public List<Player> getAllPlayersofMiTeam() { // mi method

		List<Player> mi = new ArrayList<Player>(); // mi team obj
//          Player a=new Player();
//          a.setRuns(1000);
		System.out.println();
		System.out.println("            MUMBAI INDIANS1       ");
		System.out.println();

		mi.add(new Player("Rohit sharma", 45, 6628, 15));
		mi.add(new Player("Hardik Pandya", 33, 2525, 64));
		mi.add(new Player("Suryakumar Yadav", 63, 3594, 3));
		mi.add(new Player("Ishan Kishan", 23, 2644, 0));
		mi.add(new Player("Dewald Brevis", 17, 230, 1));
		mi.add(new Player("Tilak Varma", 9, 1156, 0));
		mi.add(new Player("Jasprit Bumrah", 93, 69, 165));
		mi.add(new Player("Tim David", 16, 659, 0));
		mi.add(new Player("Romario Shepherd", 16, 6628, 15));
		mi.add(new Player("Mohammad Nabi", 65, 3228, 30));

		return mi;
	}

	
	  public List<Player> getAllPlayerofCskTeam(){
	  
	  List<Player> csk=new ArrayList<Player>();
	  System.out.println("Chennai Super Kings"); csk.add(new
	  Player("MSD",7,3454,1)); csk.add(new Player("MSD",7,3454,1)); csk.add(new
	  Player("MSD",7,3454,1)); csk.add(new Player("MSD",7,3454,1)); csk.add(new
	  Player("MSD",7,3454,1)); csk.add(new Player("MSD",7,3454,1)); csk.add(new
	  Player("MSD",7,3454,1)); csk.add(new Player("MSD",7,3454,1));
	  
	  return csk; }
	  
	  
	 /* public List<Player> getAllPlayerofRcbTeam(){
	  
	  List<Player> rcb=new ArrayList<Player>();
	  System.out.println("Royal challegers Bangaloro");
	  
	  rcb.add(new Player("Virat",18,7000,0));
	  
	  return rcb;
	  
	  }*/
	  
	 
}
