package com.kn.ForLoop;

import java.util.Scanner;

public class Primenumbersn {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		iseven(num);
	}

	static void iseven(int num) {
    	  
		for(int i=1;i<num;i++) {
		
		if(i%2==0) {
			System.out.println(i);
		}
		
	}

	}}
