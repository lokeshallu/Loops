package com.kn.Nestedif;

import java.util.Scanner;

public class LoanApprovel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age =scan.nextInt();
		int income =scan.nextInt();
		loanApproved(age,income);
	}

	static void loanApproved(int age, int income) {
		if(age>=18) {
			if(income>=5000) {
				System.out.println("Loan Approved");
			}
		}else {
			
		}
		
	}

}
