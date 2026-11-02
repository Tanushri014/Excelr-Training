package day22;

public class RecurrsionDemo {

	public static void main(String[] args) {
		System.out.println("I am main");
		brazil();
		System.out.println("finally I am in main");
	}
private static void brazil() {
	System.out.println("brazil");
	
	brazil();
	System.out.println("this line is never rached ...stack overflow");
	
}

}
