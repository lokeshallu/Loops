package com.kn.ForLoop;

import java.util.Scanner;

public class PowersSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		power(num);
		
	}

	 static void power(int num) {
		double sum =0;
		for(int i=1;i<=num;i++) {
			sum = sum+Math.pow(i,2);
			
			
		}System.out.println(sum);
		
	}

}
