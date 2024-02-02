import java.util.Stack;

public class dailyTemperatures {

    public static void main(String[] args) {
        int[] vector= {73,74,75,71,69,72,76,73};
        SolutionTwoSum solu= new SolutionTwoSum();
        int[] vectorSolu=solu.dailyTemperatures(vector);
        for(int element: vectorSolu){
            System.out.print(element+" ");
        }


    }
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }

        return result;
    }
}


/*
Given an array of integers temperatures represents the daily temperatures,
return an array answer such that answer[i] is the number of days you have to wait after
the ith day to get a warmer temperature.
If there is no future day for which this is possible, keep answer[i] == 0 instead.


Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]



*/