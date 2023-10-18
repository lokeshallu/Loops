package com.kn.SwitchCase;

import java.util.Scanner;

public class Gardening {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String fertilizers = scan.nextLine();
			isplant(fertilizers);
		}

		  private static void isplant(String fertilizers) {
		
			switch (fertilizers) {
			case "roses":{
				System.out.println("Rose Food");
				break; 
				}
			case "sunflower":{
				System.out.println("All fertilizers");
				break;
			}
			case "Orchids":{
				System.out.println("orchi fertilizers");
				break;
				}
			case "Cacti":{
				System.out.println("catusmix");
				break;
				}
			case "Ferns":{
				System.out.println("organic compost");
				break;
				}
	
		}
		
		
	}

}
