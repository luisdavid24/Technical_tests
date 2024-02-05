import java.util.HashMap;

public class twoSum {

    public static void main(String[] args) {
        SolutionTwoSum elementTwoSum = new SolutionTwoSum();
        int[] vector={2,7,11,15};
        int[] solutionTwoSum=elementTwoSum.twoSum(vector,9);
        for(int e: solutionTwoSum){
            System.out.println(e);
        }
    }
}

class SolutionTwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }

            numMap.put(nums[i], i);
        }

        return new int[0];

    }

}



/*


    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.



        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]
 */