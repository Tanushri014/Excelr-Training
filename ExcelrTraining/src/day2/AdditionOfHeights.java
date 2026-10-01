package day2;

import java.util.Scanner;

public class AdditionOfHeights {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your HEIGHT 1:");
		double height1=sc.nextDouble();
		
		System.out.println("enter your HEIGHT  2:");
		double  height2=sc.nextDouble();
		double result= height1+ height2;
		System.out.println("sum of HEIGHTS is:"+result);
		

	}

}
