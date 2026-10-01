package day3;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter your number:");
		int num=sc.nextInt();
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println("perfect Number");
		}
		else {
			System.out.println("Not a perfect Number");
		}
		

	}

}
