package com.kn.SwitchCase;

import java.util.Scanner;

public class gusessingtheName {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		sides(num);
		
	}

	 static void sides(int num) {
		switch (num) {
	 case 3 :{
			System.out.println("Triangle");
			break;
		}
	 case 4 :{
			System.out.println("quadrilateral");
			break;
		}
	 case 5 :{
			System.out.println("pentagon");
			break;
		}
	 case 6 :{
			System.out.println("Hexagon");
			break;
		}
	 case 7 :{
			System.out.println("heptagon");
			break;
		}
	 case 8 :{
			System.out.println("octagon");
			break;
		}
	 
		}} 

}
