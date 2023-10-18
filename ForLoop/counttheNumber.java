package com.kn.ForLoop;

import java.util.Scanner;

public class counttheNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		countnumber(num);
	}

	 static void countnumber(int num) {
		 int count=0;
		while(num>0){
			num=num/10;
			count++;
			
		}
		System.out.println("count="+count);
		
	 }

}
