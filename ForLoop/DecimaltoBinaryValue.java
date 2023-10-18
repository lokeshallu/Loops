package com.kn.ForLoop;

import java.util.Scanner;

public class DecimaltoBinaryValue {
	public static void main(String[] args) {
		System.out.println("enter");
		Scanner scan = new Scanner(System.in);
	
		int decimalNumber= scan.nextInt();
		findBinaryvalue(decimalNumber);
	}

	private static void findBinaryvalue(   int decimalNumber) {
		int binary=0,pValue=1;
		while(decimalNumber>0) {
			int remainder = decimalNumber%2;
			binary +=pValue*remainder;
			pValue *=10;
			decimalNumber /=2;
			
		}System.out.println(binary);
		
	}

	
		
	

}
