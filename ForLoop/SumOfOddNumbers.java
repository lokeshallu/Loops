package com.kn.ForLoop;

import java.util.Scanner;

public class SumOfOddNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		odd(num);
	}

	 static void odd(int num) {
		int digit;int sum=1; int i=1;
		while(i<=num) {
			if(i%2 !=0) {
			sum =sum *i;
//				System.out.println(sum);
			
				
			}i++;
			
		}System.out.println(sum);
			
		
		
	}

}
