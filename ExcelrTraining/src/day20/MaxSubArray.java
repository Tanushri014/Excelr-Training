package day20;

public class MaxSubArray {


public static void main(String[] args) {

    int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

    int maxSum = findMaxSum(nums);

    System.out.println(maxSum);
}

private static int findMaxSum(int nums[]) {

    int currentSum = 0;
    int maxSum = nums[0];

    for (int i = 0; i < nums.length; i++) {

        currentSum += nums[i];

        maxSum = Math.max(maxSum, currentSum);

        if (currentSum < 0) {
            currentSum = 0;
        }
    }

    return maxSum;
}


}
