package com.kn.ForLoop;

import java.util.Scanner;

public class Productofdigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num =scan.nextInt();
		product(num);
	}

	 static void product(int num) {
		int digit;int sum=1;
		while(num>0) {
			digit=num%10;
			sum = sum*digit;
			num=num/10;
		}System.out.println(sum);
		
		
	}

}
