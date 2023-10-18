package com.kn.ForLoop;

import java.util.Scanner;

public class SquarerootofNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		squareroot(num);
	}

	  static void squareroot(int num) {
		double squareroot=Math.sqrt(num);
		System.out.println(squareroot);
		
	}

}
