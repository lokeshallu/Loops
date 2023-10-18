package com.kn.ForLoop;

import java.util.Scanner;

public class Sumofseries {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		series(n);
		
	}

	 static void series(int n) {
	 double sum=0.0;double i =1;
	 while(i<=n) {
		 sum = sum+(1/i);
		 i++;
	 }System.out.println("sum"+sum);
		
	}

}
