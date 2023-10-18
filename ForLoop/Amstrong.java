package com.kn.ForLoop;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num =scan.nextInt();
		Amstromg(num);
		
	}


    static void Amstromg(int num) {
		int digit; int sum=0;int temp=num;
		while(num>0) {
			digit = num%10;
			sum = (sum)+(digit*digit*digit);
			num = num/10;
		}if(temp==sum) {
			System.out.println("this number is Amstrong"+num);
		}else {
			System.out.println("not a Amstron number");
		}
		
	}}
