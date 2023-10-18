package com.kn.ForLoop;

import java.util.Scanner;

public class isPrime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
	    boolean aprime=isprime(num);
	    if(aprime==true) {
	    	System.out.println("it is a prime number");
	    }else {
	    	System.out.println("it is not a prime number");
	    }
	 

		   
	}

	 static boolean isprime(int num) {
		boolean isaprime=true;
		int count=0;
		for(int i=2;i<=num;i++) {
			if(num%i == 0);
			 count++;
		
			}if(count==2) {
				return true;
			}
		return false;
		
	
		
			
		

		}

	
		
		
	}


