package day22;

public class RecurrsionDemo2 {

	public static void main(String[] args) {
		System.out.println("I am main");
		int b=brazil();
		int final_ans=3+b;
		System.out.println(" I am finally back in main"+final_ans);
	}
private static int brazil() {
	int b=10;
	System.out.println(b);
	int f=france();
	
	b=10+f;
	System.out.println(b);
	System.out.println("i am back in main");
	return b;
	
}
private static int france() {
	int f=10;
	System.out.println(f);
	System.out.println("returning f to brazil");
	return f;
	
}
}
