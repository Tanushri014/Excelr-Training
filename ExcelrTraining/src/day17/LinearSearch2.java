package day17;

public class LinearSearch2 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int search=3;
		int flag=0;
		for(int n:arr) {
			if(n==search) {
				System.out.println("Found");
				flag=1;
				break;
			}
			
		}
		if(flag==0) {
			System.out.println("Not Found");
		}

	}

}
