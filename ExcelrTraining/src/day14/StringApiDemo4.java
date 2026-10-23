package day14;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
public class StringApiDemo4 {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		List<Employee> employees=null;
        try {
            employees = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	   //absolute path
                new File("data/employee.json"),									  //relative path
                new TypeReference<List<Employee>>() {}
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
		
//		for(Employee emp:employees)
//		System.out.println(emp);
//		
		
		//find the employee  working in it 
		List<Employee> emp=employees.stream().filter(e->e.getDepartment().equalsIgnoreCase("it")).toList();
		System.out.println(emp);
		for(Employee e:emp) {
			System.out.println(e);
		}

		
		//it departement names
		employees.stream().filter(StringApiDemo4::checkDept).map(ek->ek.getName()).map(String::toUpperCase).forEach(System.out::println);
		
		
		
		System.out.println("Salary");
		employees.stream().filter(e->e.getSalary()>2000).forEach(e->System.out.println(e.getName()));
		
		
		
	
	}
	public static boolean checkDept(Employee e) {
		if (e.getDepartment().equalsIgnoreCase("it")) {
			return true;
		}
		else {
			return false;
		}
	}

}
