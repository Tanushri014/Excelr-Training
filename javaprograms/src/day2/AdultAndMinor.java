package day2;
import java.util.Scanner;
public class AdultAndMinor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your age..");
		int age=sc.nextInt();
		if(age<0) {
			System.out.println("Age cannot be less than zero ");
		}
		else if(age>=18) {
			System.out.println("You are an adult");
		}
		else {
			System.out.println("You are a minor");
		}
	}

}
