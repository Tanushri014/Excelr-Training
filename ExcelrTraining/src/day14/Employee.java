package day14;

public class Employee {

	private int id;
	private String month;
	private int age;
	private String gender ;
	private String sector ;
	private int year;
	private double salary;
	
	public Employee() {
		
	}
	public Employee(int id, String month, int age, String gender, String sector, int year, double salary) {
		super();
		this.id = id;
		this.month = month;
		this.age = age;
		this.gender = gender;
		this.sector = sector;
		this.year = year;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
