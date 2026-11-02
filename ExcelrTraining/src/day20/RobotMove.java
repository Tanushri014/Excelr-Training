package day20;

public class RobotMove {

	public static void main(String[] args) {
		int rows=4;
		int columns=3;
		int no_of_paths=pathCalculation(rows,columns);
		System.out.println(no_of_paths);
	}
private static  int pathCalculation(int rows,int columns) {
	int arr2d[][]=new int[rows][columns];
	//fill first row with 1
	for(int i=0;i<columns;i++) {
		arr2d[0][i]=1;
	}
	//fill first columns with 1
		for(int i=0;i<rows;i++) {
			arr2d[i][0]=1;
		}
	for(int i=1;i<rows;i++) {
		
		for(int j=1;j<columns;j++) {
			
			arr2d[i][j]=arr2d[i][j-1]+arr2d[i-1][j];	
		}
	}
	return arr2d[rows-1][columns-1];
}
}
