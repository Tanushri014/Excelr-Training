package day5;
import java.util.Scanner;
public class ArrayDiagonal {

	public static void main(String[] args) {
int matrix[][]=new int[4][3]; //total numbers 9
		
		Scanner sc=new Scanner(System.in);
		
		//accept the values and store in 2D array
		for(int i=0;i<matrix.length;i++)
		{
			
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.println("Enter a Number");
				matrix[i][j]=sc.nextInt();
			}
		}
		
		//display the values stored in 2D array
		for(int i=0;i<matrix.length;i++)
		{
			
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		

		//display the diagonal elements in 2D array
		System.out.println("\nDiagonal Elements are");
		for(int i=0;i<matrix.length;i++)
		{
			
			for(int j=0;j<matrix[i].length;j++)
			{
				if(i==j)
				System.out.print(matrix[i][j]+"\t");
			}
		}
		
	}

}
