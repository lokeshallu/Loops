package com.kn.If;

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		boolean totalcost=istotalamount(amount);
		if(totalcost == true) {
			System.out.println("Discount of 20% applicable ");
		}
	}

	 static boolean istotalamount(int amount) {
		if(amount>200) {
		return true;
	}
		return false;

}}
