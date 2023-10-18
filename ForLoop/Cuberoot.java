package com.kn.ForLoop;

import java.util.Scanner;

public class Cuberoot {
	public static void main(String[] args) {
		System.out.println("enter your number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		cube(num);
	}

	 static void cube(int num) {
	double cube = Math.cbrt(num);
	System.out.println("the given number cuberoot is="+cube);
		
	}

}
