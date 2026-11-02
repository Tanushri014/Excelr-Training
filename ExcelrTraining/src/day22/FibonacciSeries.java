package day22;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number for fibonacchi series");
int num=sc.nextInt();
fibonacchi(num);
	}
	private static void fibonacchi(int num) {
		int n1=0;
		int n2=1;
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		for(int i=0;i<num;i++) {
			int n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			
		}
	}

}
