package com.kn.ForLoop;

import java.util.Scanner;

public class Fibonacciseries {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int range = scan.nextInt();
		fibonacci(range);
				
	}

	static void fibonacci(int range) {
		int firstnumber =0,secondnumber=1;
		int nextnumber = 0;
		for(int i=0;i<=range;i++) {
			nextnumber = firstnumber+secondnumber;
				firstnumber = secondnumber;
				secondnumber = nextnumber;
			}System.out.println("nextnumber"+nextnumber);
			
		}
		
	}


