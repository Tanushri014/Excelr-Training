package day9;
import java.util.Scanner;
public class ThrowsDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your number:");
		int numerator=sc.nextInt();
		
		System.out.println("Enter your number:");
		int denominator=sc.nextInt();
		
		try {
			double ans=divide(numerator,denominator);
			System.out.println(ans);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		

	}
	public static double divide(int numerator,int denominator) throws ArithmeticException {
		double result =numerator/denominator;
		return result;
	}
}
