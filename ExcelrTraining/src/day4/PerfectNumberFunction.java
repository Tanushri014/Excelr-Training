package day4;

public class PerfectNumberFunction {

	public static void main(String[] args) {
		int arr[]= {23,18,6,40,28};
		for(int i=0;i<arr.length;i++) {
			
			boolean ans=isPerfect(arr[i]);
			if(ans==true) {
				System.out.println(arr[i] +"is perfect");
			}
			else {
				System.out.println(arr[i] +"is not  perfect");
			}
		}

	}
	//using function
	public static boolean isPerfect(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
	}
	return sum==num;
		
	}

}
