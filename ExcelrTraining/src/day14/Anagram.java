package day14;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	
String s1="listen";
String s2="silent";

String s3=getSortedString(s1);
String s4=getSortedString(s2);

if(s3.equals(s4)){
	System.out.println("Angrams");
}
else {
	System.out.println(" Not Angrams");
}
	}
	public static String  getSortedString(String str) {
		char arr1[]=str.toCharArray();
		
		Arrays.sort(arr1);
		
		String s3=new String(arr1);
		
		return s3;
	}

}
