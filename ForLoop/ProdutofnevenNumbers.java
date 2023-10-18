package com.kn.ForLoop;

import java.util.Scanner;

public class ProdutofnevenNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		productevennumbers(num);
	}

	 static void productevennumbers(int num) {
		 int digit;int sum=1;int i=2;
		 while(i<=num) {
			 if(i%2==0) {
				 sum =sum*i; 
			 }i++;
			 
		 }System.out.println(sum); 
		 
		
		
	}

}
