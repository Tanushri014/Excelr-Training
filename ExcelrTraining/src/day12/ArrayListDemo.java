package day12;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayListDemo {

	public static void main(String[] args) {
		//hetrogeneous arraylist without type specification
//		ArrayList a=new ArrayList();
//		a.add("neha");
//		a.add(3);
//		System.out.println(a);
//		
		
		
		//type specified arraylist 
		//maintains insertion order .
		//duplicates are allowed 
		ArrayList <String>a=new ArrayList<>();
		a.add("neha");
		a.add("mau");
//		a.add(2); //cte
		System.out.println(a);
		
		
		List <String> list1=new ArrayList(Arrays.asList("alice","neha")); 
		
		
		//add at last 
		list1.add("medha");
		
		//search in arraylist 
		String search="neha";
		
		
		//normal array logic 
		
		//for loop and search individually 
		if(list1.contains(search)) {
			System.out.println("Found");
		}
		else {
			System.out.println(" not Found");
		}

		
		int index=list1.indexOf(search);
		if(index==-1) {
			System.out.println(" not Found");
		}
		else
		{
			System.out.println(" Found at:"+ index);
		}
	}

}
