package day4;
import java.util.Scanner;
public class Array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int arr[]= {23,8,6,40,28};
	
	int num;
	for(int i=0;i<arr.length;i++) {
		int counter=0;
		num=arr[i];
		
		for(int j=1;j<=num;j++)
		{
			
			if(num%j==0)
			{
				counter++;
			}
		}
		
		if(counter==2)
		{
			System.out.println(arr[i] +" is Prime");
		}
		else
		{
			System.out.println(arr[i] +" is Not Prime");
		}
		
		
	}
	//prime numbers
	
	
	

	
}
}
