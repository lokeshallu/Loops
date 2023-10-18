package com.kn.If;

import java.util.Scanner;

public class VotingElgiblility {
	public static void main(String[] args) {
		System.out.println("enter your age ");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		boolean yourage=isyourage(age);
		if(yourage==true) {
		System.out.println("Voter registration elgible");
	}
		}

	 static boolean isyourage(int age) {
		if(age>=18) {
		return true;
	}
		return false;

}}
