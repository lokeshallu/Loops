package com.kn.ElseifLdder;

import java.util.Scanner;

public class Categorizedages {

	public static void main(String[] args) {
		System.out.println("enter age chcking for which categorie are you");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		 iscategorized(age);
        scan.close();
        }

	static void iscategorized(int age) {
	
	if(age<=12) {
		System.out.println("Child");
	} 
	else if(age>=13 && age<=19)
	{
		System.out.println("Teen");
	}
	else if(age>=20 && age<=59) {
		System.out.println("Adult");
	}
	else
	{
		System.out.println("Senior Citizen");

}

}}
