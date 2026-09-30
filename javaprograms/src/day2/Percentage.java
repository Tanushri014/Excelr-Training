package day2;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your percentage..");
		double per=sc.nextDouble();
		if(per>=75) {
			System.out.println("DIST");
		}
		else if(per>=60) {
			System.out.println("First Class");
		}
		else if(per>=50) {
			System.out.println("Second class");
		}
		else if(per>40) {
			System.out.println("Pass class");
		}
		else {
			System.out.println("Not Pass");
		}
	}

}
