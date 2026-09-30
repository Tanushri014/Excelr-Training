package day3;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Menu for Operations");
		System.out.println("1 for +");
		System.out.println("2 for -");
		System.out.println("3 for *");
		System.out.println("4 for /");
		System.out.println("0 to exit");
		int choice=0;
		do {
			System.out.println("\nEnter your number first num");
			int num1=sc.nextInt();
			System.out.println("Enter your number second num");
			int num2=sc.nextInt();
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print(num1+num2);
				break;
			case 2:
				System.out.print(num1-num2);
				break;
			case 3:
				System.out.print(num1*num2);
				break;
			case 4:
				System.out.print(num1/num2);
				break;
			case 0:
				System.out.print("exiting....");
				System.exit(0);
			default : System.out.print("invalid output");
			}
			
		}
			while(choice!=0);
		
		
		
		
		
			
	

	}

}
