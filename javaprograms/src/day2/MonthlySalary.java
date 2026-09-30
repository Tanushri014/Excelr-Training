package day2;

import java.util.Scanner;

public class MonthlySalary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Salary..");
		int sal=sc.nextInt();
		if(sal>=75000) {
			System.out.println("Excellent");
		}
		else if(sal>=60000) {
			System.out.println("very good ");
		}
		else if(sal>=50000) {
			System.out.println("good");
		}
		else if(sal>40000) {
			System.out.println("okay");
		}
		else {
			System.out.println("Not good");
		}

	}

}
