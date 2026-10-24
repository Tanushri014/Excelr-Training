package day17;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your target:");
		int target=sc.nextInt();
		
		int arr[]= {100,200,500,300,1000,200,800};
		
		int ans=search(arr,target);
		
		System.out.println(ans==-1?"Target is not achieved":"Target is achived on day :"+ans);
		
	}
	public static  int search(int arr[],int n) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum==n) {
				return i;
				
			}
		}
		return -1;
	}

}

