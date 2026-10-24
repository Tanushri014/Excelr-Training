package day17;

public class LinearSearch3 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int search=3;
		int ans=search(arr,search);
		
		System.out.println(ans==-1?"Not Found":"Element is Found at :"+ans);
		
	}
	public static  int search(int arr[],int n) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				
				return i;
				
			}
		}
		return -1;
	}

}
