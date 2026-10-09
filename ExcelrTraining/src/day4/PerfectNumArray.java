package day4;

public class PerfectNumArray {
public static void  main(String[]args) {
	
	

int arr[]= {23,18,6,40,28};



	for(int k=0;k<arr.length;k++) {
		int num=arr[k];
		
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
	}
	if(sum==num) {
		System.out.println(num+" is a perfect Number");
	}
	else {
		System.out.println(num+" is Not a perfect Number");
	}
	
	}
}
}
