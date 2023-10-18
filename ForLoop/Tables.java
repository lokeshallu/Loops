package com.kn.ForLoop;

import java.util.Scanner;

public class Tables {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
				tableis(num);
	}

	static void tableis(int num) {
//		int sum =0;
	for(int i=1;i<=20;i++) {
//		sum = sum+i;
		
		System.out.println(num+"*"+i+"="+(num*i));
	}
		
	}}


