import java.util.Arrays;

//1480. Running Sum of 1d Array
public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
//    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//    Return the running sum of nums.
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }
        return ans;
    }
}
