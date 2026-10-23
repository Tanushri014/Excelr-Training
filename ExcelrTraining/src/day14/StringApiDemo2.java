package day14;

import java.util.Arrays;
import java.util.List;

public class StringApiDemo2 {

	public static void main(String[] args) {
		List <String> months=Arrays.asList("January","February","March","April","May","June","July","August","September","Octomber","November","December");
		
		//store the length of the months 
List <Integer> list=months.stream().map(m->m.length()).toList();
	System.out.println(list);
	
	//print the months  having length greater than 5
	months.stream().filter(m->m.length()>5).forEach(m->System.out.println(m));
	
	}

}
