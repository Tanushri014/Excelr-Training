package day20;

public class MaxStairs {

	public static void main(String[] args) {
		int no_of_stairs=4;
		int steps=maxSteps(no_of_stairs);
		System.out.println(steps);
	}
	private static int maxSteps(int no_of_stairs) {
		if (no_of_stairs <= 2) return no_of_stairs;
		int dp[]=new int[no_of_stairs+1];
		dp[1]=1;
		dp[2]=2;
for(int i=3;i<=no_of_stairs;i++) {		
	dp[i]=dp[i-1]+dp[i-2];
	
}
return dp[no_of_stairs];
	}

}
