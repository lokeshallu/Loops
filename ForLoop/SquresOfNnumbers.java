package com.kn.ForLoop;

import java.util.Scanner;

public class SquresOfNnumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		suares(num);
	}

	 static void suares(int num) {
		int sum=0;int digit;
		while(num>0) {
		digit = num%10;
		sum = sum+(digit*digit);
		num =num/10;
			
		}System.out.println("squares"+sum);
	
}
			
		
	 }


