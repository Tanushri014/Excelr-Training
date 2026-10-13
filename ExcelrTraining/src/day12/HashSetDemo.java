package day12;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
		//unique elements only 
		Set<Integer> s1=new HashSet<>(Arrays.asList(1,2,3,4,5));
		Set<Integer> s2=new HashSet<>(Arrays.asList(4,5,6,7,8));
		
		
		//union 
//		s1.addAll(s2);
//		System.out.println(s1);
		
		//retain 
		s1.retainAll(s2);
		System.out.println(s1);
		
		

	}

}
