package day8;
import java.util.Scanner;

public class CustomeExceptionDemo {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter your quantity");
int quant=sc.nextInt();
try {
	if(quant>50) {
		System.out.println("Good to go");
	}
	else {
		throw new LowQuantity("less quantity");
		
	}
}
catch(LowQuantity ex) {
	
		System.out.println(ex.getMessage());
		
	
}

	}

}
