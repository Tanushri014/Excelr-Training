package day6;
import java.util.Scanner;

//parent 
public class Person {
	private String name;
	private String adress;
	private int age;
	//noArgsConstructor
	Person(){
		this.name="default";
		this.adress="default";
		this.age=0;
	}
	//ALL ARGS CONSTRUCTOR 
	Person(String name,String adress,int age){
		this.name=name;
		this.adress=adress;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void acceptPerson()										    //total methods : 4
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter person name"); 
		name=sc.next();
		
		System.out.println("Please enter person age");  
		age=sc.nextInt();
		
		System.out.println("Please enter person address");  
		adress=sc.next();
	}
	
	public void displayPerson()
	{
		System.out.println("Name is "+name); 
		System.out.println("Age is "+age);  
		System.out.println("Address is "+adress);  
	}
	
	

}
