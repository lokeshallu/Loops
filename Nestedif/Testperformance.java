package com.kn.Nestedif;

import java.util.Scanner;

public class Testperformance {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test1=scan.nextInt();
		int test2=scan.nextInt();
		int test3=scan.nextInt();
		 performance(test1,test2,test3);
		 scan.close();
		
	}

	 static void performance(int test1, int test2, int test3) {
		 if(test1>50 && test2>50 && test3>50) {
			 System.out.println("All passed");
		 }else if(test1+test2+test3  / 3>50) {
			 System.out.println("Average passed");
		 }
		
}
}

