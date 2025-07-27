package testaveragescore;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of checks: ");
		int checks = scanner.nextInt();
		
		double baseFee = 10.00;
		double checkfee;
		
		if (checks < 20) {
			checkfee = .10;
		} else if (checks >= 20 && checks <= 39 ) {
			checkfee = .08;
		} else if (checks >= 40 && checks <= 59 ) {
			checkfee = .06;
		} else {
			checkfee = .04;
		}
		
		double total = (baseFee + (checks * checkfee));
		
		System.out.println("Base fee: $" + baseFee);
		System.out.println("Fee per check: $" + checkfee);
		System.out.println("Toatal service charge: $" + total);
		
		scanner.close();
	}
}
