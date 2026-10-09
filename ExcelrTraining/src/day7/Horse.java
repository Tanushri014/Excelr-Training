package day7;

public class Horse implements Animal {
	//it is mandatory for the implementing class to override all the abstract method 
	

	@Override
	public void eat() {
		System.out.println("Horse eating..");
	}

	@Override
	public void sleep() {
		System.out.println("Horse sleeping..");
	}

	@Override
	public void run() {
		System.out.println("Bengal Tiger runnig..");
		
	}
}
