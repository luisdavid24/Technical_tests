public class PalindromeNumber {

    public static void main(String[] args) {
        SolutionPalindromeNumber element= new SolutionPalindromeNumber();
        int number=12345;
        System.out.println( element.isPalindrome(number));
    }
}

class SolutionPalindromeNumber {
    public boolean isPalindrome(int x) {
        String numberString = Integer.toString(x);
        char[] vector=numberString.toCharArray();
        int i=0,j=vector.length-1;
        while(i<=vector.length/2 && j>=vector.length/2){
            System.out.println(vector[i]+" "+vector[j]);
            if(vector[i] != vector[j]){
                return false;
            }
            i++;
            j--;
        }



        return true;
    }
}


/*
Given an integer x, return true if x is a
palindrome
, and false otherwise.



Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
 */