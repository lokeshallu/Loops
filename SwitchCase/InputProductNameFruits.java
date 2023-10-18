package com.kn.SwitchCase;

import java.util.Scanner;

public class InputProductNameFruits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tokenNumber = scan.nextInt();
		nameoftheproduct(tokenNumber);
		
	}

	static void nameoftheproduct(int tokenNumber) {
		switch (tokenNumber){
		case 1:{
			System.out.println("Coke");
			break;
		}
		case 2:{
			System.out.println("Pepsi");
			break;
		}
		case 3:{
			System.out.println("Water");
			break;
		}
		case 4:{
			System.out.println("Juice");
			break;
		}
		case 5:{
			System.out.println("Tea");
			break;
		}default:
		}
		
	}

}
