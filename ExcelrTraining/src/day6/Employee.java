package day6;
import java.util.Scanner;
public class Employee  extends Person{
	private int eno;
	private double salary;
	private String desg;
	
	Employee(){
		
	}
	

	public Employee(String name,String adress,int age,int eno, double salary, String desg) {
		super(name,adress,age);
		this.eno = eno;
		this.salary = salary;
		this.desg = desg;
	}

	public void acceptEmployee()										  //total methods : 8
	{
		super.acceptPerson();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter employee ID"); 
		eno=sc.nextInt();
		
		System.out.println("Please enter designation");  
		desg=sc.next();
		
		System.out.println("Please enter salary");  
		salary=sc.nextDouble();
	}

	public void displayEmployee()
	{
		super.displayPerson();
		System.out.println("Employee ID is "+eno); 
		System.out.println("Designation is "+desg);  
		System.out.println("Salary is "+salary);  
	}

	public static void main(String[] args) {
		
		Person p1=new Person();
		Person p2=new Person("ram","mumbai",45);
		
		p1.displayPerson();
p2.displayPerson();	

Employee e1=new Employee("ram0","pune",30,3,567.7,"pm");
e1.displayEmployee();

	}

}
