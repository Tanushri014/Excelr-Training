package day2;
import java.util.Scanner;
public class AdditionOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter age of person1");
//		
//		int num1=sc.nextInt();
//		System.out.println("Enter age of person2");
//		int num2=sc.nextInt();
//		int sum=num1+num2;
//		System.out.println("output is"+sum);
//		
		
		// datattypes
		
//		System.out.println("enter name");
//		String st=sc.next();
//		System.out.println(st);
		//pass or fail conditional statement 
		System.out.println("Enter your percentage");
		double percentage=sc.nextDouble();
		if(percentage>=40.0) {
			System.out.println("You are pass");
			
		}
		else {
			System.out.println("You are failed");
		}
		System.out.println("Thank you");
		

	}

}
