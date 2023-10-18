package com.kn.ForLoop;

import java.util.Scanner;

public class Largestdigit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int range = scan.nextInt();
		boolean palindrome = ispalindrome(range);
		isLarge(range);
		
	}

	private static void isLarge(int range) {
		int i=range, digit;int temp = -1;
		while(range>0) {
			digit = range%10;
			if(digit>temp) {
				temp=digit;
			}
		}
		
	}



	

		
	}}
	
			
	


