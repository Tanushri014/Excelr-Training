package day7;

public class Mumbai {

	public static void main(String[] args) {
		Abhishek a=new Abhishek();
		
		//child c=new Child();
		//used to acess all the methods present inside the child class 
		
		a.home();

		
		Amitabh ab=new Abhishek();
		//parent obj=new Child();
		ab.home();
		
		Aradhya ar=new Aradhya();
		//multiple inheritance
		
//		ar.home();//compile time error due to multiple inheritance 
		ar.office();
		
	}
	
	

}
