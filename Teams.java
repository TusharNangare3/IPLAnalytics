package com.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.controller.Teamcontroller;
import com.entity.Player;

public class Teams{
	
	public static void main(String[] args) {
		
		
		//System.out.println("     IPL TEAMS       ");
		//System.out.println("-----------------------------------------------");
		
		
		
		//List<Player> mi=new ArrayList<Player>();
		//List<Player> csk=new ArrayList<Player>();
		List<Player> rcb=new ArrayList<Player>();
		
		while(true) {
		
		
		System.out.println("IPL Teams");
		System.out.println("1.Mumbai Indians");
		System.out.println("2. Chennai Super Kings");
		System.out.println("3. Royal Challengers Bangaluro");
		System.out.println("4. Exit");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice =sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println(choice);
		
			Teamcontroller objcon=new Teamcontroller();
			List<Player> mi=objcon.getMiteamcontroller();
			
			 
		for(Player m: mi) {
			System.out.println(m);
			
		}
			
		break;
	
		
		case 2:
			System.out.println(choice);
			Teamcontroller obj2=new Teamcontroller();
			List<Player>csk=obj2.getCskteamcontroller2();
			
			for(Player c:csk ) {
				System.out.println(c);
			}
			
			
			
			break;
	
		/*case 3:
			System.out.println(choice);
			Teamcontroller obj3=new Teamcontroller();
			rcb=obj3.getRcbteamcontroller3();
			
			for(Player r:rcb) {
				System.out.println(r);
			}
			
			break;*/
		
		case 4:
			System.out.println(choice);
			break;
			
			default :                       //default enter value display invalid input
				System.out.println("Invalid Input");
					break;}
		
		if(choice==4) {
			break;
			
			
		
		}
			}}}
