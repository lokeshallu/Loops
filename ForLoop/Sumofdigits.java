package com.kn.ForLoop;

import java.util.Scanner;

public class Sumofdigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter");
		int num = scan.nextInt(); 
		sumof(num);
	}

	 static void sumof(int num) {
		int digit; int sum=0;int temp=sum;
		while(num>0) {
		digit = num%10;
		sum = (sum)+(digit);
		num = num/10;
		
	 }
		System.out.println("sum of digit"+sum);
}
}
	


