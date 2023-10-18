package com.kn.ForLoop;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		isfactorial(num);
		
	}

      static void isfactorial(int num) {
		int fact = 1;
		for( int i=num;i<=5;i++) {
			fact = fact*i;
				System.out.println("fact is"+fact);
			}
			
		}
		
	}


