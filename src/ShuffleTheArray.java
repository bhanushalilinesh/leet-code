import java.util.Arrays;

//1470. Shuffle the Array
public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        int n = 2;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

 */
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int answerIndex = 0;
        for (int i = 0; i < n; i++) {
            ans[answerIndex] = nums[i];
            answerIndex++;
            ans[answerIndex] = nums[n + i];
            answerIndex++;
        }
        return ans;
    }
}
