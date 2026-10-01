package day3;
import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		//approach 2
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number:");      
		int num=sc.nextInt();
		
		boolean flag=true;
		
		for(int i=2;i<=num/2;i++)
		{
			
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		
		if(flag==true)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
		
		


	}

}
