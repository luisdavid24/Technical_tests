public class RegularExpressionMatching {

    public static void main(String[] args) {
        SolRegularExpressionMatching element= new SolRegularExpressionMatching();
        String s="a",p="d";


        System.out.println(element.isMatch(s,p));
    }
}


class SolRegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        
        if(p.indexOf(".")!=-1){
            System.out.println("Se encontro: .");
        }
        if(p.indexOf("*")!=-1){
            System.out.println("Se encontro: *");
        }

        return true;
    }
}

/*
Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.​​​​
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).



Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
Example 2:

Input: s = "aa", p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
Example 3:

Input: s = "ab", p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".


Constraints:

1 <= s.length <= 20
1 <= p.length <= 20
s contains only lowercase English letters.
p contains only lowercase English letters, '.', and '*'.
It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.
 */