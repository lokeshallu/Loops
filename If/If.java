package com.kn.If;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		boolean positive = ispositiveNumber(number);
        if(positive == true) {
        	System.out.println(+number+"  is a positive number");
        }
        
        scan.close();
	}

	 static boolean ispositiveNumber(int number) {
		if(number>= 0) 
		{
		return true;
		}
		return false;
	 }
}
		

	
	


