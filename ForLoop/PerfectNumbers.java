package com.kn.ForLoop;

import java.util.Scanner;

public class PerfectNumbers {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
				perefect(num);
		
	}

	 static void perefect(int num) {
		int i =1; int sum=0;
		while(i<num) {
			if(num%i==0) {
				sum = sum+i;
			}i++;
		}if(sum==num) {
		System.out.println(sum+"perfect");
		
	}
	 }
}
