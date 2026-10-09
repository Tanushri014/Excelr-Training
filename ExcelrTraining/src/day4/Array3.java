package day4;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		//array as input from user
		System.out.println("ENTER YOUR ELEMENTS :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		//array print
		for(int i=0;i<arr.length;i++) {
			System.out.println("Array element at "+ i+ "  is :"+arr[i]);
			
		}
		System.out.println("ODD NUMBERS:");
		//array odd numbers only 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				
				System.out.print(arr[i]+" ");
			}
			
			
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
			
		}
		//array sum of all elements 
		System.out.println("\nsum of all elemtns in array is:"+sum);

	}

}
