package day21;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringFrequency {

	public static void main(String[] args) {
		String str="aaaabbbccd";
		//write a function which counts the occurence of distinct characters and create a new characters 
		//result a4b3c2d1
		//so here we are dealing with character and frequency so we are going to use 
		
		
		//base cases for strings 
		//remove spaces in between leading and trailing spaces 
		//look for  null string 
		if(str==null ||str.trim().length()==0) {
			System.out.println("Invalid Input");
		}
		else {
			str=str.strip().replace("\\s","" );
			String result=StringFrequency(str);
			System.out.println(result);
		}
		

	}
	private  static String  StringFrequency(String str) {
		//here we need to maintain order so we are going to use the linkedhashmap
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(char ch:str.toCharArray()) {
			map.put(ch,map.getOrDefault(ch,0)+1);	
		}
		System.out.println(map);
		
		//build string from map
		StringBuilder sb=new StringBuilder();
		for(Entry<Character, Integer> entry:map.entrySet()) {
			sb.append(entry.getKey());
			sb.append(entry.getValue());
			
		}
		
		
		
		
		return sb.toString();
	}

}
