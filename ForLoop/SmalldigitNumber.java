package com.kn.ForLoop;

import java.util.Scanner;

public class SmalldigitNumber {
	public static void main(String[] args) {
		System.out.println("enter");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		smaalldigit(num);
	}

	 static void smaalldigit(int num) {
       int smallest =num%10;
      while(num>0){
    	int r =num%10;
    	if(r<smallest) {
    		smallest=r;
    	}
    	num/=10;
    	}System.out.println(smallest);
      }
      
    		  
		
	}


