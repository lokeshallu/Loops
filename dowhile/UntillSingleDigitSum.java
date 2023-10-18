package com.kn.dowhile;

import java.util.Scanner;

public class UntillSingleDigitSum {
	public static void main(String[] args) {
		System.out.println("enter");
		Scanner Scan = new Scanner(System.in);
		int num = Scan.nextInt();
		findsingledigit(num);
	}

	 static void findsingledigit(int num) {
		
		 while(num>10) {
			 int sum=0;
			 while(num!=0) {
				 int r = num%10;
				 sum = sum+r;
				 num = num/10;
			 }num=sum;
		 }System.out.println(num);
	}
	 }
