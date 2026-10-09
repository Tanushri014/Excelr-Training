package day4;



public class PrimeNumberArray {

	public static void main(String[] args) {
		
		
		int arr[]= {10,11,3,40};
		
		for(int i=0;i<arr.length;i++) {
			
			int num=arr[i];
			int flag=0;
			for(int j=2;j<Math.sqrt(num);j++) {
				if(num%j==0) {
					flag=1;
					break;
					
				}
			}
			if(flag==0) {
				System.out.println(num);
			}
		}
		

	}

}
