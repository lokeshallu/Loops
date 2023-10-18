package com.kn.SwitchCase;

import java.util.Scanner;

public class Library {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int books = scan.nextInt();
		isbookgenres(books);
	}

	  private static void isbookgenres(int books) {
	
	
		switch (books) {
		case 1:{
			System.out.println("Friction");
			break; 
			}
		case 2:{
			System.out.println("Non-Friction");
			break;
		}
		case 3:{
			System.out.println("Fantasy");
			break;
			}
		case 4:{
			System.out.println("Mystery");
			break;
			}
		case 5:{
			System.out.println("Biography");
			break;
		
			}default:
		
		
		
		}
		
		
	}

}

