package day12;

import java.util.HashSet;
import java.util.Set;

public class HashSetFunction {

	public static void main(String[] args) {
		
		char ch=FindFirst("Rajesh");
		
		System.out.println(ch=='0'?"No repeated char":ch);
		
	}
	private  static char FindFirst(String name) {
		Set<Character> hashSet=new HashSet<>();
		for(char ch :name.toCharArray()) {
			
			if(hashSet.contains(ch)) {
				return ch;	
			}				
	}
		return '0';
	
	}

}
