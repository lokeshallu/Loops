package com.kn.ForLoop;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		ispalindrome(num);
	}

	 static void ispalindrome(int num) {
		 int digit;int sum=0;int temp=num; 
		while(num>0) {
			digit =num%10;
			sum=(sum*10)+digit;
			num = (num/10);
			
		}
//		if(temp==sum) {
			System.out.println("is palindrome"+sum);
//		}
//	 else {
//			System.out.println("not");
//		}
		
	}}

	 
		
	
	

	 
