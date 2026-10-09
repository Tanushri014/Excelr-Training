package day5;

public class CountNoOfWords {
//no of words in senetence = no of spaces +1
	public static void main(String[] args) {
		String name="Mahendra Singh Dhoni";
		int count=1;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("Number of words in given sentence are:"+count);

	}

}
