package com.kn.Nestedif;

import java.util.Scanner;

public class TraficManagement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		int eyescore = scan.nextInt();
		isEgible(age,eyescore);
	}

	 static void isEgible(int age, int eyescore) {
		if(age>=18) {
			if(eyescore>=6) {
				System.out.println("Driving Licence Eligible");
			}else {
				
			}
		}
		
	}

}
