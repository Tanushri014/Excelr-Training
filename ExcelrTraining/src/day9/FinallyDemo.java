package day9;

import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number:");
         int n1 = sc.nextInt();
         System.out.println("Enter number:");
         int n2 = sc.nextInt();
try {
	double result = divide(n1, n2);
	System.out.println(result);
}
     catch(ArithmeticException ex) { 
    	 System.out.println("Exception occured");
    	 
     }
finally {
	System.out.println("finaly block");
}

	}
	public static double divide(int a, int b) {
	    return a / b;   // throws ArithmeticException if b == 0
	}

}
