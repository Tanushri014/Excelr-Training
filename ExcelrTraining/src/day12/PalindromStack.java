package day12;
import java.util.Stack;
public class PalindromStack {

	public static void main(String[] args) {
		
		Stack <Character> st=new Stack<>();
		String str="madam";
		int flag=0;
		for(char ch :str.toCharArray()) {
			st.push(ch);
			
		}
		
		for(char ch :str.toCharArray()) {
			if(ch !=st.pop()) {
				flag=1;
				break;
			}
			
		}
		if(flag==0) {
			
			System.out.println("String is pallindrome");
		}
		else {
			System.out.println("String is not a  pallindrome");
		}
		

	}

}
