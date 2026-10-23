package day14;

public class LambdaDemo {
	

			public static void main(String[] args) {	
				Printing p2=()->{
					System.out.println("Hello i am lambda ");
				};
				p2.print();
				
				Greeting g1=(name)->{
					System.out.println("Welcome "+name);
				};
				g1.greet("Alexander the great");
				
				Shape s1=(r)->{
					return Math.PI*r*r;
				};
				
				double answer=s1.area(5);
				System.out.println(answer);
				
				Sample s=(name,city)->{
					System.out.println("name:"+name+","+"city:"+city);
				};
				
				s.display("radha","mumbai");
			}
			
			
			


			//lambda function requires functionmal interface 
			
			//normal function
			public static void greet() {
				System.out.println("Hello");
			}
		}
