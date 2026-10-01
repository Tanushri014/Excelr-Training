package day2;

import java.util.Scanner;

public class IfCondition {
//conditional statement 
	//else will not have condition
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your percentage:");
		double per=sc.nextDouble();
		if(per>35.0) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		

	}

}
