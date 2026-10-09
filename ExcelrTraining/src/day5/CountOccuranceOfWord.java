package day5;

public class CountOccuranceOfWord {

	public static void main(String[] args) {
		String sentance="one two one three four one five one six one seven";	

		String search="one";
String words[]=sentance.split(" ");		
		
		
		int count=0; 
		
		
		for(int i=0;i<words.length;i++)
		{
		if(words[i].equals(search)) {
			count ++;
		}
		}
		System.out.print(count);

	}

}
