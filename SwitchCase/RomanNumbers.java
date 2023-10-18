package com.kn.SwitchCase;

import java.util.Scanner;

public class RomanNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String roman = scan.nextLine();
		romannumber(roman);
	}

	 static void romannumber(String roman) {
		switch (roman) {
		case "I":{
			System.out.println("1");
			break;
		}	
		   case "II":{
			System.out.println("2");
			break;
		
		}	
		   case "III":{
			System.out.println("3");
			break;
		   }	
		   case "IV":{
			System.out.println("4");
			break;
		   }	
		   case "V":{
			System.out.println("5");
			break;
		
		}default:
		
		}
		
	}

}
