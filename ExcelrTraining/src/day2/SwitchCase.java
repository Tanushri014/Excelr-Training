package day2;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		
		System.out.println("1. English");       
		System.out.println("2. Hindi");
		System.out.println("3. Marathi");
		
		System.out.println("Enter Choice");   
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: System.out.println("You have choosed English Language:"); break; 
		
		case 2: System.out.println("You have choosed Hindi Language:");  break; 
		
		case 3: System.out.println("You have choosed Marathi Language:"); break;   

		default : System.out.println("Plase select Valid choice");
		
		}
		
		System.out.println("Have a nice day ahead!!!");
	}
}

