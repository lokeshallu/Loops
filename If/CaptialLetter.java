package com.kn.If;

import java.util.Scanner;

public class CaptialLetter {
	public static void main(String[] args) {
		System.out.println(" enter letter");
		Scanner scan = new Scanner(System.in);
		char letter = scan.next().charAt(0);
		boolean captial=iscaptia(letter);
		if(captial==true) {
			System.out.println("Captial lettre detected");
		}
	}

	 static boolean iscaptia(char letter) {
		if(letter >='A' && letter <='Z') {
		
	}
		return true;

}}
//output:-
