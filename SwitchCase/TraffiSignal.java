package com.kn.SwitchCase;

import java.util.Scanner;

public class TraffiSignal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String colour = scan.nextLine();
		function(colour);
	}

	static void function(String colour) {
		switch (colour) {
		case "red":{
			System.out.println("STOP");
			break;
		}
		case "green":{
			System.out.println("go.......>>>>>>>>>>");
			break;
		}
		case "yellow":{
			System.out.println("........Ready....");
			break;
		}default:
		
		
		
	}
	}
}
