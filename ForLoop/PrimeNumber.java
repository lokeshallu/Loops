package com.kn.ForLoop;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		isprime(num);
		
	}

	 static void isprime(int num) {
		  int count =0;
		  for(int i=1;i<=num;i++) {
			  if(num%i==0) {
				  count++;
			  }
		  }
			  if(count==2) {
				  System.out.println("prime");
			  }else {
				  System.out.println("not prime");
			  }
			  }
		  
		  }
	 
	 
	 


