package day20;

public class RobersMaxLoot {

	public static void main(String[] args) {
		int houses[]= {4,5,8,16,3};
		int max_loot=CalculateLoot(houses);
		System.out.println(max_loot);

	}
	private static int CalculateLoot(int []houses) {
		int dp[]=new int[houses.length];
		dp[0]=houses[0];
		dp[1]=Math.max(houses[0],houses[1]);
		for(int i=2;i<houses.length;i++) {
			int take=houses[i]+dp[i-2];
			int leave=dp[i-1];
			dp[i]=Math.max(take,leave);
		}
		return dp[dp.length-1];
	}

}
