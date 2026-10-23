package day14;

public class LambdaDemo {
	

			public static void main(String[] args) {	
				Printing p2=()->{
					System.out.println("Hello i am lambda ");
				};
				p2.print();
			}
			//lambda function requires functionmal interface 
			
			//normal function
			public static void greet() {
				System.out.println("Hello");
			}
		}
