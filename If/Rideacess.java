package com.kn.If;

import java.util.Scanner;

public class Rideacess {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		boolean isage=allowedage(age);
		if(isage== true) {
		System.out.println("Ride acess granted");
		}
		
	}

	 static boolean allowedage(int age) {
		if(age>=12) {
		return true;
	}
		return false;

}}
