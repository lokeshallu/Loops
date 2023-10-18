package com.kn.ForLoop;

import java.util.Scanner;

public class ReverseTheNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your number");
		int num = scan.nextInt();
		reverse(num);
		
	}

	 static void reverse(int num) {
		int sum=0;int digit;int temp =num;
		while(num > 0) {
			digit = num%10;
			sum = (sum*10 )+(digit);
			num = num/10;
		}
		System.out.println("sum"+sum);
		
	}

}
