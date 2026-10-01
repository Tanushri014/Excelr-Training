package day2;
import java.util.Scanner;
public class NestedIfElse {

	public static void main(String[] args) {
		Scanner    sc = new Scanner(System.in);   
		
			System.out.println("Enter your percentage");       
			
			double percentage=sc.nextDouble();  
			
			
			if(percentage>=75.0)  
			{					  
				System.out.println("DIST");   
			}
			else if(percentage>=60.0)  
			{					  
				System.out.println("First Class");   
			}
			else if(percentage>=40.0)  
			{					  
				System.out.println("Pass Class");   
			}
			else
			{
				System.out.println("Not Pass");
			}

	}

}
