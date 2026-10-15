package day14;

public class LambdaFunctionDemo {

	public static void main(String[] args) {
		Greeting g1= (name) -> {
			System.out.println("Welcome to FSD, "+name);
		};
		g1.greet("Rohit");
		
		
		
Shape s1= (r)-> Math.PI*r*r;
		
		double areaOfCircle=s1.area(5);
		System.out.println(areaOfCircle);
	}
//normal function 
	public static void greet() {
		System.out.println("Hello");
	}
	
	//rules to convert normal function into the 
			//1 no acess specifier
			//2  no return type 
			//3 no method name 
			
			
	
//	
//	()->{
//		System.out.println("Hello");
//	};
	
}
