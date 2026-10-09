package day6;
import java.util.Scanner;
public class StudentArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student fsdArray[]=new Student[3];
		for(int i=0;i<fsdArray.length;i++) {
			
			
			System.out.println("Please enter roll number");   
			int a=sc.nextInt();
			
			System.out.println("Please enter Student name");  
			String b=sc.next(); 
			
			System.out.println("Please enter Percentage");     
			double c=sc.nextDouble();
			
			fsdArray[i]=new Student(a,b,c);
			
		}
		
		
		
		for(int i=0;i<fsdArray.length;i++)
			fsdArray[i].displayStudent();

	

	}

}
