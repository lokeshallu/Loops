package com.kn.Nestedif;

import java.util.Scanner;

public class Universityeligblecheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double cgpa = scan.nextDouble();
		int credits = scan.nextInt();
		elgiblefordegree(cgpa,credits);
	}

	 static void elgiblefordegree(double cgpa, int credits) {
		if(cgpa > 3.5) {
			if(credits>120) {
		}System.out.println("Elgible for Honors Degree");
		
	}

}}
