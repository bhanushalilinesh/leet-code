import java.util.Arrays;

//1929. Concatenation of Array
public class ConcatinationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
        System.out.println(Arrays.toString(getConcatenationArray(nums)));
    }

//    Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//    Specifically, ans is the concatenation of two nums arrays.
//
//    Return the array ans.

    //Normal with 2ms
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length + nums.length];
        for (int i = 0; i < ans.length; i++) {
            if (i < nums.length) {
                ans[i] = nums[i];
            }else {
                ans[i] = nums[i - nums.length];
            }
        }
        return ans;
    }

//    Faster with 0ms
    public static int[] getConcatenationArray(int[] nums) {

        int[] arr = new int[2 * nums.length];

        System.arraycopy(nums, 0, arr, 0, nums.length);
        System.arraycopy(nums, 0, arr, nums.length, nums.length);

        return arr;
    }
}
