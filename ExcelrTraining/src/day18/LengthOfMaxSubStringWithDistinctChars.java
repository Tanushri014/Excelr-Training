package day18;

import java.util.HashSet;
import java.util.Set;

public class LengthOfMaxSubStringWithDistinctChars {

	public static void main(String[] args) {
	//              l
	//			      r
	String str="abcbbcbdab";
	int max=findMaxSubString(str);
	System.out.println(max);
	}

	private static int findMaxSubString(String str) {
		
		int left=0;
		int max=0;
		Set<Character> hashSet=new HashSet();
		for(int right=0;right<str.length();right++) {
			while(hashSet.contains(str.charAt(right))) {
				hashSet.remove(str.charAt(left));
				left++;
			}
			hashSet.add(str.charAt(right));
			int dist=(right-left)+1;
			max=Math.max(max, dist);
			
			
		}
		return max;
	}
		
	
}