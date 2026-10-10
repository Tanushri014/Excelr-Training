package day8;

public class ExceptionDemo {

	public static void main(String[] args) {
		int num=10;
		int deno=0;
		try {
			double result=num/deno;
			System.out.println(result);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}

}
