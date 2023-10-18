package com.kn.ForLoop;

import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		isgcd(num1,num2);
		
	}

	 static void isgcd(int num1, int num2) {
		int gcd = 0;
		 for(int i=1;i<=num1 && i<=num2;i++) {
			 
			 if(num1%i==0 && num2%i==0) 
				 gcd=i;
			 }
			 System.out.println(+gcd);
			
		 }
		
	}


