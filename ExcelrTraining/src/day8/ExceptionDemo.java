package day8;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter your numerator");
		int num=sc.nextInt();
		System.out.println("Enter your denominator");
		int deno=sc.nextInt();
		
			double result=num/deno;
			System.out.println(result);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		catch(InputMismatchException ex) {
			System.out.println(ex);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}

}
