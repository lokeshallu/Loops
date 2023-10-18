package com.kn.ElseifLdder;

import java.util.Scanner;

public class CategorizedIntegers {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		isPositiveNegativeInteger(number);
		
		scan.close();
	}

	static void isPositiveNegativeInteger(int number) {
		if(number>0) {
			System.out.println("the given number is positive");
		}else if(number<0) {
			System.out.println("the given number is negative");
		}else {
			System.out.println("the given number"+number);
		}

	
}}
//out put:-
/*Enter a number
25
Positive
*//*Enter a number
0
Zero*/
/*Enter a number
-12
Negative*/