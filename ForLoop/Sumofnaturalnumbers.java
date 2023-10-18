package com.kn.ForLoop;

import java.util.Scanner;

public class Sumofnaturalnumbers {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num = scan.nextInt();
		isnaturalNumbers(num);
				
	}

	 static void isnaturalNumbers(int num) {
		 int sum=0;
		for(int i=1;i<=100;i++) {
			sum = sum+i ;{
			System.out.println(+sum );
		}
		
	}}

}
