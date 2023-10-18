package com.kn.Nestedif;

import java.util.Scanner;

public class CalenderFacts {

	public static void main(String[] args) {
		System.out.println("enter year");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		isyear(year);

	}

	 static void isyear(int year) {
		if(year%4==0 || year%100 == 0 || year%400==0) {
			
			if(year>=2000 && year<=2100) {
				System.out.println("21 st century leep year");
			}else {
				System.out.println("Leap Year");
		}
			
		}
		
	}

}
