import java.util.ArrayList;
import java.util.List;

//1431. Kids With the Greatest Number of Candies
public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    /*
    There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.
     */
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = maxCandies(candies);
        List<Boolean> ans = new ArrayList<>();
        for (int candy : candies) {
            ans.add((candy + extraCandies) >= max);
        }
        return ans;
    }

    public static int maxCandies(int[] candies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        return max;
    }
}
