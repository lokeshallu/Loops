package com.kn.ElseifLdder;

import java.util.Scanner;

public class DifferntCharacters {
	public static void main(String[] args) {
		System.out.println("ENTER  ");
		Scanner scan = new Scanner(System.in);
		char c =scan.next().charAt(0);
		ischaracter(c);
		
	}

	static void ischaracter(int c) {
		int unicode = (int)c;
		if(unicode>=65 && unicode<=90) {
			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
			System.out.println("upper case vowels");
			
			}else {
				System.out.println("upper case cosonents");
			}
	}else if(unicode>=97 && unicode<=122) {
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
		System.out.println("lower case vowels ");
		
		}else {
			System.out.println("lower case cosonents");
		}
			
		}else if(unicode>=48 && unicode<=57) {
			System.out.println("digits");
		}else {
			System.out.println("special characters");
		}

	

}}

//out put:-
/*ENTER  
A
upper case vowels*/
/*ENTER  
@
special characters*/
