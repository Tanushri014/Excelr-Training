package day5;

public class Array2D {

	public static void main(String[] args) {
		
		//defining two d array 
//		int arr[][]=new int[3][3];
		
		int arr[][]= {{10,20,30},{40,50,60}};
		
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			System.out.println();
			
			for(int j=0;j<arr[i].length;j++) {
				
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
				
			}
			System.out.print("For :"+ i + " th row max is: "+ max);
		}
			
		//find the max element in each row 
		
		}
	}


