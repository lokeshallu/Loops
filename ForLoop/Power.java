package com.kn.ForLoop;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int base =scan.nextInt();
		int exponent =scan.nextInt();
		ispower(base,exponent);
	}

	 static void ispower(int base, int exponent) {
		 int power=1;
		for(int i=1;i<=exponent;i++) {
			power=power*base;
			
		}System.out.println(power);
		
	}

}
