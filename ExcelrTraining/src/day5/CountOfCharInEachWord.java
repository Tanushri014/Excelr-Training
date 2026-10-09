package day5;

public class CountOfCharInEachWord {

	public static void main(String[] args) {
		String sentance="one five three";	

String words[]=sentance.split(" ");		
		
		
	
		
		
		for(int i=0;i<words.length;i++)
		{
			System.out.println("Word is : "+words[i] +" No.of Char are : "+ words[i].length());
		}
		

	}

}
