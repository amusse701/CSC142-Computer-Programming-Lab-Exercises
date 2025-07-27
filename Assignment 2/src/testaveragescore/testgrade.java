package testaveragescore;

import java.util.Scanner;

public class testgrade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Score 1: ");
		double score1 = scanner.nextInt();
		
		System.out.print("Enter Score 2: ");
		double score2 = scanner.nextInt();
		
		System.out.print("Enter Score 3: ");
		double score3 = scanner.nextInt();
		
		double average = (score1 + score2 + score3)/3.0;
		
		
		String grade;
		
		if (average >= 90) {
			grade = "A";
		} else if (average >= 80) {
			grade = "B";
		} else if (average >= 70) {
			grade = "C";
		} else if (average >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
				
		System.out.println("Average: " + average);
		System.out.println("Grade: " + grade);
		
		scanner.close();
	}
}
