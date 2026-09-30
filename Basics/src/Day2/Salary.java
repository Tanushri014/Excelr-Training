package Day2;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Salary");
			double salary=sc.nextDouble();
			if (salary>=75000)
			{
				System.out.println("Excellent");
				}
			else if (salary>=60000)
			{
				System.out.println("V good");
			}
			else if(salary>=50000)
			{
				System.out.println("Good");
			}
			else if(salary>=25000)
			{
				System.out.println("Ok");
			}
			else if (salary< 25000)
			{
				System.out.println("Not Ok");
			}
			else
			{
			System.out.println("Thankyou!!");
			}

		}

	}

	
	
