package com.kn.SwitchCase;

import java.util.Scanner;

public class Corresppondingletters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		englishword(num);
	}

	 static void englishword(int num) {
		switch (num) {
		case 1 :{
			System.out.println("one");
		}
		case 2 :{
			System.out.println("two");
		}
		case 3 :{
			System.out.println("three");
		}
		case 4 :{
			System.out.println("four");
		}
		case 5 :{
			System.out.println("five");
		}
		case 6 :{
			System.out.println("six");
		}
		case 7 :{
			System.out.println("seven");
		}
		case 8 :{
			System.out.println("eight");
		}
		case 9 :{
			System.out.println("nine");
		}
		default:
		
		}
		
	}

}
