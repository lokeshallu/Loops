package com.kn.Nestedif;

import java.util.Scanner;

public class SelectingCandidates {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int experience = scan.nextInt();
		int skill = scan.nextInt();
		issuitable(experience,skill);
	
		
	}

     static void issuitable(int experience, int skill) {
		if(experience>5 ) {
			if(skill>7) {
			}
			System.out.println("Suitable candidate");
		}
			
		}
}
