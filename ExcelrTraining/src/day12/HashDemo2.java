package day12;


import java.util.HashSet;
import java.util.Set;

public class HashDemo2 {

	//first repeted character in string 
	public static void main(String[] args) {
		Set<String> s1=new HashSet<>();
		
		String name="ViratKohli";
		Set<Character> hashSet=new HashSet<>();
		for(char ch :name.toCharArray()) {
			
			if(hashSet.contains(ch)) {
				System.out.println("First char :"+ch);
				break;
				
			}
			else {
				hashSet.add(ch);
			}
		}
		

	}

}
