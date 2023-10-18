package com.kn.SwitchCase;

import java.util.Scanner;

public class SolarSystem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		space(name);
	}

	 static void space(String name) {
		switch (name) {
		case "Mercury":{
			System.out.println("1");
			break; 
			}
		case "Venus":{
			System.out.println("2");
			break;
		}
		case "Earth":{
			System.out.println("3");
			break;
			}
		case "mars":{
			System.out.println("4}");
			break;
			}
		case "Jupiter":{
			System.out.println("5");
			break;
			}
		case "Sature":{
			System.out.println("6");
			break;
			}
		case "Uranus":{
			System.out.println("7");
			break;
			}
		case "Neptune":{
			System.out.println("8");
			break;
			
		}
		
		}
		
		
	}

}
