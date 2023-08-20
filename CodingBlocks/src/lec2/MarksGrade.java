package lec2;

import java.util.Scanner;

public class MarksGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks");
		int marks = sc.nextInt();

		if (marks > 100 || marks < 0) {
			System.out.println("Invalid");
		} else if ((marks > 80) && (marks <= 100)) {
			System.out.println("Grade A");
		} else if ((marks > 60) && (marks <= 80)) {
			System.out.println("Grade B");
		} else if ((marks > 50) && (marks <= 60)) {
			System.out.println("Grade C");
		} else if ((marks > 40) && (marks <= 50)) {
			System.out.println("Grade D");
		} else if ((marks > 30) && (marks <= 40)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		sc.close();
	}

}
