//1512. Number of Good Pairs
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
        System.out.println(numIdenticalPairs1(nums));
    }

    /*
    Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
     */

    //1ms 87.24%
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < (nums.length - 1); i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int numIdenticalPairs1(int[] nums) {
        int count = 0;
        int[] guests = new int[101];
        for (int num : nums) {
            count += guests[num];
            guests[num]++;
        }
        return count;
    }
}
