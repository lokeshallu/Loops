package com.kn.ForLoop;

import java.util.Scanner;

public class palindromeLargeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int range = scan.nextInt();
		boolean ispalindrome=palindrom(range);
		findlargestnumber(range);
	}

	 static void findlargestnumber(int num) {
		 int sum=0;int digit;int temp=num;
		 digit =num%10;
		 sum = (sum*10)+digit;
		 num = num/10;
		 if(temp==sum) {
			 return true;
		 }
		 return false;
		
		
	}

	private static boolean palindrom(int num) {
		// TODO Auto-generated method stub
		return false;
	}
}
	
	


