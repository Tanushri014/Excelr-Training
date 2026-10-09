package day6;

public class StudentDemo {

	public static void main(String[] args) {
		Student st=new Student();
		
		
		st.acceptStudent();
		
		st.displayStudent();
		
		st.search(7);
		
		st.search("Maya");
		
		st.setRollNumber(333);	//setter to write the private variables
		
		System.out.println("RollNumber is "+st.getRollNumber()); //getter to read the private variables
		

	}

}
