package day22;

public class Factorial {

	public static void main(String[] args) {
		int num=5;
		int factorial=factorial(num);
		System.out.println(factorial);

	}
	private static int factorial(int n) {
		//base condition --without this we will get stack overflow 
		if(n==1) {
			return 1;
		}
		//5*factorial(5-1=4)
		//4*factorial(4-1=3)
		//3*factorial(3-1=2)
		//2*factorial(2-1=1)
		//1
		//here this time in factorial n==1 so it will return 1 ;
		//1
		//2*1
		//3*2
		//4*6
		//5*24
		//displays 120
		return n*factorial(n-1);
	}

}
