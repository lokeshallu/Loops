package com.kn.SwitchCase;

import java.util.Scanner;

public class Resarent {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dish = scan.nextInt();
		iscalande(dish);
	}

	  static void iscalande(int dish) {
	
		switch (dish) {
		case 1:{
			System.out.println("Pasta");
			break; 
			}
		case 2:{
			System.out.println("Tacos");
			break;
		}
		case 3:{
			System.out.println("Sushi");
			break;
			}
		case 4:{
			System.out.println("Steak");
			break;
			}
		case 5:{
			System.out.println("Pizza");
			break;
			}
		case 6:{
			System.out.println("Lobster");
			break;
			}
		case 7:{
			System.out.println("Brunch");
			break;
			}default:
		
		
		
		}
		
		
	}

}


	
	

